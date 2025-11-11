package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	
	public void initializeBrowser() {
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
	}
	public void browserQuitAndClose() {
		//driver.close();
		//driver.quit();
	}
	public static void main(String arg[]) {
		Base base = new Base();
		base.initializeBrowser();
		base.browserQuitAndClose();
	}

}
