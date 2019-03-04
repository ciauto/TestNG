package TestNGITestResult;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG_ITestResultDemo {

	//we have taken 2 test method and afterMethod in below example
	@Test
	public void testcase1() {
		System.out.println("Testcase 1  running");
		//this means testcase1 will fail
		Assert.assertTrue(false);
	}
	@Test
	public void testcase2() {
		System.out.println("Testcase 2  running");
		//this means testcase2 will pass
		Assert.assertTrue(true);
	}
	@AfterMethod
	public void tearDown(ITestResult testResult) {
		
		System.out.println(testResult.getMethod().getMethodName());
		
		//If the testcase failed then I want to print the name of method which failed
		if(testResult.getStatus()==ITestResult.FAILURE) {
		System.out.println("Failed Test: 	" +testResult.getMethod().getMethodName());
	}
		
		if(testResult.getStatus()==ITestResult.SUCCESS) {
			System.out.println("Success Test: 	" +testResult.getName());
		}
}
}
