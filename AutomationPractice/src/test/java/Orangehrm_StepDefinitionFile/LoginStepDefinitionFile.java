package Orangehrm_StepDefinitionFile;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Orangehrm_Pageobjects.loginpageobjects;
import Orangehrm_Utilities.LoginUtitlies;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitionFile extends LoginUtitlies{
	//public WebDriver driver;
	public Logger logger;
	public loginpageobjects pageobjects;
	ChromeOptions options = new ChromeOptions();
	
	@Given("User Launch the Chrome Browser")
	public void user_launch_the_chrome_browser() {
		logger = Logger.getLogger("AutomationPractice");
		PropertyConfigurator.configure("log4j.properties");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		logger.info("******ChromeBrowser was Lauched*****");
		pageobjects = new loginpageobjects(driver);
	   
	}
	@When("User Opens the URL {string}")
	public void user_opens_the_url(String URL) {
		driver.get("https://www.google.co.in/");
		getExtentReport("URL A launched", "Google 1.jpg", "Description 1");
		driver.get(URL);
		logger.info("**************info: Orangehrm Application was Opened************");
		logger.warn("**************warn: Orangehrm Application was Opened************");
		logger.error("************error: Orangehrm Application was Opened************");
		logger.fatal("************fatal: Orangehrm Application was Opened************");
		logger.debug("************fatal: Orangehrm Application was Opened************");
    
	}
	@Then("User Enter the Userfiledname as {string} && Passwordfield {string}")
	public void user_enter_the_userfiledname_as_passwordfield(String Userfiledname, String Passwordfield) {
		pageobjects.EnterUsername(Userfiledname);
		pageobjects.EnterPassword(Passwordfield);
		getExtentReport("URL B launched", "Google 2.jpg", "Description 2");
		logger.info("***********User Entered the Username && Password*************");


	}
	
	@And("User Click on the Login button")
	public void user_click_on_the_login_button() {
		logger.info("***********User Click on the Login Button*************");
		pageobjects.Clicklogin();
		getExtentReport("URL C launched", "Google 3.jpg", "Description 3");

	}
	
	@When("Page Title should be {string}")
	public void page_title_should_be(String Expectedtitle) throws Throwable {
		String Expectedtitle1 = "OrangeHRM";
		String Actualtitle = driver.getTitle();
		if (Actualtitle.equals(Expectedtitle1)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		Thread.sleep(5000);
		logger.info("*********OrangeHRM Homepage was Opened**********");
	}
	
	@And("User Click on the Userdropdown")
	public void user_click_on_the_userdropdown() throws Throwable {
		logger.info("***********User Click on the Userdropdown*************");
		pageobjects.Clickdropdown();
		getExtentReport("URL D launched", "Google 4.jpg", "Description 4");
		Thread.sleep(6000);
	}
	@Then("User Select & Click on the Logout button")
	public void user_select_click_on_the_logout_button() throws Throwable {
		logger.info("***********User Click on the Logout Button*************");
		pageobjects.Clicklogout();
		getExtentReport("URL E launched", "Google 5.jpg", "Description 5");
		Thread.sleep(5000);
		driver.quit();
	}
}
