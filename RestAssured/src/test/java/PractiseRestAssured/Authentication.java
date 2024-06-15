package PractiseRestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;



public class Authentication {
	
	@Test(priority=1)
	void BasicAuthentication() {
		
		given()
		.auth().basic("foo", "bar")
		
		.when()
		.get("http://httpbin.org/basic-auth/foo/bar")
		
		.then()
		.statusCode(200)
		.body("authenticated",equalTo(true))
		.log().all();	
	}
	
	@Test(priority=2)
	void DigestAuthentication() {
		given()
		.auth().digest("foo", "bar")
		
		.when()
			.get("http://httpbin.org/basic-auth/foo/bar")
		
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))
			.log().all();	
	}
	@Test(priority=3)
	void preemptiveAuthentication() {
		given()
		.auth().preemptive().basic("foo", "bar")
		
		.when()
			.get("http://httpbin.org/basic-auth/foo/bar")
		
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))
			.log().all();	
	}
}
