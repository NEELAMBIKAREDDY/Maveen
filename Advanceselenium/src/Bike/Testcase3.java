package Bike;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase3 {
	@Test(groups="smoke")
	public void Bike1() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bajajauto.com/");
}

}
