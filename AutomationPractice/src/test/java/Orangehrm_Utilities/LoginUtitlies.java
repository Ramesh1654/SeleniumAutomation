package Orangehrm_Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LoginUtitlies {
	public static WebDriver driver;
	static ExtentReports extentreports =new ExtentReports();
	static File file=new File("report1.html");
	static ExtentSparkReporter spartReporter=new ExtentSparkReporter(file);
	static ExtentTest test1=extentreports.createTest("TestcaseName 1", "TestCaseDescription");
	static ExtentTest test2=extentreports.createTest("TestcaseName 2", "TestCaseDescription");
	
	public void addingFluentWait(long timeOuts, WebElement ele) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(timeOuts))
			       .pollingEvery(Duration.ofSeconds(5))
			       .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public static void getExtentReport(String msg, String path,String Desc) {
		
		extentreports.attachReporter(spartReporter);
		test1.info(msg);
		test1.addScreenCaptureFromBase64String(capturescreenshot11(), Desc);
		test1.addScreenCaptureFromPath(CaptureScreenshot(path), Desc);
		extentreports.flush();
	}
public static void getScreenshot(String msg, String path,String Desc) {
		
		extentreports.attachReporter(spartReporter);
		test2.info(msg);
		test2.addScreenCaptureFromBase64String(capturescreenshot11(), Desc);
		test2.addScreenCaptureFromPath(CaptureScreenshot(path), Desc);
		extentreports.flush();
	}
		public static String CaptureScreenshot(String filename) {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File Sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File Destfile=new File("./Screenshots/ + filename");
		try {
			FileUtils.copyFile(Sourcefile, Destfile);
		}catch(IOException e) {
		e.printStackTrace();		
		}
		System.out.println("Screenshot - To Capture the Screenshot ans Store it in th Local Machine");
		return Destfile.getAbsolutePath();
	}
		public static String capturescreenshot11() {
			System.out.println("driver=" + driver);
			TakesScreenshot ts=(TakesScreenshot) driver;
			String base64code=ts.getScreenshotAs(OutputType.BASE64);
			System.out.println("Base64image has Returned");
			return base64code;	
		}
	}
