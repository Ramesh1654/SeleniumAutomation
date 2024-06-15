package com.facebook.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asignmentflipkart {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver;

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='text' or title='Search for Products, Brands and More']"));
		ele.sendKeys("laptop");
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img")).click();
		Thread.sleep(5000);
		System.out.println("Window Name " + driver.getTitle());

		String Parentwindow = driver.getWindowHandle();
		for (String childwindow : driver.getWindowHandles()) {
			if (!childwindow.equalsIgnoreCase(Parentwindow)) {
				driver.switchTo().window(childwindow);
				// driver.switchTo().window(Parentwindow);
			}
		}
		System.out.println("Window Name1 " + driver.getTitle());
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]")).click();
		//driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[1]/div[1]/div/div/img")).click();
		System.out.println("Laptop added to cart successfully");
		Thread.sleep(5000);
		System.out.println("Click on the flipkart logo");
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(5000);
		
		System.out.println("Window Name2 " + driver.getTitle());
        driver.findElement(By.xpath("(//*[contains(@title, 'Cart')])[2]")).click();
		
//		WebElement ele1=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		ele1.sendKeys("9553481654");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();

		Thread.sleep(5000);
		// driver.quit();
	}

}
