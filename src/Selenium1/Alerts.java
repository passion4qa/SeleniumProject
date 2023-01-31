package Selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		//Step 1 open browser google chrome 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		// step 2 type url of roician contact us page
		//in order to use method of any class we need to create its object
		
		ChromeDriver  driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Alert popup=driver.switchTo().alert();// move to alert/popup as findElement finds on current page.
		// 2 methods used with alert :- accept like ok and dismiss => cancel
		Thread.sleep(5000);// Hard or Static Wait...
		popup.accept();//ok
		//popup.dismiss();// cancel
		

	}

}
