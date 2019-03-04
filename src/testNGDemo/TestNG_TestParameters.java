package testNGDemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_TestParameters {

	@BeforeClass
	@Parameters({ "browser", "platform" })
	public void setUp(String browser, String platform) {
		System.out.println("Before suite method");
		System.out.println("Reading the parameter from xml file  " + browser);
		System.out.println("Reading the parameter from xml file  " + platform);
	}

	@Test
	@Parameters({ "response" })
	public void testMethod(String response) {
		System.out.println("Test method");
		System.out.println("Reading the parameter from xml file   " + response);
	}

}
