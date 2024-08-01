package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		System.out.println("" + driver.getTitle());
		Thread.sleep(3000);
		//List<WebElement> ele = driver.findElements(By.xpath("/html/body/form/div[2]/div[17]/table"));
		List<WebElement> ele = driver.findElements(By.xpath("//tr/td/label"));
		int num = ele.size();
		int num2 = num-2;
		System.out.println("Total No of Check boxes     " + num2);
//	for(int i=0;i<ele.size();i++) {
//		ele.get(i).click();
//	}
		for (int i=0; i<num; i++) {
			if(i>=2) {
			String str = ele.get(i).getText();
			System.out.println(str);
			//ele.get(i).click();
			}
			if(i%2!=0) {
				ele.get(i).click();
			}
		}
		Thread.sleep(4000);
 		driver.quit();
	}
}
