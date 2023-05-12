package Batch7pm.SeleniumProject7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBasedPopUpFileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/input-type-file/");

		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\THIS PC\\Downloads\\jenkins_initial_setup.docx");

	}

}
