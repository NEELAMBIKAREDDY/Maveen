package Assertion;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert1 {
	@Test
	public void testcase()
	{
		String expected = "https://demowebshop.tricentis.com/";
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String actual = driver.getCurrentUrl();
		
		//SoftAssert s=new SoftAssert();
		 assertEquals(expected,actual);
		 Reporter.log("testcase pass",true);
	}

}
