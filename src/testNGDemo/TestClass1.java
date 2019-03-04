package testNGDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTestSuite;

public class TestClass1 extends BaseTestSuite {



	@BeforeMethod
	public void beforeMethod() {
		System.out.println("testClass1 : This runs before test method");
	}

	@Test
	public void testMethod1() {
		System.out.println("testClass1 : This is a testMethod 1");
		
	}
	@Test
	public void testMethod2() {
		System.out.println("testClass1 : This is a testMethod 2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("testClass1 : This runs after test method");
	}

	
}
