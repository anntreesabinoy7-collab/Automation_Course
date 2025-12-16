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
	@Test
	public void verifyWhetherTheUserIsAbleToAddANews() throws IOException {
		 String usernamevalue=ExcelUtility.getStringData(0, 0, "Loginpage");
		 String passwordvalue=ExcelUtility.getStringData(0, 1, "Loginpage");
		 LoginPage loginPage=new LoginPage(driver);
			loginPage.enterUserNameOnUserNameField(usernamevalue);
			loginPage.enterPasswordOnPasswordField(passwordvalue);
			loginPage.loginButtonClick();
		 
		 HomePage homepage = new HomePage(driver);
		    homepage.manageNewsButtonClick();
		 
		 ManageNewsPage managenewspage = new ManageNewsPage(driver);
		    managenewspage.newButtonClick();
		    managenewspage.enterNews();
		    managenewspage.saveButtonClick();
		    
		    boolean alertIsDisplayed = managenewspage.isAlertDisplayed();
			Assert.assertTrue(alertIsDisplayed,Constants.ADDNEWSERROR);

}
	@Test
	public void verifyWhetherTheUserIsAbleToSearchNews() throws IOException {
		 String usernamevalue=ExcelUtility.getStringData(0, 0, "Loginpage");
		 String passwordvalue=ExcelUtility.getStringData(0, 1, "Loginpage");
		 LoginPage loginPage=new LoginPage(driver);
			loginPage.enterUserNameOnUserNameField(usernamevalue);
			loginPage.enterPasswordOnPasswordField(passwordvalue);
			loginPage.loginButtonClick();
		 
		 HomePage homepage = new HomePage(driver);
		    homepage.manageNewsButtonClick();
			
	     ManageNewsPage managenewspage = new ManageNewsPage(driver);
	        managenewspage.searchButtonClick();
	        managenewspage.enterNewsTitle();
	        managenewspage.searchSubmitClick();
	     
	     String expected = "Election 2025";
	     String actual = managenewspage.getTheResult();
	     Assert.assertEquals(actual, expected, Constants.ADDNEWSERROR);
   
		
	}
}