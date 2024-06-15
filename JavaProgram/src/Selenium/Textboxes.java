package Selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textboxes {
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/&ddm=0&dsh=S335980600:1715941136963870&ec=asw-gmail-globalnav-create&flowEntry=SignUp&flowName=GlifWebSignIn&service=mail&TL=ALv_Gf8thEVhXtEnSDVouRqk6UNYBELggJL23SjDnDESWerxaJNtGc5TAlnffEgm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		List<WebElement> textbox = driver.findElements(By.xpath("//input[@type='text']/following-sibling::div"));
		System.out.println("Total No of Textboxes:" +textbox.size());
		
	// To Print all the Textboxes in a page
		
//        for(WebElement Count: textbox) {
//        	String Textboxnames = Count.getText();
//        	System.out.println(Textboxnames);
//		}
		for(int i=0;i<textbox.size();i++) {
			String Count= textbox.get(i).getText();
			System.out.println(Count);
		}
		Thread.sleep(5000);
		driver.close();
}
}	





