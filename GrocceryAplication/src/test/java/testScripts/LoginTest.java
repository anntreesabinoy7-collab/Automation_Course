package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	@Test(priority = 1,description = "Verify user can login with valid credentials",groups = {"smoke"})
	public void verifyWhetherUserIsAbleToLoginWithValidcredentials() throws IOException {
		 String usernamevalue=ExcelUtility.getStringData(0, 0, "Loginpage");
		 String passwordvalue=ExcelUtility.getStringData(0, 1, "Loginpage");
		 LoginPage loginPage=new LoginPage(driver);
			loginPage.enterUserNameOnUserNameField(usernamevalue);
			loginPage.enterPasswordOnPasswordField(passwordvalue);
			loginPage.loginButtonClick();
			boolean dashboardIsDisplayed = loginPage.isDashboardDisplayed();
			Assert.assertTrue(dashboardIsDisplayed, "User was unable to login with valid credentials");
		}
	 @Test(priority = 2,description = "Verify user can login with valid username and invalid password")
	 public void verifyWhetherUserIsAbleToLoginWithValidUsernameAndInvalidPassword() throws IOException {
		 String usernamevalue=ExcelUtility.getStringData(1, 0, "Loginpage");
		 String passwordvalue=ExcelUtility.getStringData(1, 1, "Loginpage");
		 LoginPage loginPage=new LoginPage(driver);
			loginPage.enterUserNameOnUserNameField(usernamevalue);
			loginPage.enterPasswordOnPasswordField(passwordvalue);
			loginPage.loginButtonClick();
			
			String expected ="Alert!";
			String actual = loginPage.isAlertDisplayed();
			Assert.assertEquals(expected, actual,"User was able to login with invalid password");
			
	 }
	 @Test(priority = 3,description = "Verify user can loging with invalid username and valid password")
	 public void verifyWhetherUserIsAbleToLoginWithInvalidUsernameAndValidPassword() throws IOException {
		 String usernamevalue=ExcelUtility.getStringData(2, 0, "Loginpage");
		 String passwordvalue=ExcelUtility.getStringData(2, 1, "Loginpage");
		 LoginPage loginPage=new LoginPage(driver);
			loginPage.enterUserNameOnUserNameField(usernamevalue);
			loginPage.enterPasswordOnPasswordField(passwordvalue);
			loginPage.loginButtonClick();
			
			boolean CloseButtonDisplayed=loginPage.isclosebuttondisplayed();
			Assert.assertTrue(CloseButtonDisplayed, "User was able to login with invalid username");
			}
	 
	 @Test(priority = 4,description = "Verify user can login with invalid username and invalid password",groups = {"smoke"})
		public void verifyWhetherUserIsAbleToLoginWithInvalidUsernameAndInvalidPassword() throws IOException {
		 String usernamevalue=ExcelUtility.getStringData(3, 0, "Loginpage");
		 String passwordvalue=ExcelUtility.getStringData(3, 1, "Loginpage");
		 LoginPage loginPage=new LoginPage(driver);
			loginPage.enterUserNameOnUserNameField(usernamevalue);
			loginPage.enterPasswordOnPasswordField(passwordvalue);
			loginPage.loginButtonClick();
			boolean dashboard2IsDisplayed = loginPage.isdashboard2Displayed();
			Assert.assertTrue(dashboard2IsDisplayed, "User was able to login with invalid credentials");
			
		}

}
