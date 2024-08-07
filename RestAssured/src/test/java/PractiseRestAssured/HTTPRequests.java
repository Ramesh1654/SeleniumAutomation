package PractiseRestAssured;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class HTTPRequests {
	
	int id;
	
	@Test(priority=1)
	void getUser()
	{
		given()
		.when()
	    .get("https://reqres.in/api/users?page=2")
		     
		.then()
		.statusCode(200)
		.body("page",equalTo(2))
		.log().all();
	}
	@Test(priority=2)
	void createUser()
	{
		HashMap data=new HashMap();
		data.put("name","R@m!sh");
		data.put("job","Software Engineer");
		
		id=given()
		.contentType("application/Json")
		.body(data)
		
		.when()
		     .post("https://reqres.in/api/users")
		     .jsonPath().getInt("id");
//		.then()
//		     .statusCode(201)
//		     .log().all();
	}
	@Test(priority=3,dependsOnMethods= {"createUser"})
	void Updateuser()
	{
		HashMap data=new HashMap();
		data.put("name","R@m!sh");
		data.put("job","Software Engineer");
		
		given()
		   .contentType("application/json")
		   .body(data)

		
		.when()
		   .put("https://reqres.in/api/users/"+id)
		
		.then()
		   .statusCode(200)
		   .log().all();
	}
	//@Test(priority=4)
	void deleteuser()
	{
		given()
		.when()
		.delete("https://reqres.in/api/users/+id")
		.then()
		.statusCode(204)
		.log().all();
		
	}	
}
