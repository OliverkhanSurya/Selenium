package Batch7pm.SeleniumProject7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	static WebDriver driver;

	public static void screenshotMethod() throws IOException {
		TakesScreenshot tks = (TakesScreenshot) driver;
		File tempFile = tks.getScreenshotAs(OutputType.FILE);

		File permFile = new File("C:\\Users\\THIS PC\\eclipse-workspace\\SeleniumProject7\\Screenshots\\ proof2.png");

		//FileUtils.copyFile(tempFile, permFile);
		FileUtils.copyFile(tempFile, permFile);

	}

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/chennai");
		ScreenShot.screenshotMethod();

	}

}
