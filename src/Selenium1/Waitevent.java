package Selenium1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitevent {

	public static void main(String[] args) {
		// Step 1 open browser google chrome
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// step 2 type url of roician contact us page
		// in order to use method of any class we need to create its object

		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.roicians.com/contact-us/");
		
		driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS); // you are giving 5000 seconds  for a page 
																		//to get  loaded
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// you are giving 20 seconds for 
		                                                              // all elements in the page to get loaded
		
		// explicit wait for a particular element
		WebDriverWait wait =new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("text-77525447616")));
		
		// hard wait
		Thread.sleep(5000);
	}

}
