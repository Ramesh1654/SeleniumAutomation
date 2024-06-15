package PractiseRestAssured;

import org.testng.ITestContext;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Chianingdeleteuser {
	
	@Test()
	void Deleteuser(ITestContext context) {
		
		String Bearertoken = "fc5eb19587b4e2a5d3bfc6b991c2acec16b7d028f795fa6236dc02e0edc8d7e6";
		
		int id = (Integer) context.getAttribute("user_id");
		
		given()
		  .header("Authorizaiton", "Bearer " + Bearertoken)
          .pathParam("id",id)
          
        .when()
          .delete("https://gorest.co.in/public/v2/users/{id}")
          
        .then()
        .statusCode(404)
        .log().all();
		
	}

}
