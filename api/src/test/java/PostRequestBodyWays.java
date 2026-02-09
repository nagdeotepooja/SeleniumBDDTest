import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class PostRequestBodyWays {
	
	//1) Post request body using Hashmap
	@Test  (priority=1)
	void testpostUsingHashmap()
	{
		HashMap data= new HashMap();
		
		data.put("name", "Pooja");
		data.put("location", "India");
		data.put("phone", "123456");
		
		String courseArray[]= {"C","C++"};
		data.put("courses", courseArray);
		
		
		given()
		   .contentType("application/json")
		   .body(data)
		
		
		.when()
		.post("http://localhost:3000/students")
		
		
		.then()
		
		.statusCode(201)
		.body("name",equalTo("Pooja"))
		.body("location",equalTo("India"))
		.body("phone",equalTo("123456"))
		.body("courses[0]",equalTo("C"))
		.body("courses[1]",equalTo("C++"))
		//.header("Content-Type","application/json; charset=utf-8")
		.log().all();
	}
	
	//id= 98d7 delete record
	
	@Test(priority=2)
	void testDelete() {
		
		
		given()
		
		
		.when()
		
		     .delete("http://localhost:3000/students/98d7")
		
		.then()
		
		     .statusCode(404);
		
	}
	

}
