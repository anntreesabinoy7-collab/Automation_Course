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
	@Test
	public void verifyWhetherUserIsAbleToLogoutSuccessfully() throws IOException {
		 String usernamevalue=ExcelUtility.getStringData(0, 0, "Loginpage");
		 String passwordvalue=ExcelUtility.getStringData(0, 1, "Loginpage");
		 LoginPage loginPage=new LoginPage(driver);
			loginPage.enterUserNameOnUserNameField(usernamevalue);
			loginPage.enterPasswordOnPasswordField(passwordvalue);
			loginPage.loginButtonClick();
		HomePage homepage = new HomePage(driver);
		    homepage.logoutButtonClick();
		    homepage.logoutClick();
			boolean signInIsDisplayed = homepage.isSignInDisplayed();
			Assert.assertTrue(signInIsDisplayed, Constants.LOGOUTERROR);
		}

}
