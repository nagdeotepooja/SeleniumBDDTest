import org.testng.annotations.Test;


import static io.restassured.RestAssured.*; 
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class PathandQueryParameters {
	
	//https://reqres.in/api/users?page=2
	
	
	
	
	@Test
	void testQueryAndPathParameters()
	{
		given()
		      .pathParam("mypath","users")//path parameters	
		      .queryParam("page",2)   //query param
		      .queryParam("id",7)     //query param
		      .header("x-api-key","reqres-free-v1")
		      
		      
	   .when()
	   
	        .get("https://reqres.in/api/{mypath}") 
	   
	    
	   
	   .then()
	        //.statusCode(200)
	        .log().all();
	   
	   
		      
	}

}
