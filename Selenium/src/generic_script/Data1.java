package generic_script;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Data1 implements ITestListener 
{

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("Tc is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc is failed and take screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("tc is skipped");
		
	}




}
