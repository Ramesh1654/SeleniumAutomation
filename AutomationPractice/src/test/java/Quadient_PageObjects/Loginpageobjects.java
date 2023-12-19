package Quadient_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpageobjects {

	public WebDriver Idriver;

	public Loginpageobjects(WebDriver rdriver) {
		rdriver = Idriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "userid")
	WebElement Uservalue;
	@FindBy(id = "password")
	WebElement Paswrd;
	@FindBy(id = "btnActive")
	WebElement SignInbutton;
	@FindBy(xpath = "//*[@id='pt1:_UIShome::icon']/g[4]/path")
	WebElement Homeicon;
	@FindBy(id = "pt1:_UIScmil2u")
	WebElement Settings;
	@FindBy(id = "Sign Out")
	WebElement Signout;
	@FindBy(id = "Confirm")
	WebElement Confirmbuttn;

	public void EnterUser(String Userid) {
	Uservalue.sendKeys(Userid);
	}
	public void EnterPass(String Password) {
		Paswrd.sendKeys(Password);
	}
	public void Clicksignin() {
		SignInbutton.click();	
	}
	public void ClickHomeicon() {
		Homeicon.click();	
	}
	public void ClicksettingandActions() {
		Settings.click();
	}
	public void ClickSignout() {
		Signout.click();
	}
	public void ClickConfirm() {
		Confirmbuttn.click();
	}
		
}	
	

