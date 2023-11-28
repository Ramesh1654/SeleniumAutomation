package IRCTC_Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class I1LoginPageObjects {
	
@FindBy(linkText="LOGIN")
	WebElement login;

@FindBy(xpath="//form/div[1]/input[@type='text']")
	WebElement Username;
@FindBy(xpath="//form/div[2]/input[@type='password']")
WebElement Password;
@FindBy(linkText="SIGN IN")
WebElement signin;
@FindBy(linkText="Logout")
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













