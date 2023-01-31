package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String[] args) {
		//Step 1 open browser google chrome 
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
	// step 2 type url of roician contact us page
	//in order to use method of any class we need to create its object
	
	ChromeDriver  driver = new ChromeDriver();
	driver.get("https://www.roicians.com/contact-us/");
	
	// step 3 navigate to first name edit box and type text between 4-10 charaters
	driver.findElement(By.id("text-77525447616")).sendKeys("Manish");
	

	}

}
