package Batch7pm.SeleniumProject7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadPropertyFile {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileReader file = new FileReader(
				"C:\\Users\\THIS PC\\eclipse-workspace\\SeleniumProject7\\src\\main\\java\\config\\properties\\TestData.properties");

		prop.load(file);

		String browserName = prop.getProperty("browser");

		System.out.println("Browser choosen : " + browserName);

		String urlAddress = prop.getProperty("url");
		System.out.println(urlAddress);

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		} else {
			System.out.println("Please choose either chrome or Edge");
		}

		driver.get(urlAddress);
	}

}
