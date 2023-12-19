package Cucumber.ExtentReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TakingScreenshotsInSequence {
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		// TODO Auto-generated method stub
		ExtentReports extentreports = new ExtentReports(); // Reporter Engine
		File file = new File("report.html");
		ExtentSparkReporter spartreporter = new ExtentSparkReporter(file);
		extentreports.attachReporter(spartreporter);

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

//		String getBase64Code = captureScreenshot(); // It will get the base64Code
//		String path = "Google.jpg"; // Pass the Screenshot Name (or) extension in below method

		// 1
		ExtentTest test1 = extentreports.createTest("TestCaseName 1", "TestCase Description"); // (TC_Name, Description)
		test1.info("/---URL 1 is Opened---/");
		test1.addScreenCaptureFromBase64String(captureScreenshot(), "URL 1 is Opened");
		test1.addScreenCaptureFromPath(captureScreenshot("Google.jpg"), "URL 1 is Opened");

//		test1.addScreenCaptureFromBase64String(getBase64Code, "Google Homepage #1");
//		test1.addScreenCaptureFromPath(path, "Google Homepage #1");
		WebElement element = driver.findElement(By.xpath("//*[@name='q']"));
		element.sendKeys("Amazon");
		element.sendKeys(Keys.ENTER);
		//ExtentTest test2 = extentreports.createTest("TestCaseName 2", "TestCase Description");
		test1.info("/---URL 2 is Opened---/");
		test1.addScreenCaptureFromBase64String(captureScreenshot(), "URL 2 is Opened");
		test1.addScreenCaptureFromPath(captureScreenshot("Amazon.jpg"), "URL 2 is Opened");

		driver.get("https://www.irctc.co.in/nget/");
		test1.info("/---URL 3 is Opened---/");
		test1.addScreenCaptureFromBase64String(captureScreenshot(), "URL 3 is Opened");
		test1.addScreenCaptureFromPath(captureScreenshot("w3schools.jpg"), "URL 3 is Opened");

		extentreports.flush();
		driver.quit();

		Desktop.getDesktop().browse(new File("report.html").toURI()); // To open Reports file Automatically from java
	}


	// Capturing Screenshot

	// 1. 'for file path' - To capture screenshot and store it in Local machine
	public static String captureScreenshot(String fileName) {
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/" + fileName);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot - To capture screenshot and store it in Local machine");
		return destFile.getAbsolutePath();
	}


	// 2. 'for Base64Code' - To return Base64 image
	public static String captureScreenshot() {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		String base64Code = takesScreenshot.getScreenshotAs(OutputType.BASE64);
		System.out.println("Screenshot - Base64 image Returned");
		return base64Code;
	}

}

