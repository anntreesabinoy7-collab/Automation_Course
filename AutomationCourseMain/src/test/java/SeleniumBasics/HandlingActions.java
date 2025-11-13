package SeleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base{
	public void verifyRightClick() {
		WebElement rightclick = driver.findElement(By.id("others"));
		Actions action = new Actions(driver);
		action.contextClick(rightclick).build().perform();
		
		}
	
	public void verifyMousHover() {
		WebElement mousehover = driver.findElement(By.id("others"));
		Actions action = new Actions(driver);
		action.moveToElement(mousehover).build().perform();
		
	    }
	
	public void verifyDragAndDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement dragme = driver.findElement(By.id("draggable"));
		WebElement drophere = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragme, drophere).build().perform();

		}
	public void verifyKeyboardActions() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}
	
	

	public static void main(String[] args) {
		HandlingActions handlingactions = new HandlingActions();
		handlingactions.initializeBrowser();
		//handlingactions.verifyRightClick();
		//handlingactions.verifyMousHover();
		//handlingactions.verifyDragAndDrop();
		try {
			handlingactions.verifyKeyboardActions();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

}
