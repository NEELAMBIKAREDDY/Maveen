package Crossbrowsingtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class Baseclass {
	public static WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void openbrowser(String browser)
	{
		if (browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			driver.get("https://demowebshop.tricentis.com/"); 

		}
		else {
			driver=new EdgeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			
		}
		
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}

}
