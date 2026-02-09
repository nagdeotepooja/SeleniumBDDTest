package school;

public class UrlParser {

	public static void main(String[] args) {
		
		
		String url = "https://www.google.com/name=Jayesh&surname=Nagdeote";  // https www.google.com [name: Jayesh] [surname: Nagdeote]
		
		String newUrl =  url.replaceAll("[^a-z0-9A-Z.=]", " ").replaceAll("=", ": ");
		
		System.out.println(newUrl);
		
		

	}

}
