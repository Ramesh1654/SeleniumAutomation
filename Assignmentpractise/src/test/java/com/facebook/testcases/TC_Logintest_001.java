package com.facebook.testcases;

import org.testng.annotations.Test;

import com.facebook.pageobjects.loginpage;

public class TC_Logintest_001 extends Baseclass {

	@Test
	public void logintest() throws Throwable {
		driver.get(URL);
		System.out.println("Title Name " + driver.getTitle());
		
		loginpage lp = new loginpage(driver);
		String strActual = lp.Enterlaptop("", "laptop");
		System.out.println("Need to validate this link:      " + strActual);
		lp.clickinglaptop();
		lp.addtocartbutton();
		lp.flipcartlogoclick();
		lp.cartbutton();
		lp.verify_Item_In_Cart(strActual);	//'call by value' concept
		lp.orderplacing();
		lp.EnterMobilenumber("9553481654");
		// lp.continuebutton();

	}
}
