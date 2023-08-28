package iListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.ScreenshotTaker;

public class ScreenshotsListeners extends ScreenshotTaker implements ITestListener{
	
	
	public void onTestFailure(ITestResult result) {
		try {
			getScreenShotFailure();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	
	public void onTestSuccess(ITestResult result) {
		try {
			getScreenShotSuccess();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

		
	
}
