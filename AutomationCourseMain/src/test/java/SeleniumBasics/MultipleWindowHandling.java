package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base {
	public void verifyMultipleWindow() {
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String parentid = driver.getWindowHandle();
		WebElement clickhere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhere.click();
		
		Set<String> handleid = driver.getWindowHandles();
		Iterator<String> it = handleid.iterator();
		while(it.hasNext()) {
			String currentid = it.next();
			if(!currentid.equals(parentid));
			driver.switchTo().window(currentid);
			
			WebElement email = driver.findElement(By.name("emailid"));
			email.sendKeys("ann@gmail.com");
			
			WebElement submit = driver.findElement(By.name("btnLogin"));
			submit.click();
			
		}
	}

	public static void main(String[] args) {
		MultipleWindowHandling handling = new MultipleWindowHandling();
		handling.initializeBrowser();
		handling.verifyMultipleWindow();

	}

}
