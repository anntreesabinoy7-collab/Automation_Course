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
	
	@FindBy(id="user-name") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id="login-button") WebElement click;
	
	
	
	public void enterUserNameOnUserNameField(String userNameValue) {
		username.sendKeys(userNameValue);

	}
	public void enterPaswordOnPasswordField(String passwordValue) {
		password.sendKeys(passwordValue);

	}
	public void loginButtonClick() {
		click.click();

	}

}
