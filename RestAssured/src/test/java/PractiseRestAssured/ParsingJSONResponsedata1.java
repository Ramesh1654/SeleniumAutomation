package PractiseRestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingJSONResponsedata1 {

	@Test(priority = 1)
	void testparsingjson() {

		given()
		.contentType(ContentType.JSON)

		.when()
		.get("http://localhost:3000/Employee")

				
		.then()
		.statusCode(200).header("Content-Type", "application/json")
		.body("student[0].category", equalTo("District"));
	}

	@Test(priority = 2)
	void testvalidation() {

		Response res = given().contentType(ContentType.JSON).when().get("http://localhost:3000/Employee");

		Assert.assertEquals(res.getStatusCode(), (200));
		Assert.assertEquals(res.header("Content-Type"), "application/json");

		String employee = res.jsonPath().get("student[0].category").toString();
		Assert.assertEquals(employee, "District");

	}

}
