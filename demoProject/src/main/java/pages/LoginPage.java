package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy; //@FindBy
import org.openqa.selenium.support.PageFactory;


	public class LoginPage {
		WebDriver driver;
			@FindBy(css="input.form-control[placeholder='Username']")WebElement username;
			@FindBy(css="input.form-control[placeholder='Password']")WebElement password;
			@FindBy(xpath="//button[text()='Sign In']")WebElement loginButton;
			@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
			@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alertBox;
			
			
				//constructor to initialize the WebDriver and PageFactory elements
			public LoginPage(WebDriver driver) 
				{
				this.driver = driver;
				PageFactory.initElements(driver, this); 
				// PageFactory : Class
				// initElements : Method that tells selenium to locate elements marked with @FindBy annotation
				}

			public void enterUsername(String loginUserName) 
				{
				username.sendKeys(loginUserName);						
				}
			
			public void enterPassword(String loginPassword) 
				{
				password.sendKeys(loginPassword);
				}
			
			public void sigin()
				{
				loginButton.click();
				}
			
			public boolean isHomePageDisplayed( ) 
				{
				return dashboard.isDisplayed();
				}
			
			public boolean isAlertDisplayed()
				{
				return alertBox.isDisplayed();
				}
			
	}// End of LoginPage
	


