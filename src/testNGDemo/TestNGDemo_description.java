package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo_description {

	@Test(priority = 1, description = "this testcase verify login functionality")
	public void login() {
		System.out.println("Login to banking site");
	}

	@Test(priority = 2, description = "this testcase verify add payee functionality")
	public void addPayee() {
		System.out.println("Payee Added");
	}

	@Test(priority = 3, description = " this testcase verify bill payment functionality")
	public void payBill() {
		System.out.println("Bill Paid");
		Assert.assertEquals(1, 2);
	}

	@Test(priority = 4, description = " this testcase verify logout functionality")
	public void logout() {
		System.out.println("Logout from the banking site");
	}

}
