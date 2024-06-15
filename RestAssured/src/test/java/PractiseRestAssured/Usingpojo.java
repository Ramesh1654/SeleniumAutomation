package PractiseRestAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Usingpojo {
	
	//Post Request body using using POJO(Plain Old Java Object)
     
	@Test(priority=1)
	void pojomethod() {
		
		Pojo data = new Pojo();
		data.setName("Ramesh");
		data.setLocation("India");
		data.setPhone("123456");
		
		String coursearr[] = {"C","C++"};
		data.setCourse(coursearr);
		
		given()
		.contentType("application/json")
		.body(data)

		
		.when()
		.post("http://localhost:3000/Student")
		
		.then()
		.statusCode(201)
		.body("name",equalTo("Ramesh"))
		.body("location",equalTo("India"))
		.body("phone",equalTo("123456"))
		.body("course[0]",equalTo("C"))
		.body("course[1]",equalTo("C++"))
		.header("Content-Type","application/json")
		.log().all();			
	}
	
	@Test(priority=2)
	void delete() {
		
		given()
		
		.when()
		.delete("http://localhost:3000/Student/4")
		.then()
		.statusCode(404);		
	}
}
