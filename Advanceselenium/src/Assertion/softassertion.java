package Assertion;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertion {
	
	ChromeDriver driver;
	@Test ()

public void register()
	{driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	
	String BeforeRegistration = driver.findElement(By.linkText("Register")).getText();
	
	driver.findElement(By.linkText("Register")).click();
	
	driver.findElement(By.id("FirstName")).sendKeys("sujata");
	driver.findElement(By.id("LastName")).sendKeys("rudra");
WebElement ele = driver.findElement(By.id("Email"));
ele.sendKeys("haga@gmail.com");
driver.findElement(By.id("Password")).sendKeys("sujat123");
driver.findElement(By.id("ConfirmPassword")).sendKeys("sujat123");
driver.findElement(By.id("register-button")).click();
String afterregistration = driver.findElement(By.xpath("//a[text()='haga@gmail.com']")).getText();
SoftAssert s=new SoftAssert();
s.assertNotEquals(BeforeRegistration, afterregistration);
//s.assertAll();
	

}
}
