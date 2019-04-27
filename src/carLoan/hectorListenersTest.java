package carLoan;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// ITestListner is an interface that implements TestNG Listners, Listeners is a class that we
// define to be able to use certain predefined methods for execution when certain events happen
// while the execution of the TestNG xml file. exampple: onTestSuccess(), onTestFailure(),
// onTestStart(), onStart(), onFinish().... Every time the event happens the control will pass to 
// the listener class and the corresponding method will be executed.

public class hectorListenersTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("**** SUCCESS!!!! Executed Listener onTestSuccess() ******");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		// here we can insert the code to take a snapshot of the screen when @Test fail. 
		// Also, the JSON response when the API failed.
		System.out.println("**** FAILURE!!! Executed Listener onTestFailure() ******"
				+ "  The Failing @Test is: " + result.getName());
		// result.getName() displays the name of the @Test that failed.
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
