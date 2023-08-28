package poms;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	
	WebDriver driver;
	
	
	 public LoginPage (WebDriver driver) {
		this .driver = driver;
	}
	
	
	private By username_field = By.name("username");
	private By password_field = By.name("password");
	private By loginButton = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");
	
	
	public void loginFunction(String username, String password) throws InterruptedException {
		WebElement username_input = driver.findElement(username_field);
		WebElement password_input = driver.findElement(password_field);
		WebElement login_button = driver.findElement(loginButton);

		username_input.clear();
		password_input.clear();
		
		username_input.sendKeys(username);
		Thread.sleep(1000);
		password_input.sendKeys(password);
		Thread.sleep(1000);
		login_button.click();	
		Thread.sleep(1000);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
