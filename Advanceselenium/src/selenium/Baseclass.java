package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Baseclass {
	ChromeDriver driver;
	@BeforeSuite
	public void connectToserver()
	{
		Reporter.log("connecting to server",true);
		
	}
	@BeforeTest
	public void connectTodatabase()
	{
		Reporter.log("connecting to database",true);
		
		
	}
	@BeforeClass
	public void openthebrowser()
	{
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("nijroop12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Neelu@12");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass
	public void closethebrowser()
	{
		driver.quit();
		Reporter.log("close the browser",true);
		
	
	}
	@AfterTest
	public void closethedatabase()
	{
		Reporter.log("discoonect to database",true);
		
		
	}
	@AfterSuite
	public void closetheserver()
	{
		Reporter.log("disconnect to server",true);
		
		
	}
}
