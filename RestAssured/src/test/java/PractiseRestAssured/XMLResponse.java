package PractiseRestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.*;

import static io.restassured.RestAssured.given;

//https://help.talend.com/en-US/studio-user-guide/8.0-R2024-05/example-of-xml-payload-testing

public class XMLResponse {
	
	@Test
	void Responsexml() {
		
	String jsondata ="{\r\n"
			+ "  \"id\": 0,\r\n"
			+ "  \"category\": {\r\n"
			+ "    \"id\": 0,\r\n"
			+ "    \"name\": \"string\"\r\n"
			+ "  },\r\n"
			+ "  \"name\": \"doggie\",\r\n"
			+ "  \"photoUrls\": [\r\n"
			+ "    \"string\"\r\n"
			+ "  ],\r\n"
			+ "  \"tags\": [\r\n"
			+ "    {\r\n"
			+ "      \"id\": 0,\r\n"
			+ "      \"name\": \"string\"\r\n"
			+ "    }\r\n"
			+ "  ],\r\n"
			+ "  \"status\": \"available\"\r\n"
			+ "}";
	RequestSpecification reqspec = RestAssured.given();
	
	reqspec.baseUri("https://petstore.swagger.io");
	reqspec.basePath("/v2/pet");
	reqspec.header("accept","application/xml");
	reqspec.header("Content-Type","application/json");
	reqspec.body(jsondata);
	
	Response response = reqspec.post(); //RequestType
	
	response.prettyPrint(); //print
	
	Assert.assertEquals(response.statusCode(), 200);
	response.then().body("Pet.photoUrls.photoUrl", Matchers.equalTo("string")); 
	
	
	
	}
}
