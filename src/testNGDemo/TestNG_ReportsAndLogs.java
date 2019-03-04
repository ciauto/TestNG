package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestNG_ReportsAndLogs {

	@BeforeClass
	public void setUp() {
		System.out.println("This runs once before class");
		//Reporter.log("This runs once before class", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		//System.out.println("This runs before every method");
		Reporter.log("This runs before every method", true);
	}

	@Test
	public void testMethod1() {
		//System.out.println("This is a testMethod 1");
		Reporter.log("This is a testMethod 1", true);
	}
	@Test
	public void testMethod2() {
		//System.out.println("This is a testMethod 2");
		Reporter.log("This is a testMethod 2", true);
		Assert.assertTrue(false); //intentionally failing this test case
	}
	@Test(dependsOnMethods= {"testMethod2"})
	public void testMethod3() {
		//System.out.println("This is a testMethod 3");
		Reporter.log("This is a testMethod 3", true);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This runs after every method");
		Reporter.log("This runs after every method", true);
	}

	@AfterClass
	public void tearDown() {
		System.out.println("This runs once after class");
		Reporter.log("This runs once after class", true);
	}

}
