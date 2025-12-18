package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constant.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
	HomePage home;
	ManageNewsPage manageNews;
	@Test
	public void verifyWhetherTheUserIsAbleToAddANews() throws IOException {
		 String usernamevalue=ExcelUtility.getStringData(0, 0, "Loginpage");
		 String passwordvalue=ExcelUtility.getStringData(0, 1, "Loginpage");
		 LoginPage loginPage=new LoginPage(driver);
			loginPage.enterUserNameOnUserNameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
			home=loginPage.loginButtonClick();
		 
		    manageNews = home.manageNewsButtonClick();
		 
		    manageNews.newButtonClick().enterNews().saveButtonClick();
		    
		    boolean alertIsDisplayed = manageNews.isAlertDisplayed();
			Assert.assertTrue(alertIsDisplayed,Constants.ADDNEWSERROR);

}
	@Test
	public void verifyWhetherTheUserIsAbleToSearchNews() throws IOException {
		 String usernamevalue=ExcelUtility.getStringData(0, 0, "Loginpage");
		 String passwordvalue=ExcelUtility.getStringData(0, 1, "Loginpage");
		 LoginPage loginPage=new LoginPage(driver);
			loginPage.enterUserNameOnUserNameField(usernamevalue).enterPasswordOnPasswordField(passwordvalue);
			home=loginPage.loginButtonClick();
		 
		    manageNews=home.manageNewsButtonClick();
			
		    manageNews.searchButtonClick().enterNewsTitle().searchSubmitClick();
	     
	     String expected = "Election 2025";
	     String actual = manageNews.getTheResult();
	     Assert.assertEquals(actual, expected, Constants.ADDNEWSERROR);
   
		
	}
}