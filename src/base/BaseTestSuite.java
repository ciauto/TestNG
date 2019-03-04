package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTestSuite {

	@BeforeClass
	public void beforeClass() {
		System.out.println("BaseTestSuite : before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("BaseTestSuite : after class");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BaseTestSuite : before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("BaseTestSuite : after suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("BaseTestSuite : before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("BaseTestSuite : after test");
	}

}
