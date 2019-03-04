package testNGDemo;

import org.testng.annotations.Test;

import base.BaseTestSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestClass2_preserve2 extends BaseTestSuite {

	@BeforeClass
	public void beforeClass() {
		System.out.println("testClass2 : This runs before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("testClass2 : This runs before test method");
	}

	@Test
	public void testMethod1() {
		System.out.println("testClass2 : This is a testMethod 1");
		
	}
	@Test
	public void testMethod2() {
		System.out.println("testClass2 : This is a testMethod 2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("testClass2 : This runs after test method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("testClass2 : This runs after class");
	}

}
