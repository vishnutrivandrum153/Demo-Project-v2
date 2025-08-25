package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageNewsPage {
	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement newsDescription;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement addNewButton;
	@FindBy(css="textarea#news")WebElement textBox;
	@FindBy(xpath="//button[@class='btn btn-danger']")WebElement saveButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertBox;
	@FindBy(xpath="(//a[contains(@href,'/admin/news/edit')])[1]")WebElement editNewsButton;
	@FindBy(xpath="//textarea[@placeholder='Enter the news']")WebElement editNewsTextBox;
	@FindBy(xpath="//button[@name='update']")WebElement updateNewsButton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement addAdminLink;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement addNewAdminButton;
	@FindBy(xpath="//input[@name='username']")WebElement addNewAdminTextBox;
	@FindBy(xpath="//input[@name='password']")WebElement passwordTextBoxAdmin;
	@FindBy(xpath="//select[@name='user_type']")WebElement selectDropDown;
	@FindBy(xpath="//button[@name='Create']")WebElement saveAdminButton;
	WebDriver driver;
	
	public ManageNewsPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickNewsDescription() 
	{
		newsDescription.click();
	}
	
	public void clickAddNewButton() 
	{
		addNewButton.click();
	}
	public void enterNewsDescription(String newsDescriptionText) 
	{
		textBox.sendKeys(newsDescriptionText);
	}
	public void clickSaveButton() 
	{
		saveButton.click();
	}
	
	public boolean isAlertDisplayed() 
	{
		return alertBox.isDisplayed();
	}
	
	public void clickEditNewsButton() 
	{
		editNewsButton.click();
	}
	
	public void editNewsDescription(String updatedDescription) 
	{
		editNewsTextBox.clear();
		editNewsTextBox.sendKeys(updatedDescription);
	}
	
	public void clickUpdateNewsButton() 
	{
		updateNewsButton.click();
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
		Select select = new Select(selectDropDown);
		select.selectByVisibleText("Admin");
	}
	
	public void clickSaveAdminButton() 
	{
		saveAdminButton.click();
	}
	
	
	} //End of ManageNewsPage class


