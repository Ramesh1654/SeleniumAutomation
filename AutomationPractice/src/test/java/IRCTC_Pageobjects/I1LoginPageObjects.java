package IRCTC_Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class I1LoginPageObjects {
	WebDriver Idriver;

	public I1LoginPageObjects(WebDriver rDriver) {
		Idriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	@FindBy(linkText = "LOGIN")
	WebElement login;

	@FindBy(xpath = "//form/div[1]/input[@type='text']")
	WebElement Username;
	@FindBy(xpath = "//form/div[2]/input[@type='password']")
	WebElement Password;
	@FindBy(xpath = "//button[text()='SIGN IN']")
	WebElement signin;
	@FindBy(linkText = "Logout")
	WebElement logout;

	public void Clicklogin() {
		login.click();
	}

	public void Enterusername(String UserNme) {
		Username.sendKeys(UserNme);
	}

	public void Enterpassword(String Paswrd) {
		Password.sendKeys(Paswrd);
	}

	public void Clicksignin() {
		signin.click();
	}

	public void Clicklogout() {
		logout.click();
	}
}
