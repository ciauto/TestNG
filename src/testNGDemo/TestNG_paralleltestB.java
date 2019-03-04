package testNGDemo;

import org.testng.annotations.Test;

public class TestNG_paralleltestB {

	@Test
	public void testMethod1() throws InterruptedException {
		System.out.println("Test 1B  - Login test 1B ");
		Thread.sleep(4000);
		System.out.println("Test 1B  - Login test 1B continue");
	}

	@Test
	public void testMethod2() throws InterruptedException {
		System.out.println("Parallel test 2  - Login test 2 ");
		Thread.sleep(4000);
		System.out.println("Parallel test 2  - Login test 2 continue");
	}

}
