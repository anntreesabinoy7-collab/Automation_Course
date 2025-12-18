package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constant.Constants;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {
	LoginPage login;
	HomePage home;
	@Test
	public void verifyWhetherUserIsAbleToLogoutSuccessfully() throws IOException {
		 String usernamevalue=ExcelUtility.getStringData(0, 0, "Loginpage");
		 String passwordvalue=ExcelUtility.getStringData(0, 1, "Loginpage");
		 LoginPage login=new LoginPage(driver);

		 login.enterUserNameOnUserNameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
		 home=login.loginButtonClick();
			
		    home.logoutButtonClick();
		    login=home.logoutClick();
			boolean signInIsDisplayed = home.isSignInDisplayed();
			Assert.assertTrue(signInIsDisplayed, Constants.LOGOUTERROR);
		}

}
