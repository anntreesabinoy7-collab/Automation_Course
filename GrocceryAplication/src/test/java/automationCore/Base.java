package automationCore;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import constant.Constants;
import utilities.ScreenshotUtility;

public class Base {
	Properties prop;
	FileInputStream f; 
	public WebDriver driver;
	@BeforeMethod
	 public void initializeBrowser() throws IOException {
		prop = new Properties();
		f = new FileInputStream(Constants.CONFIGFILE);
		prop.load(f);
		 driver= new ChromeDriver();
		 driver.get(prop.getProperty("url"));
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 }
	 @AfterMethod
	 public void driverQuit(ITestResult iTestResult) throws IOException {

			if (iTestResult.getStatus() == ITestResult.FAILURE) {

				ScreenshotUtility screenShot = new ScreenshotUtility();
				screenShot.getScreenshot(driver, iTestResult.getName());
			}
			//driver.quit();

		} // iTestResult.getStatus() ➝ Returns an integer (e.g., 1,2,3)

}
