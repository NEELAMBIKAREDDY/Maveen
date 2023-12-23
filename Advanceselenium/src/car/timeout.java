package car;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class timeout {
	// used in banking application(payment)
	@Test(timeOut = 5000)
	public void time()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.carwale.com/tata-cars/indica/");
	}
	

}
