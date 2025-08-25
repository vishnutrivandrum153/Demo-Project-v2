package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	@Test(priority = 1, groups= {"regression"})
	
	public void test() throws IOException
	{
		//String username = "admin";
		//String password = "admin";
		String username = ExcelUtility.getstringData(1,0, "LoginPage"); // Fetching username from Excel file. 1,0 represent cell position
		String password = ExcelUtility.getstringData(1,1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.sigin();
		
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.clickNewsDescription();
		managenewspage.clickAddNewButton();
		
		String newsDescriptionText =  ExcelUtility.getstringData(0,0, "News"); // Fetching news description from Excel file. 0,0 represent cell position
		managenewspage.enterNewsDescription(newsDescriptionText);
		
		managenewspage.clickSaveButton();
		Assert.assertTrue(managenewspage.isAlertDisplayed());	
	}
	
	@Test(priority = 2)
	public void editNewsTest() throws IOException 
	{
	//String username = "vishnus";
	//String password = "obsquara";
	String username = ExcelUtility.getstringData(1,0, "LoginPage"); // Fetching username from Excel file. 1,0 represent cell position
	String password = ExcelUtility.getstringData(1,1, "LoginPage");
	String updatedDescription = "This is an updated news description!!!.";
	
	LoginPage loginPage = new LoginPage(driver);
	loginPage.enterUsername(username);
	loginPage.enterPassword(password);
	loginPage.sigin();
	
	ManageNewsPage managenewspage = new ManageNewsPage(driver);
	managenewspage.clickNewsDescription();
	managenewspage.clickEditNewsButton();
	managenewspage.editNewsDescription(updatedDescription);
	managenewspage.clickUpdateNewsButton();
	Assert.assertTrue(managenewspage.isAlertDisplayed());
	}

}
