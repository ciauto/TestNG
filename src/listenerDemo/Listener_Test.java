package listenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_Test implements ITestListener {

	@Override
	public void onFinish(ITestContext testResult) {
		
		
	}

	@Override
	public void onStart(ITestContext testResult) {
	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult testResult) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult testResult) {
		System.out.println("The name of the testcase failed is :"+testResult.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult testResult) {
		System.out.println("The name of the testcase Skipped is :"+testResult.getName());
		
	}

	@Override
	public void onTestStart(ITestResult testResult) {
		System.out.println(testResult.getName()+" test case started");
		
	}

	@Override
	public void onTestSuccess(ITestResult testResult) {
		System.out.println("The name of the testcase passed is :"+testResult.getName());
		
	}

}
