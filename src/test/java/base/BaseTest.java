package base;

import java.io.FileReader;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	
	
	public static Properties property = new Properties();
	public static String configPath = System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\confi.properties";
	public static FileReader fr;
	
	
	@BeforeClass
	public void setup() throws Throwable {

		if(driver == null) {
			fr = new FileReader(configPath);
			property.load(fr);
			
		}
		
		String browser = property.getProperty("BrowserType");
		String url = property.getProperty("Environment");
		
		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else {
			System.err.println("Error! browser type unkown. Try to use another browser.");
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
	}

	@AfterClass
	public void teardown() {
		
		driver.close();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
