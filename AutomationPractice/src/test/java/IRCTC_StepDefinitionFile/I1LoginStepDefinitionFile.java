package IRCTC_StepDefinitionFile;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import IRCTC_Pageobjects.I1LoginPageObjects;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class I1LoginStepDefinitionFile {
	public WebDriver driver;
	public Logger logger;
	public I1LoginPageObjects loginpage;
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
	}

	@When("User Opens the URL {string}")
	public void user_opens_the_url(String URL) {
		driver.get(URL);
		logger.info("**************info: IRCTC Application was Opened************");
		logger.warn("**************warn: IRCTC Application was Opened************");
		logger.error("************error: IRCTC Application was Opened************");
		logger.fatal("************fatal: IRCTC Application was Opened************");
		logger.debug("************fatal: IRCTC Application was Opened************");

	}

	@Then("User Click on the Login button")
	public void user_click_on_the_login_button() {
		loginpage.Clicklogin();
		logger.info("***********User Click on the Login Button*************");

	}

	public void teardown(Scenario sc) {
		System.out.println("Tear Down method executed...");
		if (sc.isFailed() == true) {
			String fielwithPath = "C:\\Users\\admin\\Desktop\\RAM";
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File(fielwithPath);
			try {
				FileUtils.copyFile(SrcFile, DestFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
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
		logger.info("****************User will Click on the Signin button************");
		loginpage.Clicksignin();
		logger.info("****************User Clicked on the Signin button************");

	}

	@When("Page Title should be {string}")
	public void page_title_should_be(String Expectedtitle) throws Throwable {
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
	public void user_click_on_the_logout_button() {
		loginpage.Clicklogout();
		logger.info("***********User Logout successfully**********");
		driver.quit();
	}

	public void addscreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}

}
