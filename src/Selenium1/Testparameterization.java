package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testparameterization {
	
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
	
	@DataProvider(name="getdata")
	public Object [][] search(){
		return new  Object [][] {{"Roicians"},{"Roicians Automation Testing"},{"RoiciansQA"}};
		
	}
	@Test(dataProvider="getdata")
	public void display(String Keywords) throws InterruptedException {
		driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")).sendKeys(Keywords);
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void aftermethod () {
		driver.close();
		
}
}
