package Batch7pm.SeleniumProject7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");

		/*
		 * driver.findElement(By.id("alertButton")).click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.switchTo().alert().accept();
		 * 
		 * driver.findElement(By.id("timerAlertButton")).click();
		 * 
		 * Thread.sleep(7000);
		 * 
		 * driver.switchTo().alert().accept();
		 */
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='confirmButton' and contains(@class,'btn btn-primary') ]")).click();

		driver.switchTo().alert().dismiss();

		String alertMsg = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();

		System.out.println(alertMsg);
	}

}
