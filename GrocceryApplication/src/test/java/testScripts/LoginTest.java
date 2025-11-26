package testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.ExcelUtility;
import automationCore.Base;
import pages.LoginPage;

public class LoginTest extends Base{
	@Test
	public void VerifyWhetherTheUserIsAbleToLoginWithValidCredential() throws IOException {
		String userNameValue = ExcelUtility.getStringData(0, 0, "loginPage");
		String passwordValue = ExcelUtility.getStringData(0, 1, "loginPage");
        
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userNameValue);
		loginpage.enterPaswordOnPasswordField(passwordValue);
		loginpage.signInButtonClick();
	}
	@Test 
public void VerifyWhetherTheUserIsAbleToLoginWithValidUsernameAndInvalidPssword() throws IOException {
		
    	String userNameValue = ExcelUtility.getStringData(1, 0, "loginPage");
		String passwordValue = ExcelUtility.getStringData(1, 1, "loginPage");
        
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userNameValue);
		loginpage.enterPaswordOnPasswordField(passwordValue);
		loginpage.signInButtonClick();
	}
	@Test
public void VerifyWhetherTheUserIsAbleToLoginWithInvalidUsernameAndValidPassword() throws IOException {
	
	String userNameValue = ExcelUtility.getStringData(2, 0, "loginPage");
	String passwordValue = ExcelUtility.getStringData(2, 1, "loginPage");
    
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(userNameValue);
	loginpage.enterPaswordOnPasswordField(passwordValue);
	loginpage.signInButtonClick();
}
@Test
public void VerifyWhetherTheUserIsAbleToLoginWithInvalidCredential() throws IOException {
	
    String userNameValue = ExcelUtility.getStringData(3, 0, "loginPage");
	String passwordValue = ExcelUtility.getStringData(3, 1, "loginPage");
   
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(userNameValue);
	loginpage.enterPaswordOnPasswordField(passwordValue);
	loginpage.signInButtonClick();
}

}
