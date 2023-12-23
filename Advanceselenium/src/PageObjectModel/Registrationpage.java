package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage {
	 Registrationpage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	@FindBy(id="FirstName")
	private WebElement FirstName;
	@FindBy(id="LastName")
	private WebElement LastName;
	@FindBy(id="Email")
	private WebElement Email;
	@FindBy(id="Password")
	private WebElement Password;
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPassword;
	@FindBy(id="register-button")
	private WebElement registerbutton;
	public WebElement getFirstName() {
		return FirstName;
	}
	public void setFirstName(WebElement firstName) {
		FirstName = firstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public void setLastName(WebElement lastName) {
		LastName = lastName;
	}
	public WebElement getEmail() {
		return Email;
	}
	public void setEmail(WebElement email) {
		Email = email;
	}
	public WebElement getPassword() {
		return Password;
	}
	public void setPassword(WebElement password) {
		Password = password;
	}
	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(WebElement confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	
	


}
