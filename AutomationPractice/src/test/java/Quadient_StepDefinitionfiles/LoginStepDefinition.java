package Quadient_StepDefinitionfiles;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import IRCTC_Pageobjects.I1LoginPageObjects;
import Quadient_PageObjects.Loginpageobjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	public WebDriver driver;
	public Logger logger;
	public Loginpageobjects loginpage;
	ChromeOptions options = new ChromeOptions();

	@Given("Custmer Launch the Browser")
	public void custmer_launch_the_browser() {
	
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginpage = new Loginpageobjects(driver);
		logger.info("################ChromeBrowser was Lauched############");
	}
	@When("Custmer Open the Browser URL {string}")
	public void custmer_open_the_browser_url(String URL) {
	   driver.get(URL);
	    logger.info("#########info:  Quadient Application was Opened#########");
		logger.warn("#########warn:  Quadient Application was Opened#########");
		logger.error("########error: Quadient Application was Opened##########");
		logger.fatal("########fatal: Quadient Application was Opened##########");
		logger.debug("########fatal: Quadient Application was Opened##########");
	}
	
	@And("Custmer Enter the UserID as {string} && Passwrd as {string}")
	public void custmer_enter_the_user_id_as_passwrd_as(String Uservalue, String Paswrd) {
		loginpage.EnterUser(Uservalue);
		logger.info("#######Customer Enter the Username########");
		loginpage.EnterPass(Paswrd);
		logger.info("#######Customer Enter the Password########");		
	}
	
	@Then("Custmer Clicks the Signin button")
	public void custmer_clicks_the_signin_button() {
		loginpage.Clicksignin();
		logger.info("########Customer Click on the Signin button#########");

	}
	@And("Custmer Click on the Home icon")
	public void custmer_click_on_the_home_icon() {
		loginpage.ClickHomeicon();
		logger.info("########Customer Click on the Homeicon button#########");

	    
	}
//	@Then("HomePage was displayed Pagetitle as {string}")
//	public void home_page_was_displayed_pagetitle_as(String string) {
//	    
//	}
	@When("Custmer Clicks the Settings and Actions icon")
	public void custmer_clicks_the_settings_and_actions_icon() throws Throwable {
		Thread.sleep(5000);
		loginpage.ClicksettingandActions();
		logger.info("########Customer Click on the Settings and Actions button#########");

	}
	@Then("Custmer Click on the SignOut link")
	public void custmer_click_on_the_sign_out_link() {
		loginpage.ClickSignout();
		logger.info("#######Customer Click on the Sign Out link########");		

	   
	}
	@And("Custmer Click on the Confirm button")
	public void custmer_click_on_the_confirm_button() throws Throwable {
		loginpage.ClickConfirm();
		logger.info("#######Customer Click on the Confirm button########");
		Thread.sleep(3000);
		driver.quit();
	}
}
