package Selenium;

import java.util.List;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		String Currenthandle = driver.getWindowHandle();
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String actual:handles) {
			if(!actual.equalsIgnoreCase(Currenthandle)) {
				driver.switchTo().window(actual);
				//Below line switching to the Amazon tab web site
				if(driver.getTitle().contains("Amazon")) {
					break;
				}
			}
		}
		
		
	//	WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		
//		// Opens a new tab in existing window
//		driver.switchTo().newWindow(WindowType.TAB);
//		
//		// Opens Browserstack homepage in the newly opened tab
//		driver.navigate().to("https://www.browserstack.com/");

	}

}







