package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		//Step 1 open browser google chrome 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		// step 2 type url of roician contact us page
		//in order to use method of any class we need to create its object
		
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.roicians.com/career/");
		
		Select obj=new Select(driver.findElement(By.id("field-jHhehcNamzHL47m")));// select class
		
		//obj.selectByVisibleText("QA Trainer");  // 1st method ByVisibletext
		obj.selectByValue("QA Trainer");// 2nd method select By Value
	
		obj.selectByIndex(7); // by index
		

	}

}
