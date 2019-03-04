package testNGDemo;


import org.testng.annotations.Test;

public class TestNG_DataProviders3 {
	
	// Created a DataProviders method in TestData class and calling that into below testMethod
	@Test(dataProvider = "inputs", dataProviderClass=TestData.class)
	public void testMethod(String firstName, String lastName, String age) {
		System.out.println("first name: " + firstName);
		System.out.println("last name: " + lastName);
		System.out.println("Age: " + age);
	}
}
