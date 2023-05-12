package Batch7pm.SeleniumProject7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRelatedActions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://demoqa.com/droppable/");

		WebElement dragMe = driver.findElement(By.id("draggable"));
	

		WebElement dropHere = driver.findElement(By.id("droppable"));

		Actions builder = new Actions(driver);

		builder.clickAndHold(dragMe).moveToElement(dropHere).release().perform();

		driver.navigate().refresh();

		builder.dragAndDrop(dragMe, dropHere).perform();

	}

}
