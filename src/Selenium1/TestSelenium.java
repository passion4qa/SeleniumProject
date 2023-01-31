package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSelenium {
	WebDriver driver;// declare global variable so that it is accessible to within the class.
	SoftAssert obj; // so that we can use softassert inside whole class.
	@BeforeSuite
	public void driversetup() {
	System.setProperty("webdriver.chromedriver", "chromedriver.exe");
	}

	/*
	 * @BeforeTest 
	 * public void intialsetup() 
	 * { driver= new ChromeDriver();
	 * driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	 */
	//}
	@BeforeMethod
	public void before() {
		driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("https://www.google.ca/");
	    obj=new SoftAssert();
	    
	}
		@Test(priority=1,groups="title")
		public void gettitle() {
		String title=	driver.getTitle();
		System.out.println(title);
		
		//Assert.assertEquals(title, "yahoo");// hard assertion within this testcase only
		obj.assertEquals(title, "yahoo"); // soft assert globally
		}
		@Test(priority=2,groups="verification",dependsOnMethods= {"gettitle"})// display is dependent of gettitle, 
																			
		//ie gettile has to pass so that display works
		public void display() {
			Boolean a=driver.findElement(By.linkText("Gmail")).isDisplayed();
			System.out.println(a);
			
		}
		@AfterMethod
		public void aftermethod () {
			driver.close();
			
	}

}
