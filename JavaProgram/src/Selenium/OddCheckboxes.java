package Selenium;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OddCheckboxes {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		
		List<WebElement> ele = driver.findElements(By.xpath("//input[contains(@type,'checkbox')]/parent::div"));
		System.out.println("size of checkboxes: "+ele.size());
        
		for(int i =0;i<ele.size();i++) { // This is the logic to print all check boxes
			if(i%2==0) {	
		String strr = ele.get(i).getText();
		System.out.println(strr);      
	      //This is the condition to print odd check boxes
		ele.get(i).click();
		}
//		Thread.sleep(15000);	

//		if(i%2!=0) {         //This is the condition to print Even check boxes
//			ele.get(i).click();
//		}
		}	
		
		Thread.sleep(10000);	
		driver.quit();
	}

}









