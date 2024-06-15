package PractiseRestAssured;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Exrenaljsonfile {
	
	//Post Request body using using external json file
	
	@Test(priority=1)
	void jsonfilemethod() throws FileNotFoundException  {
		
		File file = new File(".\\body.json");
		FileReader fr = new FileReader(file);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject data = new JSONObject(jt);
		
		given()
		.contentType("application/json")
		.body(data.toString())
		
		.when()
		.post("http://localhost:3000/students")
				
		.then()
		.statusCode(201)
		.body("name",equalTo("Kim"))
		.body("location",equalTo("US"))
		.body("phone",equalTo("98876543213"))
		.body("courses[0]",equalTo("C"))
		.body("courses[1]",equalTo("C++"))
		.header("Content-Type","application/json")
		.log().all();		
	}
	@Test(priority=2)
	void delete() {
		
		given()
		
		.when()
		.delete("http://localhost:3000/students/4")
		
		.then()
		.statusCode(404);
			
	}
}
