package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verificationcommands {

	public static void main(String[] args) {
		// Step 1 open browser google chrome
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// step 2 type url of roician contact us page
		// in order to use method of any class we need to create its object

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");// we are checking if gmail link is displayed or not
		Boolean result = driver.findElement(By.linkText("Gmail")).isDisplayed();
		Boolean resultenabled = driver.findElement(By.linkText("Gmail")).isEnabled();// whether the links active or not
		Boolean resultlinktextenabled = driver.findElement(By.linkText("Gmail")).isEnabled();// with css selector // remember with class name its .classname 
																					//and id  xyz it become #xyz
		Boolean resultcssselectorenabled = driver.findElement(By.cssSelector(".gb_j")).isEnabled();
		
		System.out.println(result);
		System.out.println(resultenabled);
		System.out.println(resultlinktextenabled);
		System.out.println(resultcssselectorenabled);
		// full x path (/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/a)
		// customized x path right click copy=> copy xpath 
		//     //*[@id="gb"]/div/div[1]/div/div[1]/a (relative xpath Starts with double slash.
	}

}
