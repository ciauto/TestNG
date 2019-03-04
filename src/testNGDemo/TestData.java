package testNGDemo;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name = "inputs")
	public Object[][] getData() {
		return new Object[][] { { "Michael", "Smith", "30" }, { "Mindy", "Jordan", "15" },
				{ "Thomas", "Hall", "10" }, };
	}
}
