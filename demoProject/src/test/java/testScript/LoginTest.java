package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {

	@Test(priority = 1)
	public void validUsernameAndPassword() throws IOException 
		{
		//String loginUserName = "admin";
		//String loginPassword = "admin";
		String loginUserName = ExcelUtility.getstringData(1,0, "LoginPage"); // Fetching username from Excel file. 1,0 represent cell position
		String loginPassword = ExcelUtility.getstringData(1,1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(loginUserName);
		loginPage.enterPassword(loginPassword);
		loginPage.sigin();
		boolean isHomePageLoaded = loginPage.isHomePageDisplayed();
		Assert.assertTrue(isHomePageLoaded);	
		}    
	
	@Test(priority = 2)
	public void validUsernameInvalidPassword() throws IOException 
		{
		//String loginUserName = "admin"; 
		//String loginPassword = "invalid";
		String loginUserName = ExcelUtility.getstringData(2,0, "LoginPage"); 
		String loginPassword = ExcelUtility.getstringData(2,1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(loginUserName);
		loginPage.enterPassword(loginPassword);
		loginPage.sigin();
		boolean isAlertDisplayed = loginPage.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed);	
		}
	
	@Test(priority = 3)
	public void invalidUsernameValidPassword() throws IOException 
		{
		String loginUserName = ExcelUtility.getstringData(3,0, "LoginPage"); 
		String loginPassword = ExcelUtility.getstringData(3,1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(loginUserName);
		loginPage.enterPassword(loginPassword);
		loginPage.sigin();
		boolean isAlertDisplayed = loginPage.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed);	
		}
	
	@Test(priority = 4)
	public void invalidUsernameAnddPassword() throws IOException 
		{
		String loginUserName = ExcelUtility.getstringData(4,0, "LoginPage"); 
		String loginPassword = ExcelUtility.getstringData(4,1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(loginUserName);
		loginPage.enterPassword(loginPassword);
		loginPage.sigin();
		boolean isAlertDisplayed = loginPage.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed);	
		}	
	

}// End of LoginTest
