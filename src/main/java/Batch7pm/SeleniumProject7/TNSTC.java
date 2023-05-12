package Batch7pm.SeleniumProject7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TNSTC {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.tnstc.in/home.html");
		List<WebElement> TNSTC=driver.findElements(By.xpath("(//table[@align=\"center\"])[position()=5]//td[@background=\"images/td_bg.jpg\"]//tr"));
        for(WebElement TV:TNSTC) {
		System.out.println(TV.getText());
        }
	}

}
