package Batch7pm.SeleniumProject7;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");

		String parentWindow = driver.getWindowHandle();
		Thread.sleep(5000);

		// WebElement firstOption = driver.findElement(By.xpath("//button[text()='click'
		// and @onclick='newwindow()' ] "));
		// firstOption.click();

		driver.findElement(By.cssSelector("a[href='#Seperate']")).click();

		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();

		Set<String> multiWindows = driver.getWindowHandles();
		for (String newWindow : multiWindows) {
			if (parentWindow != newWindow) {
				driver.switchTo().window(newWindow);
			}
		}

		driver.findElement(By.cssSelector("a[href='/downloads']")).click();

		// driver.close();

		// driver.quit();

		driver.switchTo().window(parentWindow);

		driver.findElement(By.cssSelector("a[href='#Multiple']")).click();

		driver.findElement(By.cssSelector("button[onclick='multiwindow()']")).click();

		Set<String> secondMultiWindows = driver.getWindowHandles();

		driver.findElement(By.id("btn2")).click();

	}

}
