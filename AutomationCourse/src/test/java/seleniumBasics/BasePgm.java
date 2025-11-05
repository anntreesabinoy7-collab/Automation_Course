package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePgm {
	public WebDriver driver;
	
	public void initializeBrowser() {
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
	}
	
	public void browserCloseAndQuit() {
		//driver.close();
		//driver.quit();
	}
	
  public static void main(String arg[]) {
	  BasePgm base = new BasePgm();
	  base.initializeBrowser();
	  base.browserCloseAndQuit();
  }
}
