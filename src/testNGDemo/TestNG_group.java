package testNGDemo;

import org.testng.annotations.*;

public class TestNG_group {

	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@Test(groups = { "functional-group" })
	public void test1() {
		System.out.println("This test is test1 ");
	}

	@Test(groups = { "functional-group" })
	public void test2() {
		System.out.println("This test is test2");
	}

	@Test(groups = { "smoke-group", "functional-group" })
	public void test3() {
		System.out.println("This test is test3");
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		System.out.println("after Class");
	}

}
