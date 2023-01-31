package Selenium1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testnew {
	// step 1 system.setproperty(location of driver)
	// step2 get url
	// step 3 Perform action on particular element
	// step 4 close browser

	// STLC 1. write testcase, execute test cases, log defect

	// executionn is as per alphabetic order

	@BeforeSuite // execute only once in the beginning eg system.set property setting location of
					// drivers.
	public void beforesuit() {
		System.out.println("Before Suite");
	}

	@BeforeTest // This will also be executed once before the first Method.
	// This is set up the initial data or command for your all test cases.
	// Webdriver driver =new Firefoxdriver(),
	// Implicit (wait) ,pagetimeout, maximized, minimized

	public void beforetest() {
		System.out.println("Before Test");
	}

	@BeforeClass // It will be execute BEFORE the First Method Eg first you need to login details
	public void beforeclass() {
		System.out.println("Before Class");
	}

	@BeforeMethod // It will be Executed before EVERY TEST CASE (REPEATED) eg passing url of
					// opening the web page
	public void beforemethod() {
		System.out.println("Before method");
	}

	@Test(priority = 1)
	public void Writetestcases() {
		System.out.println("First write Test Cases");
	}

	@Test(priority = 2)
	public void Executetestcase() {
		System.out.println("Then execute test case");
	}

	@Test(priority = 3)
	public void Defect() {
		System.out.println("Log defect");
	}

	@AfterMethod
	public void Aftermethod() {
		System.out.println("After method");
	}

	@AfterMethod  //close browser it will be executed after every test case
	public void aftermethod() {
		System.out.println("After method");
	}

	@AfterClass  // executes only once after all test case are executed eg logout 
	public void afterclass() {
		System.out.println("After class");
	}

	@AfterTest // will be executed once after class condition if needed.
	public void aftertest() {
		System.out.println("after test");
	}

	@AfterSuite // execution is atlast when all other annotations have been executed according to sequence.
	public void aftersuite() {
		System.out.println("After suite");
	}
}
