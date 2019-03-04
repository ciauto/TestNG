package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_dependsOn {

	@Test
	public void login() {
		System.out.println("login successful");
	}

	@Test(dependsOnMethods = "login")
	public void verifyHomepage() {
		Assert.assertEquals(1, 2);
		System.out.println("Home page verified");
	}

	@Test(dependsOnMethods = "verifyHomepage")
	public void addPayee() {
		System.out.println("Added Payee successfully");
	}

	@Test(dependsOnMethods = "addPayee")
	public void payBills() {
		System.out.println("Bill Paid successfully");
	}

	@Test(dependsOnMethods = "payBills")
	public void logout() {
		System.out.println("Sign-off or logout");
	}
}
