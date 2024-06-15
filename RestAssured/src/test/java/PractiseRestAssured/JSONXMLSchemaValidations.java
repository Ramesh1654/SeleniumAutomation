package PractiseRestAssured;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.module.jsv.JsonSchemaValidator;
import static io.restassured.RestAssured.given;


public class JSONXMLSchemaValidations {
	
	@Test	
	void jsonschemavaldations() {
		
		given()
		
		.when()
		.get("http://localhost:3000/new1") //json file
		
		.then()
		.assertThat()
		.statusCode(200)
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("new1schema.json")); //schema file
		}
	
	//@Test
	void XMLschemavalidation() {
		given()
		
		.when()	
		.get("")
		
		.then()
		.assertThat().body(RestAssuredMatchers.matchesXsdInClasspath(""));
	}

}
