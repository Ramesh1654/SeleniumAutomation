package Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("ram");
		
		WebElement Psword = driver.findElement(By.xpath("//input[@name='password']"));
		Psword.sendKeys("johnram");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//a[text()='Products'])[1]")).click();
        
		driver.findElement(By.xpath("(//span[@class='link'])[4]")).click();
        Thread.sleep(5000);
	    driver.findElement(By.xpath("(//a[text()='Customer Portal'])[1]")).click();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		
		//Moving from first page to middle page
		String currenthandle = driver.getWindowHandle();	
		Set<String>handles = driver.getWindowHandles();
		for(String actual:handles) {
			if(!actual.equalsIgnoreCase(currenthandle)) {
				driver.switchTo().window(actual);
			}
		}
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		WebElement link = driver.findElement(By.xpath("//a[text()='product documentation']"));

		JavascriptExecutor javascript = (JavascriptExecutor)driver;
		javascript.executeScript("arguments[0].scrollIntoView();", link);
		driver.findElement(By.xpath("//a[text()='product documentation']")).click();
		
		//Moving from middle page to last page
        String currenthandle1 = driver.getWindowHandle();		
		Set<String>handles1 = driver.getWindowHandles();
		for(String actual1:handles1) {
			if(!actual1.equalsIgnoreCase(currenthandle1)) {
				driver.switchTo().window(actual1);
			}
		}		
		String Title2 = driver.getTitle();		
		System.out.println("Title of the Page: "+Title2);
		
		//if you want to change from grand child to parent window we can perform two ways
		//1)using contains method
		//2)using title of the page
		
		String currenthandle2 = driver.getWindowHandle();		
		Set<String>handles2 = driver.getWindowHandles();
		for(String actual2:handles2) {
			if(!actual2.equalsIgnoreCase(currenthandle2)) {                                        
	    driver.switchTo().window(actual2);
	    if(driver.getTitle().contains("Automated Software Testing Tools - Ensure Quality - Parasoft"))
	    {
			break;
			}
		}
		}
		String Title3 = driver.getTitle();		
		System.out.println("Title of the Page: "+Title3);
		
        Thread.sleep(5000);      
	    driver.quit();		
	}
}
































