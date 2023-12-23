package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoshop_dependency {
	ChromeDriver driver;
	@Test(priority = 1)
	public void register()
	{
	   driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("neelu");
		driver.findElement(By.id("LastName")).sendKeys("reddy");
	WebElement ele = driver.findElement(By.id("Email"));
	ele.sendKeys("nijroop123@gmail.com");
driver.findElement(By.id("Password")).sendKeys("Neelu@12");
driver.findElement(By.id("ConfirmPassword")).sendKeys("Neelu@12");
driver.findElement(By.id("register-button")).click();
driver.findElement(By.linkText("nijroop123@gmail.com")).isDisplayed();


		
		
		
		
	}
	
	
	@Test(priority = 2)
	
	public void login()throws InterruptedException {
	//	ChromeDriver driver=new ChromeDriver();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("nijroop12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Neelu@12");
		driver.findElement(By.className("button-1 login-button")).click();
		driver.findElement(By.linkText("Log out")).isDisplayed();
		
		
	}
	@Test(priority = 3)
	public void logout() {
	//	ChromeDriver driver=new ChromeDriver();
		driver.findElement(By.linkText("Log out")).click();
				
		
	}

}
