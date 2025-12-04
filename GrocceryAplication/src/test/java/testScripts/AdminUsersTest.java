package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base{
	@Test
	public void verifyWhetherUserIsAbleToAddNewUser() throws IOException {
		 String usernamevalue=ExcelUtility.getStringData(0, 0, "LoginPage");
		 String passwordvalue=ExcelUtility.getStringData(0, 1, "LoginPage");
		 LoginPage loginPage=new LoginPage(driver);
			loginPage.enterUserNameOnUserNameField(usernamevalue);
			loginPage.enterPasswordOnPasswordField(passwordvalue);
			loginPage.loginButtonClick();
		 HomePage homepage = new HomePage(driver);
		    homepage.moreInfoButtonClick();
	
		 String usernamevalue1=ExcelUtility.getStringData(0, 0, "AdminUsersPage");
		 String passwordvalue1=ExcelUtility.getStringData(0, 1, "AdminUsersPage");
		 AdminUsersPage   adminuserspage = new AdminUsersPage(driver);
		    adminuserspage.newButtonClick();
		    adminuserspage.enterUserNameOnUserNameField(usernamevalue1);
		    adminuserspage.enterPasswordOnPasswordField(passwordvalue1);
		    adminuserspage.selectUserType();
		    adminuserspage.saveButtonClick();
		    String Alertmsg = adminuserspage.getAlertMessage();
		    Assert.assertTrue(Alertmsg.contains("User Added Successfully"), "User was NOT added!");

		}
		    
		
	@Test
	public void verifyWhetherUserIsAbleToSearchNewlyAddedUser() throws IOException {
		 String usernamevalue=ExcelUtility.getStringData(0, 0, "LoginPage");
		 String passwordvalue=ExcelUtility.getStringData(0, 1, "LoginPage");
		 
		 LoginPage loginPage=new LoginPage(driver);
			loginPage.enterUserNameOnUserNameField(usernamevalue);
			loginPage.enterPasswordOnPasswordField(passwordvalue);
			loginPage.loginButtonClick();
		
		HomePage homepage = new HomePage(driver);
		    homepage.moreInfoButtonClick();
		    
		String usernamevalue1=ExcelUtility.getStringData(0, 0, "AdminUsersPage");
	     
		AdminUsersPage   adminuserspage = new AdminUsersPage(driver);
	        adminuserspage.searchButtonClick();
	        adminuserspage.usernameSearchButtonClick(usernamevalue1);
	        adminuserspage.searchUserTypeButton();
	        adminuserspage.submitButtonClick();
	        
	        String expecteduser = " Ann Treesa Binoy ";
	        String actualuser = adminuserspage.getSearchedUser();
            Assert.assertEquals(actualuser, expecteduser, "Searched user does NOT match!");

		}
	@Test
	public void verifyWhetherUserIsAbleToResetTheList() throws IOException {
		 String usernamevalue=ExcelUtility.getStringData(0, 0, "LoginPage");
		 String passwordvalue=ExcelUtility.getStringData(0, 1, "LoginPage");
		 
		 LoginPage loginPage=new LoginPage(driver);
			loginPage.enterUserNameOnUserNameField(usernamevalue);
			loginPage.enterPasswordOnPasswordField(passwordvalue);
			loginPage.loginButtonClick();
		
		HomePage homepage = new HomePage(driver);
		    homepage.moreInfoButtonClick();
		  
		AdminUsersPage   adminuserspage = new AdminUsersPage(driver);
		     adminuserspage.resetButtonClick();

	}

}
