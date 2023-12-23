package car;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase2 {
	//@Test(groups="regression")
	@Test(dependsOnGroups = {"smoke","regression"})
	public void car2() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.carwale.com/tata-cars/indica/");
	}

}
