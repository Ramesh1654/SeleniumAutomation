package PractiseRestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Testheader {
	
	@Test(priority=1)
	void testheaders() {
		
		given()
		
		.when()
		.get("https://www.google.com")
		
		.then()
		.header("Expires", "-1")
		.header("Cache-Control", "private, max-age=0")
		.header("Content-Type", "text/html; charset=ISO-8859-1");
		//.log().headers();
	}
		//@Test(priority=2)
		void getHeaders() {
			
			Response res = given()
			.when()
			.get("https://www.google.com");
			
			//To get single header
//			String headervalue = res.getHeader("Expires");
//			System.out.println("value of header "+headervalue);
//			
			//To get list of headers
			Headers  myheaders = res.getHeaders();
			
			for(Header hd:myheaders)
			{
				System.out.println(hd.getName()+"  "+hd.getValue());
			}			
		}	
	}

