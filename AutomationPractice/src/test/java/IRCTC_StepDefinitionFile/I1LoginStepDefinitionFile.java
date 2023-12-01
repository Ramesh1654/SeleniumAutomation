package IRCTC_StepDefinitionFile;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import IRCTC_Pageobjects.I1LoginPageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class I1LoginStepDefinitionFile {
	public WebDriver driver;
	public I1LoginPageObjects loginpage;
	ChromeOptions options = new ChromeOptions();

	@Given("User Lauch the Chrome Browser")
	public void user_lauch_the_chrome_browser() {
		// WebDriverManager.chromedriver().setup();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginpage = new I1LoginPageObjects(driver);
	}

	@When("User Opens the URL {string}")
	public void user_opens_the_url(String URL) {
		driver.get(URL);
	}

	@Then("User Click on the Login button")
	public void user_click_on_the_login_button() {
		loginpage.Clicklogin();

	}

	@Then("User Enter the Username as {string} && Password {string}")
	public void user_enter_the_username_as_password(String Username, String Password) {
		loginpage.Enterusername(Username);
		loginpage.Enterpassword(Password);

	}

	@Then("User Click on the Signin button")
	public void user_click_on_the_signin_button() {
		loginpage.Clicksignin();

	}

	@When("Page Title should be {string}")
	public void page_title_should_be() {
		String Expectedtitle = "IRCTC Next Generation eTicketing System";
		String Actualtitle = driver.getTitle();
		if (Actualtitle.equals(Expectedtitle)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@When("User Click on the Logout button")
	public void user_click_on_the_logout_button() {
		loginpage.Clicklogout();
	}
}
