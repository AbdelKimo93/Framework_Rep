package utilities;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import testScripts.LoginTest;

public class ScreenshotTaker extends LoginTest {
	

	public static void getScreenShotSuccess() throws Throwable {
		
		Date currentdate = new Date();
		String screenshotname = currentdate.toString().replace(" ", "-").replace(":", "-");
		File screenshotTaker = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotTaker, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots.success\\" + screenshotname + ".png"));

	}
	
	public static void getScreenShotFailure() throws Throwable {
		
		Date currentdate = new Date();
		String screenshotname = currentdate.toString().replace(" ", "-").replace(":", "-");
		File screenshotTaker = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotTaker, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots.failure\\" + screenshotname + ".png"));

	}
}
