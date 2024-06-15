package PractiseRestAssured;

import org.json.JSONObject;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import static io.restassured.RestAssured.*;

public class Chainingcreateuser1 {
	
	@Test
	public void createuser() {
		
		Faker faker = new Faker();
		
		JSONObject Json = new JSONObject();
		Json.put("name", faker.name().fullName());
		Json.put("gender", "female");
		Json.put("email", faker.internet().emailAddress());
		Json.put("status", "active");
		
		String bearerToken = "fc5eb19587b4e2a5d3bfc6b991c2acec16b7d028f795fa6236dc02e0edc8d7e6";
		
		int id = 
		given()
			.header("Authorization", "Bearer " + bearerToken)
		    .contentType("application/json")
		    .body(Json.toString())
		        
		.when()
		    .post("https://gorest.co.in/public/v2/users")
		    .jsonPath().getInt("id");
		    
		System.out.println("Gernerated ID is: " + id);		
		
	}

}
