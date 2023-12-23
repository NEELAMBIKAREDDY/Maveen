package Bike;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase2 {
	@Test(groups="regression")
	public void Bike2() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
	}

}
