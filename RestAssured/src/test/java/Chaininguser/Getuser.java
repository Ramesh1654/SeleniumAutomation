package Chaininguser;

import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Getuser {

	@Test
	void testgetuser(ITestContext context) {
		
		int id = (Integer) context.getAttribute("user_id");
		String bearertoken = "fc5eb19587b4e2a5d3bfc6b991c2acec16b7d028f795fa6236dc02e0edc8d7e6";
		given()
		   .header("Authorizaiton","Bearer "+bearertoken)
		   .pathParam("id",id)
		.when()
		   .get("https://gorest.co.in/public/v2/users/{id}")
		.then()
		   .statusCode(404)
		   .log().all();
}
}
