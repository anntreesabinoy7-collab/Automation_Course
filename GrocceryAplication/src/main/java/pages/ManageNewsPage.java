package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
public WebDriver driver;
	
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']") WebElement newbutton;
    @FindBy(xpath = "//textarea[@id='news']") WebElement newsbox;
    @FindBy(xpath = "//button[@type='submit']") WebElement savebutton;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement alert;
    @FindBy(xpath = "//a[@href='javascript:void(0)']") WebElement search;
    @FindBy(xpath = "//input[@name='un']") WebElement titlebox;
    @FindBy(xpath = "//button[@name='Search']") WebElement searchsubmit;
    @FindBy(xpath = "//td[text()='Election 2025']") WebElement result;
	
	
	   
    
    public ManageNewsPage newButtonClick() {
    	newbutton.click();
    	return this;
    }
    
    public ManageNewsPage enterNews() {
    	newsbox.sendKeys("Election 2025");
    	return this;
    }

    public ManageNewsPage saveButtonClick() {
    	savebutton.click();
    	return this;
    }
    
    public boolean isAlertDisplayed() {
    	return alert.isDisplayed();
    }
    
    public ManageNewsPage searchButtonClick() {
    	search.click();
    	return this;
    }
    
    public ManageNewsPage enterNewsTitle() {
    	titlebox.sendKeys("Election 2025");
    	return this;
    }
    
    public ManageNewsPage searchSubmitClick() {
    	searchsubmit.click();
    	return this;
    }
    
    public String getTheResult() {
    	return result.getText();
    }
}
