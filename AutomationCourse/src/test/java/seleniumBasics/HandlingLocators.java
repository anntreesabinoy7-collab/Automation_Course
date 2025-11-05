package seleniumBasics;

import org.openqa.selenium.By;

public class HandlingLocators extends BasePgm{
	 public void verifyLocator() {
		 driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		 driver.findElement(By.id("button-one"));
		 driver.findElement(By.tagName("button"));
		 driver.findElement(By.className("btn btn-primary"));
		 driver.findElement(By.name(""));
		 driver.findElement(By.linkText("Ajax Form Submission"));
		 driver.findElement(By.partialLinkText("Ajax"));
	 }

	public static void main(String[] args) {
		

	}

}
