package testScripts;

import org.testng.annotations.*;

import base.BaseTest;
import poms.LoginPage;
import utilities.ReadExcelLoginData;

public class LoginTest extends BaseTest {
	
	public static LoginPage loginpage;
	
	@Test(dataProviderClass = ReadExcelLoginData.class, dataProvider = "loginDataProvider")
	public static void loginTest(String username, String password) throws Throwable {
	    loginpage = new LoginPage(driver);
		loginpage.loginFunction(username, password);
		
	}
	
	
	
	
	
	
	
	
	

}
