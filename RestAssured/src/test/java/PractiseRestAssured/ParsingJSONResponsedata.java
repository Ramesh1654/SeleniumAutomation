package PractiseRestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingJSONResponsedata {
	//Approach
	@Test(priority=1)
	void testparsingjson() {
		
		given()
		.contentType(ContentType.JSON)
		
		.when()
		.get("http://localhost:3000/store")
		
		.then()
		.statusCode(200)
        .header("Content-Type","application/json")
        .body("book[0].price",equalTo(150.5F))
		.body("book[3].title",equalTo("Danny Of The Century"));

		
	}

	@Test(priority=2)
	void testParsing()
	{
		Response res =given()
	    .contentType(ContentType.JSON)
	
	    .when()
	    .get("http://localhost:3000/store");
	
	    Assert.assertEquals(res.getStatusCode(),200);  //Validation 1
        Assert.assertEquals(res.header("Content-Type"),"application/json");
        
        String studentlocation = res.jsonPath().get("book[3].title").toString();
        Assert.assertEquals(studentlocation, "Danny Of The Century");		
	}
}
