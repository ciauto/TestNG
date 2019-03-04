package testNGDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProviders1 {

	@DataProvider(name = "inputs")
	public Object[][] getData() {
		return new Object[][] { { "tutorial", "tutorial" }, { "Naresh", "tutorial" }, { "Tye", "tutorial" } };
	}

	@Test(dataProvider = "inputs")
	public void testMethod1(String input1, String input2) {
		System.out.println("Input 1: " + input1);
		System.out.println("Input 2: " + input2);
	}

}
