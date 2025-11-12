package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void verifyWebElementCommands() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement textbox = driver.findElement(By.id("single-input-field"));
		textbox.sendKeys("Ann Treesa Binoy");
		WebElement showmessagebutton = driver.findElement(By.id("button-one"));
		showmessagebutton.click();
		System.out.println(showmessagebutton.isDisplayed());
		System.out.println(showmessagebutton.isEnabled());
		WebElement text = driver.findElement(By.id("message-one"));
		System.out.println(text.getText());
		System.out.println(text.getTagName());
		textbox.clear();
		System.out.println(showmessagebutton.getCssValue("background-color"));
	}

	public static void main(String[] args) {
		WebElementCommands cmds = new WebElementCommands();
		cmds.initializeBrowser();
		cmds.verifyWebElementCommands();
		
	}

}
