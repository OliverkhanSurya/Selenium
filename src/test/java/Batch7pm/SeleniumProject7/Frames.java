package Batch7pm.SeleniumProject7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.switchTo().frame("singleframe");

		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Hello Everyone");

		// driver.switchTo().parentFrame();

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

		WebElement nestedIframe = driver
				.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));

		driver.switchTo().frame(nestedIframe);

		WebElement iframeDemo = driver.findElement(
				By.cssSelector("iframe[src='SingleFrame.html'][style='float: left;height: 250px;width: 400px']"));

		driver.switchTo().frame(iframeDemo);

		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Program Success !!");
	}

}
