package SeleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base {
	public void verifyWebElementCommands() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement textbox = driver.findElement(By.id("single-input-field"));
		textbox.sendKeys("Ann Treesa Binoy");
		WebElement showmessagebutton = driver.findElement(By.id("button-one"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(5))// Total Duration.
		        .pollingEvery(Duration.ofSeconds(1))// time to Trigger.
		        .ignoring(NoSuchElementException.class);// to declare Exception.

		fluentWait.until(ExpectedConditions.elementToBeClickable(showmessagebutton));
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
