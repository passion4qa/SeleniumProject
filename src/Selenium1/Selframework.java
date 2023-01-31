package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Selframework {
	WebDriver driver;

	@BeforeSuite
	public void driversetup() {
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
	}

	@BeforeMethod
	public void before() {
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("https://www.google.ca/");
	}

	@Test
	public void Display() {
		driver.findElement(By.cssSelector(
				"body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input"))
				.sendKeys("Roicians");//  code element locater(By.cssSelector) with value "xxxx" amd roician is my data 
	}

	@Test
	public void Title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@AfterMethod
	public void aftermethod() {
		driver.close();
	}

}
