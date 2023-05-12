package Batch7pm.SeleniumProject7;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLaunch extends ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		

		WebElement emailtxtbox = driver.findElement(By.id("email"));
		emailtxtbox.sendKeys("Oraniumtech@gmail.com");

		WebElement passwordTxtBox = driver.findElement(By.name("pass"));
		passwordTxtBox.sendKeys("123456789");

		// driver.findElement(By.tagName("button")).click();

		// driver.findElement(By.className("_42ft")).click();

		// driver.findElement(By.linkText("Forgotten password?")).click();

		// driver.findElement(By.partialLinkText("Forgotten")).click();

		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();

		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement dropdown1 = driver.findElement(By.id("day"));

		Select s1 = new Select(dropdown1);
		s1.selectByIndex(12);

		WebElement dropdown2 = driver.findElement(By.name("birthday_month"));

		Select s2 = new Select(dropdown2);
		s2.selectByValue("8");

		WebElement dropdown3 = driver.findElement(By.cssSelector("select[title='Year']"));

		Select s3 = new Select(dropdown3);
		s3.selectByVisibleText("2018");
		
		ScreenShot.screenshotMethod();

	}

}
