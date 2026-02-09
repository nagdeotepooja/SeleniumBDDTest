import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class externalJsonFile {
	
	
	//post request body using external json file 
	@Test(priority=1)
	void testPostUsingExternalJsonFile() throws FileNotFoundException {
		
		File f= new File("C:\\Users\\ADMIN\\eclipse-workspace\\api\\target\\body.json");
		
		FileReader fr= new FileReader(f);
		
		JSONTokener jt = new JSONTokener(fr);
		
		JSONObject data = new JSONObject(jt);
		
		given()
		   .contentType("application/json")
		   .body(data.toString())
		
		
		.when()
		.post("http://localhost:3000/students")
		
		
		.then()
		
		.statusCode(201)
		.body("name",equalTo("Scott"))
		.body("location",equalTo("France"))
		.body("phone",equalTo("123456"))
		.body("courses[0]",equalTo("C"))
		.body("courses[1]",equalTo("C++"))
		//.header("Content-Type","application/json; charset=utf-8")
		.log().all();
	}
	
	//id= 98d7 delete record
	
	//@Test(priority=2)
	void testDelete() {
		
		
		given()
		
		
		.when()
		
		     .delete("http://localhost:3000/students/98d7")
		
		.then()
		
		     .statusCode(404);
		
	}
	

		
		
		
		
		
	}


