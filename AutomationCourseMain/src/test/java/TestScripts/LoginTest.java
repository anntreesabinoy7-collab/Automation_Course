package TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SeleniumBasics.DemoBase;
import Utility.ExcelUtility;
import pages.LoginPage;

public class LoginTest extends DemoBase {
	@Test
	public void VerifyWhetherTheUserIsAbleToLoginWithValidCredential() throws IOException {
		String userNameValue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue = ExcelUtility.getStringData(0, 1, "LoginPage");
        
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userNameValue);
		loginpage.enterPaswordOnPasswordField(passwordValue);
		loginpage.loginButtonClick();
	}
	
    @Test
    public void VerifyWhetherTheUserIsAbleToLoginWithValidUsernameAndInvalidPssword() throws IOException {
		
    	String userNameValue = ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue = ExcelUtility.getStringData(1, 1, "LoginPage");
        LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userNameValue);
		loginpage.enterPaswordOnPasswordField(passwordValue);
		loginpage.loginButtonClick();
	}

    @Test
    public void VerifyWhetherTheUserIsAbleToLoginWithInvalidUsernameAndValidPassword() throws IOException {
		
    	String userNameValue = ExcelUtility.getStringData(2, 0, "LoginPage");
		String passwordValue = ExcelUtility.getStringData(2, 1, "LoginPage");
        LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userNameValue);
		loginpage.enterPaswordOnPasswordField(passwordValue);
		loginpage.loginButtonClick();
	}
   @Test
   public void VerifyWhetherTheUserIsAbleToLoginWithInvalidCredential() throws IOException {
		
	   String userNameValue = ExcelUtility.getStringData(3, 0, "LoginPage");
		String passwordValue = ExcelUtility.getStringData(3, 1, "LoginPage");
       LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userNameValue);
		loginpage.enterPaswordOnPasswordField(passwordValue);
		loginpage.loginButtonClick();
	}

}
