package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ele=driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']"));
		ele.click();
		driver.findElement(By.xpath("//button[text()='Or select file to upload']"));
		ele.sendKeys("D:\\Resume\\Ramesh_3QA");
		driver.quit();
	}

}
