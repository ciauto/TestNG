package listenerPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListener2 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// This method will executed when any test method starts ( actual test method
		// with @Test annotation)
		System.out.println("onTestStart ==> Test Name" + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// if test method is successful
		System.out.println("onTestSuccess ==> Test Name" + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// if test method is fail
		System.out.println("onTestFailure ==> Test Name" + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// if test method is skip
		System.out.println("onTestSkipped ==> Test Name" + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// if in our test case we have 10 assertion point but we want if 7 fails, we want test to pass

	}

	@Override
	public void onStart(ITestContext context) {
		//this will execute before <test> tag of xml file
		System.out.println("onStart ==> Test Name" + context.getName());
		ITestNGMethod methods[] = context.getAllTestMethods();
		System.out.println("These methods will be executed in this test tag:");
		for(ITestNGMethod method: methods) {
			System.out.println(method.getMethodName());
		}

	}

	@Override
	public void onFinish(ITestContext context) {
		//this will execute after <test> tag of xml file
				System.out.println("onFinish ==> Test Name" + context.getName());
	}

}
