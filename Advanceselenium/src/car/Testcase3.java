package car;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase3 {
	@Test(groups="smoke")
	public void car3() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercedes-benz.co.in/passengercars.html?group=all&subgroup=see-all&view=BODYTYPE&gagcmid=GA_20685282646_153411963263_677718176048&gad_source=1&gclid=Cj0KCQiAyeWrBhDDARIsAGP1mWTuNtpcX_xBkP1z3t_pWpXBe53WMWBda8cuaQIpGup89x1Q2oz6Mo4aAnuoEALw_wcB&gclsrc=aw.ds");
	}

}
