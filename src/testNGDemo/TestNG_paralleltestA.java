package testNGDemo;

import org.testng.annotations.Test;

public class TestNG_paralleltestA {

	@Test
	public void testMethod1() throws InterruptedException {
		System.out.println("Test 1A  - Login test 1A ");
		Thread.sleep(4000);
		System.out.println("Test 1A  - Login test 1A continue");
	}

	@Test
	public void testMethod2() throws InterruptedException {
		System.out.println("Test 2A  - Login test 2A ");
		Thread.sleep(4000);
		System.out.println("Test 2A  - Login test 2A continue");
	}

}
