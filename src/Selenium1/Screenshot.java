package Selenium1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		//Step 1 open browser google chrome 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		// step 2 type url of roician contact us page
		//in order to use method of any class we need to create its object
		
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.roicians.com");
		
 File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(srcfile, new File("C:\\screenshotroicions.jpg"));
 // File is  Predefined  Java class whose methods are used to create a file in the local OS.

	}
	// need to download (search for common ios apache go to binarys => download now and copy the jar file 
	//see the screen shot videos

}
