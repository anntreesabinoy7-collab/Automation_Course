package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {
	public void verifyDropDown() {
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown1 = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(dropdown1);
		select.selectByIndex(2);
		//select.selectByValue("python");
		//select.selectByVisibleText("SQL");
	}
	
	public void verifyCheckBox() {
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='option-2']"));
		checkbox1.click();
	}
     
	public void verifyRadioButton() {
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        WebElement radiobutton1 = driver.findElement(By.xpath("//input[@value='purple']"));
        radiobutton1.click();
	}
	
	
	public static void main(String[] args) {
		HandlingDropDown handlingdropdown = new HandlingDropDown();
		handlingdropdown.initializeBrowser();
		//handlingdropdown.verifyDropDown();
		//handlingdropdown.verifyCheckBox();
		handlingdropdown.verifyRadioButton();
		

	}

}
