package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {

	@Test(priority = 1, retryAnalyzer=retry.Retry.class)
	public void testAddAdmin() throws IOException {
		String loginUserName = ExcelUtility.getstringData(1,0, "LoginPage"); // Fetching username from Excel file. 1,0 represent cell position
		String loginPassword = ExcelUtility.getstringData(1,1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(loginUserName);
		loginPage.enterPassword(loginPassword);
		loginPage.sigin();
		
		AdminUsersPage adminuserspage = new AdminUsersPage(driver);
		adminuserspage.clickAddAdminLink();
		adminuserspage.clickAddNewAdminButton();
		
		//String loginUserNameAdmin = ExcelUtility.getstringData(1,0, "Admins"); // Fetching username from Excel file. 1,0 represent cell position
		//String loginPasswordAdmin = ExcelUtility.getstringData(1,1, "Admins");
		FakerUtility fakerutility = new FakerUtility();
		String loginUserNameAdmin = fakerutility.creatARandomFirstName(); 
		String loginPasswordAdmin = fakerutility.creatARandomFirstName();// Generating random username using FakerUtility
		adminuserspage.enterNewAdminUsername(loginUserNameAdmin);
		adminuserspage.enterNewAdminPassword(loginPasswordAdmin);
		adminuserspage.selectUserType();
		adminuserspage.clickSaveAdminButton();
		Assert.assertTrue(adminuserspage.isSuccessAlertDisplayed());
		
	}

}
