package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectDropdownWithValue(WebElement element, String value) {
        Select object = new Select(element);
		object.selectByValue(value);
    }
	
   public void rightClickWithValue(WebDriver driver,WebElement element) {
	  Actions actions = new Actions(driver);
		actions.contextClick(element).build().perform();
   }
   
   public void mouseHoverWithValue(WebDriver driver,WebElement element) {
      Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
   }
   
   public void pressEnterKey(WebDriver driver) {
	    Actions actions = new Actions(driver);
	    actions.sendKeys(Keys.ENTER).perform();
   }
   public void selectDropdownWithIndex(WebElement element, int value) {

		Select object = new Select(element);
		object.selectByIndex(value);;
   }

}
