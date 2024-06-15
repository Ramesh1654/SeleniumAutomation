package com.facebook.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public String URL = "https://www.flipkart.com/";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--incognito");
		//driver = new ChromeDriver(options);
		driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	public void teardown() {
		driver.quit();
		System.out.println("All Browserwindows closed");

	}

}
