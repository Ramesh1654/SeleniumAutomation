package ExtentPackage;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentCasesRreports {
	//public static void main(String[] args) {
	public static void Extentmethod() {
		// TODO Auto-generated method stub
		ExtentReports extentreports = new ExtentReports(); // Reporter Engine
		File file = new File("report.html");
		ExtentSparkReporter spartreporter = new ExtentSparkReporter(file);
		extentreports.attachReporter(spartreporter);
		//ExtentTest test1 = extentreports.createTest("TestCaseName 1", "TestCase Description"); // (TC_Name, Description)
		//test1.info("/---URL 1 is Opened---/");

	}

}
