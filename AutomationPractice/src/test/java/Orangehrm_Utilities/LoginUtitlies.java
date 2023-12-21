package Orangehrm_Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LoginUtitlies {
	public static WebDriver driver;
	static ExtentReports extentreports =new ExtentReports();
	static File file=new File("report1.html");
	static ExtentSparkReporter spartReporter=new ExtentSparkReporter(file);
	static ExtentTest test1=extentreports.createTest("TestcaseName 1", "TestCaseDescription");
	public static void getScreenshot(String message, String path,String Desc) {
		
		extentreports.attachReporter(spartReporter);
		test1.info(message);
		test1.addScreenCaptureFromBase64String(capturescreenshot11(), Desc);
		test1.addScreenCaptureFromPath(CaptureScreenshot(path), Desc);
		extentreports.flush();
	}
		public static String CaptureScreenshot(String filename) {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File Sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File Destfile=new File("/.Screenshots/ + filename");
		try {
			FileUtils.copyFile(Sourcefile, Destfile);
		}catch(IOException e) {
		e.printStackTrace();		
		}
		System.out.println("Screenshot - To Capture the Screenshot ans Store it in th Local Machine");
		return Destfile.getAbsolutePath();
	}
		public static String capturescreenshot11() {
			System.out.println("driver="+driver);
			TakesScreenshot ts=(TakesScreenshot) driver;
			String base64code=ts.getScreenshotAs(OutputType.BASE64);
			System.out.println("Base64image has Returned");
			return base64code;	
		}
	}
