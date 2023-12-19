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
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
		WebElement ele1=driver.findElement(By.xpath("//*[@id='heroSection-container']/div[4]/div/div/section/div/form/div[1]/div[1]/div/div/button"));
		ele1.sendKeys("C:\\Users\\admin\\Desktop\\File.txt");
		WebElement ele2=driver.findElement(By.linkText("submit"));
		ele2.click();
		driver.quit();
	}

}
