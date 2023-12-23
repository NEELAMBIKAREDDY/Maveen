package selenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase extends Baseclass {
	@Test
	public void cart() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@value=\"Add to cart\"][1]\r\n")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	}

}
