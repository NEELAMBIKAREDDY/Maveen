package car;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1 {
	@Test(groups="smoke")
	public void car1() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bmw-bavariamotors.in/new-cars/I-series-I4?bmw_leadsource=googlesearch_bmwi4nov&gclid=Cj0KCQiAyeWrBhDDARIsAGP1mWSpNp4Wp0E_0Z7fDIOzCCAYqaskL5xneE-HoMtSJksRmbHGADfnEFEaAmHJEALw_wcB#testdriveform");
		
	}

}
