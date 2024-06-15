package PractiseRestAssured;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

public class Cookies {
	
	@Test(priority=1)
	void testcookies() {
		
		given()
		
		.when()
		.get("https://www.google.com")
		
		.then()
		//.statusCode(200)
		.log().all();		
	}
	//@Test(priority=2)
	void getcookieinfo() {
		Response res = given()
				
		.when()
		.get("https://www.google.com");
		
		//to get single cookie value
		
		String cookie_value = res.getCookie("AEC");
		System.out.println("Value of Cookie is==>"+cookie_value);
		
		//get all cookies list 
		Map<String, String> cookieslist = res.getCookies();
		System.out.println(cookieslist.keySet());
		
		//Another method to get all cookies list
		for(String k:cookieslist.keySet()) 
		{
			String Cookievalue = res.getCookie(k);
			System.out.println(k+"              "+Cookievalue);
		}
				
	}
}
