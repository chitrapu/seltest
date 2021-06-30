package individual;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListerns implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Started: " +result.getTestName()+" " +result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Success: " +result.getTestName()+" " +result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed: " +result.getTestName()+" " +result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped: " +result.getTestName()+" " +result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Test on Start: " +context.getAllTestMethods());
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Completed: " +context.getHost());
		
	}

}
