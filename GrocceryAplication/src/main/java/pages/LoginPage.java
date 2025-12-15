package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//input[@name='username']") WebElement userName;
	@FindBy(xpath ="//input[@name='password']") WebElement password;
	@FindBy(xpath = "//button[text()='Sign In']") WebElement loginbutton;
	@FindBy(xpath ="//p[text()='Dashboard']") WebElement dashboard;
	@FindBy(xpath = "//b[text()= '7rmart supermarket']") WebElement title;
    @FindBy(xpath = "//h5[text()=\" Alert!\"]") WebElement alert;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']") WebElement dashboard2;
	@FindBy(xpath = "//button[@class='close']") WebElement closebutton;
	
	
	//h5[text()=" Alert!"]
	
	public void enterUserNameOnUserNameField(String usernamevalue) {
		userName.sendKeys(usernamevalue);
	}
	public void enterPasswordOnPasswordField(String passwordvalue) {
		password.sendKeys(passwordvalue);
	}
	public void loginButtonClick() {
		loginbutton.click();
	}
	
	public boolean isDashboardDisplayed() {
		return dashboard.isDisplayed();
	}
	
	public String getTheTitle() {
		return title.getText();
	}
	
	public String isAlertDisplayed() {
		return alert.getText();
	}
	
    public boolean isdashboard2Displayed() {
    	return dashboard2.isDisplayed();
    }
    
    public boolean isclosebuttondisplayed() {
    	return closebutton.isDisplayed();
    }
}
