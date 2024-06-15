package PractiseRestAssured;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import static io.restassured.RestAssured.given;



/*How many ways we create request body :
---------------------------
1)Post Request body using Hashmap
2)Post Request body using using org.json
3)Post Request body using using POJO(Plain Old Java Object)
4)Post Request body using using external json file
*/
 
// Hashmap :Stores the elements in the form of Key and 
//Value pair format
public class Hashmapmethod {
   @Test(priority=1)
	void testhashmap() {
	   
	   HashMap data = new HashMap();
	   data.put("name","Ramesh");
	   data.put("location", "India");
	   data.put("phone","123456");
	   
	   String courseArr[] = {"C","C++"};
	   data.put("Course", courseArr);
	   
	   given()
	     .contentType("application/json")
	     .body(data)
	   .when()
	     .post("http://localhost:3000/Student")
	     
	   .then()
	     .statusCode(201)
	     .body("name",equalTo("Ramesh"))
	     .body("location",equalTo("India"))
	     .body("phone",equalTo("123456"))
	     .body("Course[0]",equalTo("C"))
	     .body("Course[1]",equalTo("C++"))
	     .header("Content-Type","application/json")
	     .log().all();
		
	}	
   @Test(priority=2)
   void delete() {
	   given()
	   .when()
	      .delete("http://localhost:3000/Student/4")
	   .then()
	   .statusCode(404);
   }
}







