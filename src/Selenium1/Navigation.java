package Selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		
		//Step 1 open browser google chrome 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		// step 2 type url of roician contact us page
		//in order to use method of any class we need to create its object
		
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.roicians.com/contact-us/");
		
		Thread.sleep(5000); // static wait for delay in page load
		
		driver.navigate().to("https://www.google.ca/"); // now navigate to google.ca
		Thread.sleep(5000); // static wait for delay in page load
		
		driver.navigate().back(); //  back to roicians
		Thread.sleep(5000); // static wait for delay in page load
		
		driver.navigate().forward(); // back to google .ca
		
		 driver.navigate().refresh(); // refresh the webpage
		 
		 driver.close(); // closes the current window
		 
		 driver.quit(); // closes all windows
		
		
		
		
		

	}

}
