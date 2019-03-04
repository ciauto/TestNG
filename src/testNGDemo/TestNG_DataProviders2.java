package testNGDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProviders2 {
	@DataProvider(name = "inputs")
	public Object[][] getData() {
		return new Object[][] { { "Michael", "Smith", "30" }, { "Mindy", "Jordan", "15" },
				{ "Thomas", "Hall", "10" }, };
	}

	@Test(dataProvider = "inputs")
	public void testMethod(String firstName, String lastName, String age) {
		System.out.println("first name: " + firstName);
		System.out.println("last name: " + lastName);
		System.out.println("Age: " + age);
	}
}
