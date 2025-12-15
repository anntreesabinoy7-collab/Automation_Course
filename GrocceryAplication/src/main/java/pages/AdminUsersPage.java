package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage {
public WebDriver driver;
	
	public AdminUsersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//a[@onclick='click_button(1)']") WebElement newbutton;
	@FindBy(xpath = "//input[@id='username']") WebElement username;
	@FindBy(xpath = "//input[@id='password']") WebElement password;
	@FindBy(xpath = "//select[@id='user_type']") WebElement usertype;
	@FindBy(xpath = "//button[@name='Create']") WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement Alertmsg;
	@FindBy(xpath = "//a[@onclick='click_button(2)']") WebElement searchbutton;
	@FindBy(xpath = "//input[@id='un']") WebElement searchusername;
	@FindBy(xpath = "//select[@id='ut']") WebElement searchusertype;
	@FindBy(xpath = "//button[@name='Search']") WebElement submitbutton;
	@FindBy(xpath = "//td[text()='Ann Treesa Binoy']") WebElement searcheduser;
	@FindBy(xpath = "//a[text()=' Reset']") WebElement resetbutton;
	@FindBy(xpath="//h4[text()='Admin Users']//ancestor::div[@class='card']") WebElement adminUsersList;
	

	
	////div[@class='alert alert-success alert-dismissible']
	
	
	public void newButtonClick() {
		newbutton.click();
	}
	
	public void enterUserNameOnUserNameField(String usernamevalue1) {
		username.sendKeys(usernamevalue1);
	}
	
	public void enterPasswordOnPasswordField(String passwordvalue1) {
		password.sendKeys(passwordvalue1);
	}
	
	public void selectUserType() {
	    Select select = new Select(usertype);
	    select.selectByIndex(2);   // Use the Select object
	}
	
	public void saveButtonClick() {
		savebutton.click();
	}
	
	public void searchButtonClick() {
		searchbutton.click();
	}
	
	public void usernameSearchButtonClick(String usernamevalue1) {
		searchusername.sendKeys(usernamevalue1);
	}
	
	public void searchUserTypeButton() {
		Select select = new Select(searchusertype);
	    select.selectByIndex(2); 
	}
	
	public void submitButtonClick() {
		submitbutton.click();
	}
	
	public void resetButtonClick() {
		resetbutton.click();
	}

	
	public String  getSearchedUser() {
		return searcheduser.getText().trim();
	}
	
	public Boolean getAlertMessage() {
		return Alertmsg.isDisplayed();
	}
	
	public boolean isAdminUsersListDisplayed() {
		return adminUsersList.isDisplayed();
	}
	
}

