package listenerDemo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNG_ListenersTest3 {

	@BeforeClass
	public void setUp() {
		System.out.println("Code in before class");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Code in after class");
	}

	@Test
	public void testCase1() {
		System.out.println("Code in testcase 1");
		Assert.assertTrue(true);
	}

	@Test
	public void testCase2() {
		System.out.println("Code in testcase 2");
		Assert.assertTrue(false);
	}

}
