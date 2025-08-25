package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUsersPage {
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement addAdminLink;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement addNewAdminButton;
	@FindBy(xpath="//input[@name='username']")WebElement addNewAdminTextBox;
	@FindBy(xpath="//input[@name='password']")WebElement passwordTextBoxAdmin;
	@FindBy(xpath="//select[@name='user_type']")WebElement selectDropDown;
	@FindBy(xpath="//button[@name='Create']")WebElement saveAdminButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement successAlertBox;
	
	WebDriver driver;
	public AdminUsersPage(WebDriver driver) 
		{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	
	public void clickAddAdminLink()
	{
		addAdminLink.click();
	}
	
	public void clickAddNewAdminButton() 
	{
		addNewAdminButton.click();
	}
	
	public void enterNewAdminUsername(String username) 
	{
		addNewAdminTextBox.sendKeys(username);
	}
	
	public void enterNewAdminPassword(String password) 
	{
		passwordTextBoxAdmin.sendKeys(password);
	}
	
	public void selectUserType() 
	{
		selectDropDown.click();
		//Select select = new Select(selectDropDown);
		//select.selectByVisibleText("Admin");
		PageUtility pageutility = new PageUtility();
		pageutility.selectByVisibleText(selectDropDown, "Admin");
	}
	
	public void clickSaveAdminButton() 
	{
		saveAdminButton.click();
	}
	
	public boolean isSuccessAlertDisplayed() 
	{
		return successAlertBox.isDisplayed();
	}
	

}//End of AdminUsersPage class
