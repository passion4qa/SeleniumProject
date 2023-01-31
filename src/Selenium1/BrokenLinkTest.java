package Selenium1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// step 2 type url of roician contact us page
		// in order to use method of any class we need to create its object

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://makemysushi.com/");

		// Links-- // a href<www.google.ca>
		// Image --> Tag -> img href <www.gmail.com>
		// step1 Getting all the links and images on the webpage
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));// now linklist will have all the list of images and
		// links

		// get the size of all links and images
		System.out.println("size of active links and images --->" + linkslist.size());

		// for active links i.e. having href tag

		List<WebElement> activeLinks = new ArrayList<WebElement>(); // create a arraylist object
		// step 2 Iterate the linkslist by using for loop:exclude all the links or
		// images which does not have any href attributes

		for (int i = 0; i < linkslist.size(); i++) {
			System.out.println(linkslist.get(i).getAttribute("href"));
			if (linkslist.get(i).getAttribute("href") != null && !( linkslist.get(i).getAttribute("href").contains("javascript")))// i is the first element
			{
				activeLinks.add(linkslist.get(i));

			}
		}
		// get the size of active link links
		System.out.println("size of active links and images --->" + activeLinks.size());

//3. check the href url with httpconnection api (check if the link is correct  or not

		for (int j = 0; j < activeLinks.size(); j++) {
HttpURLConnection connection=(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
connection.connect();
String response=connection.getResponseMessage();// this will tell the linksa are fine it return ok

// 200 ok  400 bad request 500 internal error  400 bad request.
// 404 not found 
connection.disconnect();// disconnect the connection
System.out.println(activeLinks.get(j).getAttribute("href")+ ".....>" + response);
driver.close();
		}

	}
}
