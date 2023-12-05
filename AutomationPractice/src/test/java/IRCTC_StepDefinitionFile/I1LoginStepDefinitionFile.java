package IRCTC_StepDefinitionFile;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import IRCTC_Pageobjects.I1LoginPageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class I1LoginStepDefinitionFile {
	public WebDriver driver;
	public Logger Logger;
	public I1LoginPageObjects loginpage;
	ChromeOptions options = new ChromeOptions();

	@Given("User Launch the Chrome Browser1")
	public void user_launch_the_chrome_browser1() {
		Logger=org.apache.log4j.Logger.getLogger("AutomationPractice");
		PropertyConfigurator.configure("log4j.properties");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Logger.info("**************ChromeBrowser was Lauched****************");
		loginpage = new I1LoginPageObjects(driver);
	}

	@When("User Opens the URL {string}")
	public void user_opens_the_url(String URL) {
		driver.get(URL);
		Logger.info("**************IRCTC Application was Opened************");

	}

	@Then("User Click on the Login button")
	public void user_click_on_the_login_button() {
		loginpage.Clicklogin();
		Logger.info("***********User Click on the Login Button*************");


	}

	@Then("Userr Enter thee Username as {string} && Password {string}")
	public void userr_enter_thee_username_as_password(String Username, String Password) {
		loginpage.Enterusername(Username);
		loginpage.Enterpassword(Password);
		Logger.info("*********User Enter the Username && Password******************");

	}

	@Then("User Click on the Signin button")
	public void user_click_on_the_signin_button() throws Throwable {
		Thread.sleep(15000);
		Logger.info("****************User Click on the Signin button************");
		loginpage.Clicksignin();
		
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
		Logger.info("*********IRCTC Homepage was Opened**********");
	}

	@When("User Click on the Logout button")
	public void user_click_on_the_logout_button() {
		loginpage.Clicklogout();
		Logger.info("***********User Logout successfully**********");
		driver.quit();

	}
}
