package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//input[@name='username']") WebElement userName;
	@FindBy(xpath ="//input[@name='password']") WebElement password;
	@FindBy(xpath = "//button[text()='Sign In']") WebElement loginbutton;
    @FindBy(xpath = "//a[@data-toggle='dropdown']") WebElement logoutbutton;
    @FindBy(xpath ="//a[@class='dropdown-item' and normalize-space()='Logout']") WebElement logout;
    @FindBy(xpath ="//button[text()=\"Sign In\"]") WebElement signin;
    @FindBy(xpath ="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-admin']") WebElement moreinfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']") WebElement moreinfobutton;



    
    public HomePage logoutButtonClick() {
    	logoutbutton.click();
    	return this;
    }
    
    public LoginPage logoutClick() {
    	logout.click();
    	return new LoginPage(driver);
    }
    
    public boolean isSignInDisplayed() {
		return signin.isDisplayed();
    	
    }
    
    public AdminUsersPage adminUsersMoreInfoButtonClick() {
    	moreinfo.click();
    	return new AdminUsersPage(driver);
    }
    
    public ManageNewsPage manageNewsButtonClick() {
		moreinfobutton.click();
		return new ManageNewsPage(driver);
	}


}