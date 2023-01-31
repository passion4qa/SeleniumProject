package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		//Step 1 open browser google chrome 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		// step 2 type url of roician contact us page
		//in order to use method of any class we need to create its object
		
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.roicians.com/");
		//Actions class is predefined and is used for MOUSE MOVEMENT 
		// We need to create the action class object
		
		Actions action = new Actions(driver); // to perform action ont browser we need to pass the 
		                                     // reference variable of the browser i.e driver to the Actions class
		
		action.moveToElement(driver.findElement(By.cssSelector("#menu-item-65 > a"))).build().perform(); // to move to  element "COURSES"
		                                                                               // build. perform is needed to release the mouse (must)
		// now going to the sublist " Automation Testing"
		driver.findElement(By.partialLinkText("AUTOMATION TE")).click();
				driver.close();
		

	}

}
