package Orangehrm_Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPageObjects {

	public WebDriver Idriver;

	public MyInfoPageObjects(WebDriver rdriver) {
		Idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement Username;
	@FindBy(xpath = "//input[@type='password']")
	WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Login;
	@FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a")
	WebElement MyInfo;
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	WebElement Dropdown;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement Logout;

	public void Userfield(String usrname) {
		Username.sendKeys(usrname);
	}

	public void Passwordfield(String paswrd) {
		Password.sendKeys(paswrd);
	}

	public void loginbutton() {
		Login.click();
	}
	public void Clickmyinfo() {
		MyInfo.click();
	}
	public void Dropdownbutton() {
		Dropdown.click();
	}

	public void Logoutbutton() {
		Logout.click();
	}
}
