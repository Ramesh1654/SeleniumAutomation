package com.facebook.pageobjects;

import static org.testng.Assert.assertTrue;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class loginpage {
	WebDriver Idriver;

	public loginpage(WebDriver rdriver) {
		this.Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}	
	//@FindBy(xpath = "//input[@type='text' or title='Search for Products, Brands and More']")
	@FindBy(xpath="//input[@name='q']")
    WebElement Typelaptop;//Entering laptop text 
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img")
    //@FindBy(xpath="//*[@id='container']/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[1]/div[1]/div/div/img")
	WebElement clicklaptop;
	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement addtocart;
	@FindBy(tagName="a")
	WebElement flipcartlogo;
	@FindBy(xpath="(//*[contains(@title, 'Cart')])[2]")
	WebElement clickoncart;
	
	@FindBy(xpath="//span[text()='Place Order']")
    WebElement placeanorder;
    @FindBy(xpath="//input[@type='text']")
    WebElement Mobilenumber;
//    @FindBy(xpath="//*[text()='CONTINUE']")
//    WebElement Continue ;
	
	public String Enterlaptop(String str, String laptop) throws InterruptedException {
		Typelaptop.sendKeys(laptop);
		Typelaptop.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		List<WebElement> links = Idriver.findElements(By.xpath("//a/div[2]/div[1]/div[2]"));
		System.out.println("Total links:  "+links.size());
		for(int i=0; i<=links.size()-1; i++) {
			str = links.get(i).getText();
			if(i==0) {
			return str;
			}
		}
		return str;		
	}
	public void clickinglaptop() throws Throwable {
		clicklaptop.click();
		String Parentwindow = Idriver.getWindowHandle();
		for (String childwindow : Idriver.getWindowHandles()) {
			if (!childwindow.equalsIgnoreCase(Parentwindow)) {
				Idriver.switchTo().window(childwindow);
			}
		}
	}
	
	public void addtocartbutton() throws Throwable {
		Thread.sleep(5000);
		addtocart.click();
		
	}
	public void flipcartlogoclick() throws Throwable {
		flipcartlogo.click();
		Thread.sleep(10000);
	}
	public void cartbutton() {
		clickoncart.click();
	}
	
	public void verify_Item_In_Cart(String strActual) throws Throwable {
		Thread.sleep(10000);

		List<WebElement> links = Idriver.findElements(By.xpath("//div/div[2]/div/div[1]/div[1]/div[1]/a"));
		System.out.println("Total links:  "+links.size());
		for(int i=0; i<=links.size()-1; i++) {
			String str = links.get(i).getText();	//Expected
			System.out.println("========"+str);
			String str2 = str.toLowerCase();
			
			String Actual = strActual.toLowerCase();	//Actual
			int size = Actual.length();
			String Actual2 = Actual.substring(0, size-3);
			String Actual3 = Actual2.toLowerCase();
			
			if(i==1) { 
				System.out.println("First link:     "+Actual3);
				System.out.println("Second link:    "+str2);
				boolean result = str2.contains(Actual3) ;
					System.out.println("-----------results-------------"+result);
					assertTrue(result, "--------------Cart Validation Done--------------");
					System.out.println("--------------Cart Validation Done--------------");
			}	
		} 
	}
	
	public void orderplacing() throws Throwable {
		placeanorder.click();
		Thread.sleep(5000);
		

	}
	
	public void EnterMobilenumber(String Number) throws Throwable {
		Mobilenumber.sendKeys(Number);
		Thread.sleep(10000);
		Mobilenumber.sendKeys(Keys.F5);
		System.out.println("Page was Refreshed");
		
//	}
//	public void continuebutton() {
//	Continue.click();
//	}
	
	
	
	
	
	
	
	
	
	
	}	
}

