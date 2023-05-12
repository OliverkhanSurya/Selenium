package Batch7pm.SeleniumProject7;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class browsertest {
	public static void main(String[] args) throws InterruptedException {

		//ChromeDriver driver = new ChromeDriver();
		 EdgeDriver driver = new EdgeDriver();

		// FirefoxDriver driver = new FirefoxDriver();
		// SafariDriver driver = new SafariDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.get("https://www.amazon.in/");
		driver.get("https://www.facebook.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		driver.navigate().to("https://www.instagram.com/");

		
		
		
		

		Thread.sleep(3000);

		driver.close();

	}
}
