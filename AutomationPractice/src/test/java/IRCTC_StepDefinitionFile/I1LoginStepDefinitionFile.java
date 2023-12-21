package IRCTC_StepDefinitionFile;

import java.awt.Desktop;
import java.io.File;
import java.time.Duration;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import IRCTC_Pageobjects.I1LoginPageObjects;
import IRCTC_Utilities.I1LoginUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class I1LoginStepDefinitionFile extends I1LoginUtilities {
	// static WebDriver driver;// DONT WRITE WEBDRIVER IN STEPDEFINITION FILE IF U WRITE HERE 
	//U WILL GET NULL POINTER EXCEPTION && WEBDRIVER WILL DECLARE IN UTILITILES FILE
	public Logger logger;
	public I1LoginPageObjects loginpage;
	// public ExtentCasesRreports TestReports;
	// public I1LoginUtilities Utility;
	ChromeOptions options = new ChromeOptions();

	@Given("User Launch the Chrome Browser1")
	public void user_launch_the_chrome_browser1() {

		logger = Logger.getLogger("AutomationPractice");

		PropertyConfigurator.configure("log4j.properties");

		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		logger.info("**************ChromeBrowser was Lauched****************");
		loginpage = new I1LoginPageObjects(driver);
		// System.out.println("driver="+driver); // To cross check driver is initialized
		// or not

	}

	@When("User Opens the URL {string}")
	public void user_opens_the_url(String URL) {
		driver.get("https://www.google.co.in/");
		getExtentReport("URL 1 Launched", "Google1.jpg", "Description 1");
		driver.get(URL);
		getExtentReport("URL 2 Launched", "Google2.jpg", "Description 2");
		logger.info("**************info: IRCTC Application was Opened************");
		logger.warn("**************warn: IRCTC Application was Opened************");
		logger.error("************error: IRCTC Application was Opened************");
		logger.fatal("************fatal: IRCTC Application was Opened************");
		logger.debug("************fatal: IRCTC Application was Opened************");

	}

	@Then("User Click on the Login button")
	public void user_click_on_the_login_button() {
		loginpage.Clicklogin();
		getExtentReport("URL 2A Launched", "Google3.jpg", "Description 3");
		logger.info("***********User Click on the Login Button*************");

	}

	@Then("Userr Enter thee Username as {string} && Password {string}")
	public void userr_enter_thee_username_as_password(String Username, String Password) {
		loginpage.Enterusername(Username);
		logger.info("*********User Enter the Username******************");
		loginpage.Enterpassword(Password);
		logger.info("*********User Enter the Password******************");

	}

	@Then("User Click on the Signin button")
	public void user_click_on_the_signin_button() throws Throwable {
		Thread.sleep(15000);
		getExtentReport("URL 2B Launched", "Google4.jpg", "Description 4");
		logger.info("****************User will Click on the Signin button************");
		loginpage.Clicksignin();
		logger.info("****************User Clicked on the Signin button************");

	}

	@When("Page Title should be {string}")
	public void page_title_should_be(String Expectedtitle) throws Throwable {
		getExtentReport("URL 2C Launched", "Google5.jpg", "Description 5");
		String Expectedtitle1 = "IRCTC Next Generation eTicketing System";
		String Actualtitle = driver.getTitle();
		if (Actualtitle.equals(Expectedtitle1)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		Thread.sleep(5000);
		logger.info("*********IRCTC Homepage was Opened**********");
	}

	@When("User Click on the Logout button")
	public void user_click_on_the_logout_button() throws Throwable {
		loginpage.Clicklogout();
		logger.info("***********User Logout successfully**********");
		getExtentReport("URL 2D Launched", "Google6.jpg", "Description 6");
		driver.quit();
		Desktop.getDesktop().browse(new File("report.html").toURI()); // To open Reports file Automatically from java
	}
}
