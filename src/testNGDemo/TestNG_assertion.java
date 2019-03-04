package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_assertion {

	@Test
	public void hardAssert() {
		System.out.println("hard assert test started");

		Assert.assertEquals(1, 2);
		System.out.println("hard assert test completed");

	}

	@Test
	public void softAssert() {

		SoftAssert asrt = new SoftAssert();
		System.out.println("soft assert test started");
		asrt.assertEquals(1, 2);
		System.out.println("soft assert test completed");
		asrt.assertAll();

	}

}
