package PageObjectModel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {

	@Test
	public void registration() throws IOException {
		WebDriver driver=new ChromeDriver();
		FileInputStream f=new FileInputStream("C:\\Users\\User\\Desktop\\Neelambika WS\\Advanceselenium\\excel\\excel.properties");
		Properties p=new Properties();
		p.load(f);
		String url = p.getProperty("url");
		driver.get(url);
		Welcomepage w=new Welcomepage(driver);
		w.getRegistrationlink().click();
		
		 Registrationpage reg=new Registrationpage(driver);
		 reg.getFirstName().sendKeys("abcd");
		 reg.getLastName().sendKeys("reddy");
		 reg.getEmail().sendKeys("neelugecw@gmail.com");
		 reg.getPassword().sendKeys("abcd123");
		 reg.getConfirmPassword()
		 .sendKeys("abcd123");
		 reg.getRegisterbutton().click();
		 w.getLogoutlink().click();
		 w.getLoginlink().click();
		 
		 Loginpage l=new Loginpage(driver);
		 l.getEmail().sendKeys("neelugecw@gmail.com");
		 l.getPassword().sendKeys("abcd123");
		 l.getLoginbutton().click();
		 
	}
}
