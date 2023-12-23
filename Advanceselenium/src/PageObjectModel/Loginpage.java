package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	Loginpage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	@FindBy(id="Email")
	private WebElement Email;
	@FindBy(id="Password")
	private WebElement Password;
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPassword() {
		return Password;
	}
	
	@FindBy(className = "button-1 login-button")
	private WebElement loginbutton;
	public WebElement getLoginbutton() {
		return loginbutton;
	}

}
