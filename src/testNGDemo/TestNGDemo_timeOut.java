package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo_timeOut {

	@BeforeTest
	public void beforeTest() {

		System.out.println("cookies deleted");
	}

	@BeforeMethod
	public void setup() {
		System.out.println("login successful");
	}

	// timeOut to test method - if test method ran for more time, TestNG will fail
	// below test
	// Below test method will run for 100 millisecond
	@Test(timeOut = 100)
	public void searchairline() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Airline not found");

	}

	@Test
	public void buyticket() {
		System.out.println("Airline ticket successfully booked");
		Assert.assertEquals(12, 12);
	}

	@Test
	public void buyCruiseTicket() {
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
