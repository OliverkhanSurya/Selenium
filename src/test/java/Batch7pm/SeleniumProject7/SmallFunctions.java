package Batch7pm.SeleniumProject7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmallFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://practice.automationtesting.in/");

		WebElement emailTxtBox = driver.findElement(By.name("EMAIL"));

		boolean enabledStatus = emailTxtBox.isEnabled();
		System.out.println("Status : " + enabledStatus);

		if (enabledStatus == true) {
			emailTxtBox.clear();
			emailTxtBox.sendKeys("Oraniumtech@gmail.com");

		} else {
			System.out.println("Error, The Textbox is disabled");
		}

		boolean displayedMsg = emailTxtBox.isDisplayed();
		System.out.println(displayedMsg);

		boolean selected = emailTxtBox.isSelected();
		System.out.println(selected);

	}

}
