package Crossbrowsingtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Testcase extends Baseclass {
	@Test
	public void testcase() {
		
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("gecwneelu@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Neelu@123");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}

}
