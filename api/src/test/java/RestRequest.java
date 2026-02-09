

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

//  https://dummy.restapiexample.com/

//  https://fakerestapi.azurewebsites.net/index.html


public class RestRequest {
	
	
	
	int id;
	
	
/*	@Test(priority=2)
	void getUser() throws InterruptedException
	{
		given()
		
		.when()	
		   .get("https://dummy.restapiexample.com/api/v1/employee/1")
		.then() 
		   .statusCode(200)
		   //.body("page", equalTo(2))
		   .log().all();
		   //Thread.sleep(5000);
	}  */
	
	@Test(priority=1)
	void createUser()
	{
		String postRequest = "{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";
		
		id =  given()
		   .contentType(ContentType.JSON)
		   .body(postRequest)
		   
		.when()
		   .post("https://dummy.restapiexample.com/api/v1/create")
		   .jsonPath().getInt("data.id");
		
		// .then()
		 // .statusCode(200)
		// .log().all();
		//System.out.println("Emp salary:: "+empSalary);
	} 
	
	
	
    @Test(priority=2)
	void updateUser()
	{
		String updateRequest = "{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";
		
		given()
		 .contentType(ContentType.JSON)
		   .body(updateRequest)
		   
	   .when()	   
	         .put("https://dummy.restapiexample.com/api/v1/update/"+id)
	         
	    .then()
	        .log().all();
		
	}
}
