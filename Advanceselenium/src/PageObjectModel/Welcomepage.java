package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
	Welcomepage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Register")
	 private WebElement registrationlink;
	
	@FindBy(linkText = "Log in")
	 private WebElement Loginlink;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement Shoppingcart;
	@FindBy(linkText = "Log out")
	private WebElement Logoutlink;
	
	

	public WebElement getLogoutlink() {
		return Logoutlink;
	}


	public WebElement getLoginlink() {
		return Loginlink;
	}


	public WebElement getShoppingcart() {
		return Shoppingcart;
	}


	public WebElement getRegistrationlink() {
		return registrationlink;
	}
	
	
	
	
	

}
