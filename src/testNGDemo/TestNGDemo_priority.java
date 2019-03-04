package testNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo_priority {
	@BeforeClass
	public void beforeClass() {
		System.out.println("This method runs before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println();
		System.out.println("This method runs before every method");
	}

	@Test(priority = 0)
	public void login() {
		System.out.println("Login successful");
	}

	@Test(priority = 1)
	public void verifypageTitle() {
		System.out.println("Page title verified ");
	}

	@Test(priority = 2, enabled = false)
	public void purticketOneway() {
		System.out.println("One Way Ticket purchased successfully");
	}

	@Test(priority = 3)
	public void purticketRoundtrip() {
		System.out.println("Round Trip ticket purchased successfully");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This method runs after every method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This method runs after class");
	}

}
