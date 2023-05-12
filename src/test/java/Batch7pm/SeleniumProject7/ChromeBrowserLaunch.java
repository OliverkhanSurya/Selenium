package Batch7pm.SeleniumProject7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserLaunch {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.youtube.com");

		String appAddress = driver.getCurrentUrl();

		System.out.println(appAddress);

		if (appAddress.equalsIgnoreCase("https://www.youtube.com/")) {
			System.out.println("Valid URL -> Test Case Passed");
		} else {
			System.out.println("Invalid Url -> Test case failed");
		}

		String appTitle = driver.getTitle();
		System.out.println(appTitle);

	}

}
