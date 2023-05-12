package Batch7pm.SeleniumProject7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> tHeadings = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		for (WebElement th : tHeadings) {
			System.out.println(th.getText());
		}
		System.out.println("____________________________________________");

		List<WebElement> tDatas = driver.findElements(By.xpath("//table[@id='customers']//td"));
		for (WebElement td : tDatas) {
			System.out.println(td.getText());
		}

		System.out.println("____________________________________________");

		List<WebElement> entireDatas = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		for (WebElement e : entireDatas) {
			System.out.println(e.getText());
		}
		System.out.println("____________________________________________");

		driver.close();
	}

}
