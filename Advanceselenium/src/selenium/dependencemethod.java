package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependencemethod {
	@Test (priority = 1,dependsOnMethods ="Register")//invocation-to execute test case repeatedly
	public void Login()
	{
		Reporter.log("login",true);//to print in console and report
	ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
		
	}
	@Test(priority = 2,invocationCount = 1,threadPoolSize  = 2)
	public void Logout()
	{
		Reporter.log("logout",true);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
			
		
	}
	@Test
	public void Register()
	{
		Reporter.log("Register",true);
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("register")).click();
			
	
			
		
	}

}
