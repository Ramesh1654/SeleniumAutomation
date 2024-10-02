package Petdiseasealerts;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

public class Petdiseaseextentreports {

	public static WebDriver driver;
	static ExtentReports extentreports =new ExtentReports();
	static File file=new File("image1.html");
	
	static ExtentSparkReporter spartReporter=new ExtentSparkReporter(file);
	static ExtentTest test1=extentreports.createTest("TestcaseName 1", "TestCaseDescription");
	static ExtentTest test2=extentreports.createTest("TestcaseName 2", "TestCaseDescription");
	
public static void getExtentReport(String Browser, String statesmap,String statesnames) {
		
		extentreports.attachReporter(spartReporter);
		test1.info(Browser);
		test1.addScreenCaptureFromBase64String(capturescreenshot1(), Browser);
		test1.addScreenCaptureFromPath(capturescreenshot(statesmap), Browser);
		extentreports.flush();
}
public static void getScreenshot(String Browser, String statesmap,String statesnames) {
	
	extentreports.attachReporter(spartReporter);
	test2.info(Browser);
	test2.addScreenCaptureFromBase64String(capturescreenshot1(), statesnames);
	test2.addScreenCaptureFromPath(capturescreenshot(statesmap), statesnames);
	extentreports.flush();
}
	
	public static String capturescreenshot(String filename) {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File Sourcefile=ts.getScreenshotAs(OutputType.FILE);
	File Destfile=new File("./Screenshots/ + filename");
	try {
		Files.copy(Sourcefile, Destfile);
	}catch(IOException e) {
	e.printStackTrace();		
	}
	System.out.println("Screenshot - To Capture the Screenshot ans Store it in th Local Machine");
	return Destfile.getAbsolutePath();
	}
	
	public static String capturescreenshot1() {
		System.out.println("driver=" + driver);
		TakesScreenshot ts=(TakesScreenshot) driver;
		String base64code=ts.getScreenshotAs(OutputType.BASE64);
		System.out.println("Base64image has Returned");
		return base64code;
	}
}
