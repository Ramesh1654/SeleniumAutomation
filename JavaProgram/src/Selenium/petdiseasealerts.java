package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class petdiseasealerts {
	//public Logger logger;
	public static void main(String[] args) throws Throwable {
			
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File Sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File Destfile=new File("./screenshots/ + image");
		try {
			Files.copy(Sourcefile, Destfile);
		}catch(IOException e) {
		e.printStackTrace();		
		}
		//getExtentReports("Browser Launched", "image1");
		//logger.info("*********info: Petdieseasealerts application was launched*********");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(5000);
		
		TakesScreenshot ts1=(TakesScreenshot) driver;
		File Sourcefile1=ts1.getScreenshotAs(OutputType.FILE);
		File Destfile1=new File("./screenshots/ + image1");
		try {
			Files.copy(Sourcefile1, Destfile1);
		}catch(IOException e) {
		e.printStackTrace();		
		}
		
		WebElement f = driver.findElement(By.xpath("//div[@class='capc-map-embed mode-widget']/iframe"));
		driver.switchTo().frame(f);// Switching to iframe
		

		List<WebElement>countries = driver.findElements(By.xpath("//*[@class='region']"));
		int num = countries.size();
		System.out.println("Total no of Countries :"+num); //Printing the country size
		
		/*for(WebElement names:countries) {
			String countrynames = names.getText();
			System.out.println(countrynames);*/
			for(int i=0;i<=num;i++) {
				String count = countries.get(i).getText();
				System.out.print(count);
			}
				
Thread.sleep(3000);
driver.quit();
	}
}
