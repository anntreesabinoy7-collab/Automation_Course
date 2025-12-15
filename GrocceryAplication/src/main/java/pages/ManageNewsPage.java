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
	
	
	   
    
    public void newButtonClick() {
    	newbutton.click();
    }
    
    public void enterNews() {
    	newsbox.sendKeys("Election 2025");
    }

    public void saveButtonClick() {
    	savebutton.click();
    }
    
    public boolean isAlertDisplayed() {
    	return alert.isDisplayed();
    }
    
    public void searchButtonClick() {
    	search.click();
    }
    
    public void enterNewsTitle() {
    	titlebox.sendKeys("Election 2025");
    }
    
    public void searchSubmitClick() {
    	searchsubmit.click();
    }
    
    public String getTheResult() {
    	return result.getText();
    }
}
