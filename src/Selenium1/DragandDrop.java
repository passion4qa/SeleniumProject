package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
	
		//Step 1 open browser google chrome 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		// step 2 type url of roician contact us page
		//in order to use method of any class we need to create its object
		
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		Actions abc=new Actions(driver);
		abc.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		

	}

}
