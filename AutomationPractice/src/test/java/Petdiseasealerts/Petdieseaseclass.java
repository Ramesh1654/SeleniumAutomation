package Petdiseasealerts;

import java.awt.Desktop;
import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Petdieseaseclass extends Petdiseaseextentreports{

		//public static WebDriver driver;
		public static  Logger logger;
		
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			
			logger = Logger.getLogger("AutomationPractice");
			PropertyConfigurator.configure("log4j.properties");
			
			driver = new ChromeDriver();
			driver.get("https://petdiseasealerts.org/forecast-map");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			getScreenshot("Petdiseasealearts launched", "Google.jpg", "Google Page");
			logger.info("*****Petdiseasealerts applcation was launched*****");
			}
			public void Statesdisplaying() throws Throwable {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,400)", "");
			Thread.sleep(5000);
			getScreenshot("States page was displayed","states.jpg","states page");
			logger.info("*****Petdiseasealerts all states page was displayed*****");
			//}
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
			logger.info("*****Below All States was displayed*****");
			
			String Targetstate = "rhode-island";
			for(WebElement stateelement: states) {
				String Allstates= stateelement.getAttribute("id");
				System.out.println(Allstates);
				
			if(Allstates.equals(Targetstate)) {
				stateelement.click();
				System.out.println("Clicked on the state: "+Allstates);
				break;					
			}
			}			
			logger.info("*****State was displayed which state you have selected*****");	
			Thread.sleep(6000);
			driver.quit();
			Desktop.getDesktop().browse(new File("report3.html").toURI()); 
	}
}
