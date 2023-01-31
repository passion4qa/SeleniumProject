package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadingtextfile {

	public static void main(String[] args) {
		// Step 1 open browser google chrome
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// step 2 type url of roician contact us page
		// in order to use method of any class we need to create its object

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.roicians.com/career/");
		driver.findElement(By.id("field-U7H2lPxWxSPqWeq")).sendKeys("C:\\Users\\manis\\Desktop\\Roicions\\dummy.txt");
	}

}
