package SeleniumBasics;

import org.openqa.selenium.By;

public class HandlingLocators extends Base{
	public void verifyLocator() {
		 driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		 driver.findElement(By.id("button-one"));
		 driver.findElement(By.tagName("button"));
		 driver.findElement(By.className("btn btn-primary"));
		 driver.findElement(By.name("viewport"));
		 driver.findElement(By.linkText("Ajax Form Submission"));
		 driver.findElement(By.partialLinkText("Ajax"));
		 driver.findElement(By.cssSelector("button[id='button-one']"));
		 driver.findElement(By.xpath("//input[@id='single-input-field']"));
		 driver.findElement(By.xpath("//button[text()='Show Message']"));
		 driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		 driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
		 driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
		 driver.findElement(By.xpath("/div[@class='card']//child::button[@id='button-one']"));
		 driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		 driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));
		 driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
	 }

	public static void main(String[] args) {
		

	}

}
