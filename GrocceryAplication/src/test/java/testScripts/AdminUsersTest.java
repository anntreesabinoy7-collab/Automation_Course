package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constant.Constants;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base{
	HomePage home;
	AdminUsersPage admin;
	@Test
	public void verifyWhetherUserIsAbleToAddNewUser() throws IOException {
		 String usernamevalue=ExcelUtility.getStringData(0, 0, "LoginPage");
		 String passwordvalue=ExcelUtility.getStringData(0, 1, "LoginPage");
		 LoginPage loginPage=new LoginPage(driver);
			loginPage.enterUserNameOnUserNameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
			home=loginPage.loginButtonClick();
		    admin=home.adminUsersMoreInfoButtonClick();
		    
		 FakerUtility fakerUtility = new FakerUtility();
		 String usernamevalue1=fakerUtility.createRandomUserName();
		 String passwordvalue1=fakerUtility.createRandomPassword();
		 
		 admin.newButtonClick().enterUserNameOnUserNameField(usernamevalue1).enterPasswordOnPasswordField(passwordvalue1).selectUserType().saveButtonClick();
		 
		    boolean Alertmsg = admin.getAlertMessage();
		    Assert.assertTrue(Alertmsg,Constants.ADDNEWUSERERROR);

		}
		    
		
	@Test
	public void verifyWhetherUserIsAbleToSearchNewlyAddedUser() throws IOException {
		 String usernamevalue=ExcelUtility.getStringData(0, 0, "LoginPage");
		 String passwordvalue=ExcelUtility.getStringData(0, 1, "LoginPage");
		 
		 LoginPage loginPage=new LoginPage(driver);
			loginPage.enterUserNameOnUserNameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
			home=loginPage.loginButtonClick();
		
		    admin=home.adminUsersMoreInfoButtonClick();
		    
		String usernamevalue1=ExcelUtility.getStringData(0, 0, "AdminUsersPage");
	     
		admin.searchButtonClick().usernameSearchButtonClick(usernamevalue1).searchUserTypeButton().submitButtonClick();
	        
	        String expecteduser = "Ann Treesa Binoy";
	        String actualuser = admin.getSearchedUser().trim();
            Assert.assertEquals(expecteduser, actualuser, Constants.SEARCHNEWUSERERROR);

		}
	@Test
	public void verifyWhetherUserIsAbleToResetTheList() throws IOException {
		 String usernamevalue=ExcelUtility.getStringData(0, 0, "LoginPage");
		 String passwordvalue=ExcelUtility.getStringData(0, 1, "LoginPage");
		 
		 LoginPage loginPage=new LoginPage(driver);
		 loginPage.enterUserNameOnUserNameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		 home=loginPage.loginButtonClick();
		
		 admin =  home.adminUsersMoreInfoButtonClick();
		  
		 admin.resetButtonClick();
        
	     boolean adminUsersListDisplayed=admin.isAdminUsersListDisplayed();
		 Assert.assertTrue(adminUsersListDisplayed,Constants.RESETERROR);
	}

}
