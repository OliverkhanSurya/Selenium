package Batch7pm.SeleniumProject7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scroll(0,5000)");
		Thread.sleep(2000);

		jse.executeScript("window.scroll(0,-5000)");
		Thread.sleep(2000);
		jse.executeScript("window.scroll(0, document.body.scrollHeight)");
		Thread.sleep(3000);

		WebElement footerLandMark = driver.findElement(By.xpath("//a[text() ='Conditions of Use & Sale']"));

		jse.executeScript("arguments[0].scrollIntoView(true)", footerLandMark);

		Thread.sleep(2000);

		jse.executeScript("window.scroll(0,0)");

	}

}
