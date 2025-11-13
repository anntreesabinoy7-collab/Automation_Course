package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base{
	public void verifyFrames() {
		driver.navigate().to("https://demoqa.com/frames");    //driver nte control webpage il
		List <WebElement> totalframe = driver.findElements(By.tagName("iframe"));
		System.out.println(totalframe.size());
		
		WebElement frame1 = driver.findElement(By.id("frame1"));   //control frame1 il
		driver.switchTo().frame("frame1");
		
		WebElement framename = driver.findElement(By.id("sampleHeading")); // frame nte heading.
		System.out.println(framename.getText());
		
		driver.switchTo().defaultContent(); //control thirich webpage il
	}
	public static void main(String arg[]) {
		HandlingFrames frames = new HandlingFrames();
		frames.initializeBrowser();
		frames.verifyFrames();
	}
	

}
