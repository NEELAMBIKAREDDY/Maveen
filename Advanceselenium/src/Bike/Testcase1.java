package Bike;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1 {
	@Test(groups="smoke")
	public void Bike1() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ktm.com/");
	}

}
