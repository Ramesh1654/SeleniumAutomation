package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Admin']")).click();
		WebElement ele = driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		//Counting no of rows
		
		List<WebElement>rowss = driver.findElements(By.xpath("//div[@class='oxd-table-body']"));
		System.out.println("No of rows: "+rowss.size());
		
		List<WebElement> rows = driver.findElements(By.xpath("//div[@role='columnheader']"));
		//List<WebElement> rows = driver.findElements(By.xpath("//div[@class='oxd-table-header-cell oxd-padding-cell oxd-table-th']"));
		System.out.println(rows.size());
		for(WebElement eleText: rows) {
			System.out.println(eleText.getText());
		}
		driver.quit();
		//}	
	}
}








