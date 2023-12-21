package IRCTC_Utilities;

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

public class I1LoginUtilities {
	public static WebDriver driver;
	static ExtentReports extentreports = new ExtentReports(); // Reporter Engine
	static File file = new File("report.html");
	static ExtentSparkReporter spartreporter = new ExtentSparkReporter(file);

	static ExtentTest test1 = extentreports.createTest("TestCaseName 1", "TestCase Description"); // (TC_Name, Description)


	public static void getExtentReport(String msg, String path, String Desc) {

		// TODO Auto-generated method stub
		// ExtentReports extentreports = new ExtentReports(); // Reporter Engine
		// File file = new File("report.html");
		//ExtentSparkReporter spartreporter = new ExtentSparkReporter(file);
		extentreports.attachReporter(spartreporter);

		test1.info(msg);
		test1.addScreenCaptureFromBase64String(captureScreenshot(), Desc);
		//test1.addScreenCaptureFromPath(captureScreenshot(path), Desc);

//			test1.addScreenCaptureFromBase64String(getBase64Code, "Google Homepage #1");
//			test1.addScreenCaptureFromPath(path, "Google Homepage #1");
		extentreports.flush();
//		Desktop.getDesktop().browse(new File("report.html").toURI()); // To open Reports file Automatically from java
	}

	
	// Capturing Screenshot

	// 1. 'for file path' - To capture screenshot and store it in Local machine
	public static String captureScreenshot(String fileName) {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
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
		System.out.println("driver="+driver);
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		String base64Code = takesScreenshot.getScreenshotAs(OutputType.BASE64);
		System.out.println("Screenshot - Base64 image Returned");
		return base64Code;
	}
}
