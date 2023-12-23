package selenium;

import java.sql.Driver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program {


	@Test (priority = 1,invocationCount = 3)//invocation-to execute test case repeatedly
	public void Login()
	{
		Reporter.log("login",true);//to print in console and report
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.naukari.com");
		
		
	}
	@Test(priority = 2)
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
		driver.get("https://www.flipkart.com");
			
		
	}
}
