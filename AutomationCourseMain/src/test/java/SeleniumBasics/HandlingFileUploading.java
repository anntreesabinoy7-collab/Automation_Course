package SeleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUploading extends Base{
public void verifyFileUploadingUsingsendKeys() {
	driver.navigate().to("https://demo.guru99.com/test/upload/");
	WebElement fileupload = driver.findElement(By.id("uploadfile_0"));
	fileupload.sendKeys("C://Users//User//git//Automation_Course//AutomationCourseMain//src//main//resources//codeconventions.pdf");

	WebElement checkbox = driver.findElement(By.id("terms"));
	checkbox.click();
	
	WebElement submit = driver.findElement(By.id("submitbutton"));
	submit.click();
	
}

public void verifyFileUploadingUsingRobotClass() throws AWTException {
	driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
	WebElement fileuploading = driver.findElement(By.id("pickfiles"));
	fileuploading.click();
	StringSelection se = new StringSelection("C:\\Users\\User\\git\\Automation_Course\\AutomationCourseMain\\src\\main\\resources\\codeconventions.pdf");	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(se, null);
	
	Robot r = new Robot();
	r.delay(2500);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
	public static void main(String[] args) {
		HandlingFileUploading fileuploading = new HandlingFileUploading();
		fileuploading.initializeBrowser();
		//fileuploading.verifyFileUploadingUsingsendKeys();
		try {
			fileuploading.verifyFileUploadingUsingRobotClass();
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
		//fileuploading.browserQuitAndClose();
	}

}
