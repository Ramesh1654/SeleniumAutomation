package Orangehrm_Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpageobjects {
	WebDriver Idriver;

	public loginpageobjects(WebDriver rdriver) {
		Idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement Username;
	@FindBy(xpath = "//input[@type='password']")
	WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Login;

	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	WebElement Dropdown;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement Logout;

	public void EnterUsername(String usrname) {
		Username.sendKeys(usrname);
	}

	public void EnterPassword(String paswrd) {
		Password.sendKeys(paswrd);
	}

	public void Clicklogin() {
		Login.click();
	}

	public void Clickdropdown() {
		Dropdown.click();
	}

	public void Clicklogout() {
		Logout.click();
	}

}
