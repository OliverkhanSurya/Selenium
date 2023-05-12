package Batch7pm.SeleniumProject7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();

		driver.findElement(By.xpath("//*[text()='click the button to display a confirm box ']")).click();

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();

		alert.dismiss();

		driver.findElement(By.xpath("//a[@href = '#Textbox']")).click();

		driver.findElement(By.xpath("//*[@onclick='promptbox()']")).click();

		String promptText = alert.getText();

		System.out.println(promptText);

		alert.sendKeys("Hellooo WOrld ");

		Thread.sleep(2000);

		alert.accept();

	}

}
