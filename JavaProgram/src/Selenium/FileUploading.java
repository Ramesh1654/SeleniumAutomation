package Selenium;

import java.time.Duration;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FileUploading {
	public static WebDriver driver;
	
	public static void fluentWaitForElements(WebElement eleXpath, int withTimeout,int pollingEvery) {
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(withTimeout))
				.pollingEvery(Duration.ofSeconds(pollingEvery))
				.ignoring(NoSuchElementException.class);
				wait.until(ExpectedConditions.visibilityOf(eleXpath));
	}
	
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
		WebElement ele = driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']"));
		fluentWaitForElements(ele, 10, 5);
		ele.click();
		
		String S1=driver.getTitle();
		System.out.println(S1);
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\admin\\Desktop\\File.txt");
		//Thread.sleep(3000);

		/*Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='pop_upload']"))).click();
		*/
		//driver.findElement(By.xpath("//*[@id='pop_upload']")).click();
		driver.quit();
	
	}
}
