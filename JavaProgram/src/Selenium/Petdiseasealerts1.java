package Selenium;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Petdiseasealerts1 {
	public static WebDriver driver;
//	public static Logger logger;
	//public static ExtentReports extentreports;
	
	public static void main(String[] args) throws Throwable {
		
		ExtentReports extentreports = new ExtentReports();
		File file = new File("reports.html");
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
		extentreports.attachReporter(sparkreporter);
		
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Logger logger = Logger.getLogger("Petdiseasealerts1.class");
		PropertyConfigurator.configure("log4j.properties");
		
	    ExtentTest Test1 = extentreports.createTest("Testcase1","Description1");
	    Test1.info("URL Launched")
	    .addScreenCaptureFromPath(CaptureScreenshot("1.jpg"), "**URL Launched**");
		logger.info("*****Petdiseasealerts applcation was launched*****");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(5000);
		logger.info("*****Petdiseasealerts all states page was displayed*****");
		
		//Understand the Concept of Below code because using CSSSELECTOR(33&39)&&getAttribute(45) 
		
		//Finding how many Frames are there in a page
		List<WebElement>  totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of frames:  "+totalFrames.size());
		
		//Switching to frame to find out the state count
		WebElement iFrameElement = driver.findElement(By.xpath("//div[@class='capc-map-embed mode-widget']//iframe"));
		//WebElement iFrameElement = driver.findElement(By.cssSelector(".capc-map-embed mode-widget  iframe"));
		Thread.sleep(2000);
		driver.switchTo().frame(iFrameElement);
		Thread.sleep(2000);
		
		List<WebElement> states = driver.findElements(By.xpath("//*[@class='region']"));
		//List<WebElement> states = driver.findElements(By.cssSelector(".region"));
		int statesCount = states.size();
		System.out.println("Total no of States :"+statesCount);
		//Writing for each loop to print the country names	by using getAttribute	
		/*for(WebElement stateNames: states) {
			String _stateNames= stateNames.getAttribute("id");
			System.out.println(_stateNames);
		}*/				
		//Giving string to click on the required state
		Test1.info("All States was displayed")
	    .addScreenCaptureFromPath(CaptureScreenshot("2.jpg"), "**All States was displayed**");
		logger.info("*****Below All States was displayed*****");
		
		String Targetstate = "georgia";
		for(WebElement stateelement: states) {
			String Allstates= stateelement.getAttribute("id");
			System.out.println(Allstates);
			
		if(Allstates.equals(Targetstate)) {
			stateelement.click();
			Thread.sleep(3000);
			Test1.info("State was Clicked")
            .addScreenCaptureFromPath(CaptureScreenshot("3.jpg"), "**State was Clicked**");
			System.out.println("Clicked on the state: "+Allstates);
			break;					
		}
		}			
		logger.info("*****State was displayed which state you have selected*****");	
		Thread.sleep(6000); 
		extentreports.flush();
		driver.quit();
        Desktop.getDesktop().browse(new File("reports.html").toURI()); 
	 
	}
public static String CaptureScreenshot(String filename) {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File Sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File Destfile=new File("./Screenshots/" + filename);
		try {
			FileUtils.copyFile(Sourcefile, Destfile);
		}catch(IOException e) {
		e.printStackTrace();		
		}
		System.out.println("Screenshot - To Capture the Screenshot ans Store it in th Local Machine");
		return Destfile.getAbsolutePath();
	}
			
		}


