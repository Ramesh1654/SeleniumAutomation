package Orangehrm_StepDefinitionFile;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Orangehrm_Pageobjects.loginpageobjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitionFile {
	public WebDriver driver;
	public loginpageobjects pageobjects;
	ChromeOptions options = new ChromeOptions();
	
	@Given("User Launch the Chrome Browser")
	public void user_launch_the_chrome_browser() {
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		pageobjects = new loginpageobjects(driver);
	   
	}
	@When("User Opens the URL {string}")
	public void user_opens_the_url(String URL) {
		driver.get(URL);
	    
	}
	@Then("User Enter the Userfiledname as {string} && Passwordfield {string}")
	public void user_enter_the_userfiledname_as_passwordfield(String Userfiledname, String Passwordfield) {
		pageobjects.EnterUsername(Userfiledname);
		pageobjects.EnterPassword(Passwordfield);
	}
	
	@And("User Click on the Login button")
	public void user_click_on_the_login_button() {
		pageobjects.Clicklogin();
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
	}
	
	@And("User Click on the Userdropdown")
	public void user_click_on_the_userdropdown() throws Throwable {
		pageobjects.Clickdropdown();
		Thread.sleep(6000);

	}
	@Then("User Select & Click on the Logout button")
	public void user_select_click_on_the_logout_button() throws Throwable {
		pageobjects.Clicklogout();
		Thread.sleep(5000);
		driver.quit();
	}
}
