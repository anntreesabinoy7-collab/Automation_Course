package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SeleniumBasics.DemoBase;

public class LoginTest extends DemoBase {
	@Test
	public void VerifyWhetherTheUserIsAbleToLoginWithValidCredential() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("performance_glitch_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement click = driver.findElement(By.id("login-button"));
		click.click();
	}
	
    @Test
    public void VerifyWhetherTheUserIsAbleToLoginWithValidUsernameAndInvalidPssword() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("performance_glitch_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Ann_Treesa_1234");
		
		WebElement click = driver.findElement(By.id("login-button"));
		click.click();
	}

    @Test
    public void VerifyWhetherTheUserIsAbleToLoginWithInvalidUsernameAndValidPassword() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("AnnTreesa_Binoy");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement click = driver.findElement(By.id("login-button"));
		click.click();
	}
   @Test
   public void VerifyWhetherTheUserIsAbleToLoginWithInvalidCredential() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("AnnTreesa_Binoy");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Ann_Treesa_1234");
		
		WebElement click = driver.findElement(By.id("login-button"));
		click.click();
	}

}
