import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONArray;
import org.json.JSONObject;


public class paesingJsonResponseData {
	
	//@Test
	void testJsonResponse()
	{
		//Approach1
		
		/*given()
		
		     .contentType("ContentType.JSON")    
		     .header("Content-Type","application/json")
		
		.when()
		     .get("http://localhost:3000/book")
		     
		.then()
		
		     .statusCode(200)
		     
		     .body("[3].title",equalTo("The Lord of the Rings")); */
		
		//approach =2
	}
	
	
	@Test
	void testJsonResponseBodyData()
	{
		
	Response res= given()
		     
		 .contentType("ContentType.JSON")    
		 
		 .when()
	           .get("http://localhost:3000/book");
	     
	    /* Assert.assertEquals(res.getStatusCode(), 200);
		 Assert.assertEquals(res.header("Content-Type"),"application/json");
		 
		 String bookName=res.jsonPath().get("[3].title").toString();
		 
		 Assert.assertEquals(bookName,"The Lord of the Rings"); */
	
	//JSONObject Class
	
	JSONArray j= new JSONArray(res.asString());
	System.out.println(j);
	
	System.out.println(j.length());
	
	for(int i=0; i<j.length();i++)
	{
		System.out.println(j.getJSONObject(i).get("author"));
		
		
	}
	     
		
		
		 
		
		
		
	
	

}
}
