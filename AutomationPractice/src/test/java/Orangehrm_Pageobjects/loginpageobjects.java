package Orangehrm_Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpageobjects {
	public WebDriver Edriver;

	public loginpageobjects(WebDriver Fdriver) {
		Edriver = Fdriver;
		PageFactory.initElements(Fdriver, this);
	}

	@FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement Userfiledname;
	@FindBy(xpath = "//input[@type='password']")
	WebElement Passwordfield;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Login;

	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	WebElement Dropdown;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement Logout;

	public void EnterUsername(String usrname) {
		Userfiledname.sendKeys(usrname);
	}

	public void EnterPassword(String paswrd) {
		Passwordfield.sendKeys(paswrd);
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
