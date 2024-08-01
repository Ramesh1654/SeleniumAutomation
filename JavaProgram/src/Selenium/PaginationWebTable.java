package Selenium;

import java.time.Duration;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class PaginationWebTable {
	public static WebDriver driver;
	
	public static void fluentWaitForElements(WebElement eleXpath, int withTimeout,int pollingEvery) {
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(withTimeout))
				.pollingEvery(Duration.ofSeconds(pollingEvery))
				.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
				wait.until(ExpectedConditions.visibilityOf(eleXpath));
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1600)", "");
		
		List<WebElement> listOfPageNums = driver.findElements(By.xpath("//*[@id='pagination']/li")); //common XPath for all pageNumbers
		System.out.println("listOfPageNums: "+listOfPageNums.size());
		
		for (int i =1; i <= listOfPageNums.size(); i++) {
			//iteration all pageNumbers
			WebElement pageNum = driver.findElement(By.xpath("//*[@id='pagination']/li[" + i + "]")); 
			fluentWaitForElements(pageNum, 10, 5);
			pageNum.click(); //clicking pageNumbers
			
			//common XPath for all rows
			List<WebElement> rowCount = driver.findElements(By.xpath("//*[@class='table-container']/table/tbody/tr")); 
			System.out.println("rowCount: "+rowCount.size());
			for (int j = 1; j <= rowCount.size() ; j++) { 
				//iteration rows to retrive 'id'
				String id = driver.findElement(By.xpath("//*[@class='table-container']/table/tbody/tr["+ j +"]/td[1]")).getText(); 
				System.out.print(id + "  ");
				//iteration rows to retrive 'name'
				String name = driver.findElement(By.xpath("//*[@class='table-container']/table/tbody/tr["+ j +"]/td[2]")).getText(); 
				System.out.print(name + "  ");
				//iteration rows to retrive 'price'
				String price = driver.findElement(By.xpath("//*[@class='table-container']/table/tbody/tr["+ j +"]/td[3]")).getText(); 
				System.out.println(price);
				
				//iterating checkboxes by row count
				WebElement checkBox = driver.findElement(By.xpath("//*[@id='productTable']/tbody/tr["+ j +"]/td[4]/input"));  
				checkBox.click(); //clicking checkboxes
			}
//			Thread.sleep(2000);
		}
		driver.quit();
	}

}
