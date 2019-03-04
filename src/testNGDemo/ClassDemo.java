package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ClassDemo {
	@Test
	public void testMethod1() {
		System.out.println("I am test method 1");
	}

	@Test
	public void testMethod2() {
		System.out.println("I am test method 2");
	}

	@Test
	public void testMethod3() {
		System.out.println("I am test method 3");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am after Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am before class method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am after Class method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am before Test Method");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am after Test Method");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am before Suite Method");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I am after Suite Method");
	}

}
