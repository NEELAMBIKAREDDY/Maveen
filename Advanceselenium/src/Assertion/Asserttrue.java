package Assertion;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserttrue {

	@Test
	public void testcase()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		boolean b = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
	assertFalse(b, "radio clicked");
		
	}
}
