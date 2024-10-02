package Selenium;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Testpetclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentReports extentreports = new ExtentReports();
		File file = new File("reports.html");
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
		extentreports.attachReporter(sparkreporter);

	}

}
