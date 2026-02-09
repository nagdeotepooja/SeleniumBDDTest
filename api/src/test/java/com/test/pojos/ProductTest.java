package com.test.pojos;

import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;

public class ProductTest {

	public static void main(String[] args) {
		
		//serialize
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		
		Product product = new Product("Dell",32100,"Red");
		String json = jsonSerializer.serialize(product);
		
		System.out.println(json);
		
		
		//deserialize
		
		JsonParser jsonParser = JsonParser.DEFAULT;
		
		String str = "{\r\n"
				+ "	\"color\": \"Red\",\r\n"
				+ "	\"name\": \"Dell\",\r\n"
				+ "	\"price\": 32100\r\n"
				+ "}";
		Product prod = jsonParser.parse(str, Product.class);
		System.out.println(prod.toString());

	}

}
