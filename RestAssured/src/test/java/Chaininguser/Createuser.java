package Chaininguser;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class Createuser {
	
	@Test()
	void testcreateuser(ITestContext context) {

		Faker faker = new Faker();

		JSONObject jsonobj = new JSONObject();
		jsonobj.put("name", faker.name().fullName());
		jsonobj.put("gender", "female");
		jsonobj.put("email", faker.internet().emailAddress());
		jsonobj.put("status", "active");

		String bearerToken = "fc5eb19587b4e2a5d3bfc6b991c2acec16b7d028f795fa6236dc02e0edc8d7e6"; 
		
		int id = // int bcz here we are returning the id here id is int type
		given()
			.header("Authorization", "Bearer " + bearerToken)
			.contentType("application/json")
			.body(jsonobj.toString())

		.when()
			.post("https://gorest.co.in/public/v2/users") 
			.jsonPath().getInt("id");

		System.out.println("Generated ID is: " + id);
		
		context.setAttribute("user_id", id);
	}
}
