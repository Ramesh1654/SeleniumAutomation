package PractiseRestAssured;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import static io.restassured.RestAssured.*;

public class Chianingupdateuser {
	
	@Test()
	void Updateuser(ITestContext context) {
		
		Faker faker = new Faker();
		
		JSONObject json = new JSONObject();
		json.put("name",faker.name().fullName());
		json.put("gender", "female");
		json.put("email", faker.internet().emailAddress());
		json.put("status", "active");
		
		int id = (Integer) context.getAttribute("user_id");
		
		String Bearertoken = "fc5eb19587b4e2a5d3bfc6b991c2acec16b7d028f795fa6236dc02e0edc8d7e6";
		
		given()
			.header("Authorization", "Bearer " +Bearertoken)
		    .contentType("application/json")
		    .body(json.toString())
		    .pathParam("id",id)
		    
	    .when()
	        .post("https://gorest.co.in/public/v2/users/{id}")
	        
	    .then()
	        .statusCode(404)
	        .log().all();
	}

}






