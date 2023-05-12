package Batch7pm.SeleniumProject7;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hdfcbank.com/");

		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();

		List<WebElement> options = driver.findElements(By.cssSelector(".dropdown1>li"));
		System.out.println("Number of options in first dropdown: " + options.size());
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());

			if (options.get(i).getText().contains("Loans")) {
				options.get(i).click();
				break;
			}
		}

		driver.findElement(By.xpath("//a[text()='Select Product']")).click();
		List<WebElement> products = driver.findElements(By.cssSelector(".dropdown2>li"));
		for (WebElement product : products) {
			if (product.getText().equals("Gold Loan")) {
				product.click();
				break;
			}
		}
	}

}
