package Orangehrm_Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Orangehrm_Utilities.LoginUtitlies;

public class MyInfoPageObjects extends LoginUtitlies{

	public WebDriver Idriver;

	public MyInfoPageObjects(WebDriver rdriver) {
		Idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement Usernamefield;
	@FindBy(xpath = "//input[@type='password']")
	WebElement Passwordfield;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Login;
	@FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a")
	WebElement MyInfo;
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	WebElement Dropdown;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement Logout;

	public void EnterUserfield(String username) {
		Usernamefield.sendKeys(username);
	}

	public void EnterPasswordfield(String pasword) {
		Passwordfield.sendKeys(pasword);
	}

	public void loginbutton() {
		addingFluentWait(30, Login);
		Login.click();
	}
	public void Clickmyinfo() {
		addingFluentWait(30, MyInfo);
		MyInfo.click();
	}
	public void Dropdownbutton() {
		addingFluentWait(30, Dropdown);
		Dropdown.click();
	}

	public void Logoutbutton() {
		addingFluentWait(30, Logout);
		Logout.click();
	}
}
