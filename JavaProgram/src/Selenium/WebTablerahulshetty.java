package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablerahulshetty {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//*[@id='product']/tbody/tr[6]/td[text()='Joe']"));
		System.out.println(""+ele.getText());
		js1.executeScript("arguments[0].scrollIntoView();", ele);
		
		/*Thread.sleep(1000);
		driver.quit();*/
	}

}
