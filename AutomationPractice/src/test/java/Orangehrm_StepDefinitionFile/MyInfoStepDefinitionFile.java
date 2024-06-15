package Orangehrm_StepDefinitionFile;

import java.awt.Desktop;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Orangehrm_Pageobjects.MyInfoPageObjects;
import Orangehrm_Utilities.LoginUtitlies;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyInfoStepDefinitionFile extends LoginUtitlies{
	//public WebDriver driver;
	public MyInfoPageObjects InfoObjects;
	
	ChromeOptions options = new ChromeOptions();
	
	@Given("User Lauch the Chrome Browser")
	public void user_lauch_the_chrome_browser() {
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		InfoObjects = new MyInfoPageObjects(driver);
	   
	}
	@When("User Opens the OrangeHrmURL {string}")
	public void user_opens_the_orange_hrm_url(String OrangeHrmURL) {
		driver.get("https://www.google.co.in/");
		getScreenshot("Google launched", "Google.jpg", "Google Page");
		driver.get(OrangeHrmURL);
	    
	}
	@And("User Enter the Username as {string} && Password {string}")
	public void user_enter_the_username_as_password(String Username, String Password) throws Throwable {
		InfoObjects.Userfield(Username);
		InfoObjects.Passwordfield(Password);
		getScreenshot("login Page", "User&Pass.jpg", "Entering Username & Password");
	}
	
	@Then("User Click on the OrangehrmLogin button")
	public void user_click_on_the_orangehrm_login_button() {
		InfoObjects.loginbutton();
		getScreenshot("OrangehrmPage", "HomePage.jpg", "OrangeHrm Page was displayed");
	}
	
	@When("Pagee Title should be {string}")
	public void pagee_title_should_be(String Expectedtitle) {
		String Expectedtitle1 = "OrangeHRM";
		String Actualtitle = driver.getTitle();
		if (Actualtitle.equals(Expectedtitle1)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	@And("User Click on the My Info")
	public void user_click_on_the_my_info()   {
		InfoObjects.Clickmyinfo();
		getScreenshot("Clickmyinfo button", "Clickmyinfo.jpg", "User Clicked on Clickmyinfo");
	}
	
	@Then("Userr Click on the Userdropdown")
	public void userr_click_on_the_userdropdown()   {
		InfoObjects.Dropdownbutton();
		getScreenshot("Dropdownbutton", "Dropdown.jpg", "Dropdown was displayed");
	}
	@And("User Click on the HRMLogout button")
	public void user_click_on_the_hrm_logout_button() throws IOException   {
		InfoObjects.Logoutbutton();
		getScreenshot("Logoutbutton", "Logout.jpg", "User Loggerout successfully");
		driver.quit();
		
		// To open Reports file Automatically from java
		
		Desktop.getDesktop().browse(new File("report1.html").toURI()); 
	}
}
