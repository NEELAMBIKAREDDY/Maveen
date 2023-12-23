package TestngListner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listnerimplimentation.class)
public class Testcase {
	@Test
	public void testcase() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("nijroop12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Neelu@1");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Log out")).click();
	}

}
