package Batch7pm.SeleniumProject7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> offers = driver.findElements(By.xpath("//h2[contains(@class,'a-color-base')]"));
		for(WebElement offerList:offers)
		{
			System.out.println(offerList.getText());
		}

	}

}
