import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestDemo {

	
	public static void main(String args[]) {
		GetBooksDetails();
	}
	public static void GetBooksDetails() {
		
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Response httpResponse = httpRequest.request(Method.GET, "");
		
		System.out.println("Status code: "+httpResponse.getStatusCode());
		System.out.println("Response => "+httpResponse.prettyPrint());
	}
}
