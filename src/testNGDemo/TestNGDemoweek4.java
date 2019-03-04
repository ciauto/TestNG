package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemoweek4 {

	@BeforeTest
	public void beforeTest() {

		System.out.println("cookies deleted");
	}

	@BeforeMethod
	public void setup() {
		System.out.println("login successful");
	}

	@Test(priority = 1)
	public void searchairline() {
		System.out.println("Airline found");
		Assert.assertEquals(12, 12, "Contact Developer team immediately");
	}

	@Test(priority = 2)
	public void buyticket() {
		System.out.println("Airline ticket successfully booked");
		Assert.assertEquals(12, 12);
	}

	@Test(priority = 3)
	public void buuCruiseTicket() {
		System.out.println("Cruise ticket successfully booked");
		Assert.assertEquals(12, 12);
	}

	@AfterMethod
	public void logout() {
		System.out.println("Logout successful");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("cookies deleted");

	}
}
