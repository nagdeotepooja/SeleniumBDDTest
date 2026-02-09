
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.parser.OpenAPIV3Parser;
import io.swagger.v3.parser.core.models.SwaggerParseResult;

public class SwaggerParser {

	public static void main(String[] args) {
		
		parseJSONFile();
	}
	
	public static void parseJSONFile() {
		
		SwaggerParseResult result = new OpenAPIV3Parser().readLocation("sample.json", null, null);
		
		OpenAPI openAPI = result.getOpenAPI();
		System.out.println(openAPI);
		System.out.println(openAPI.getServers().size());
		
		Info info = openAPI.getInfo();
		
		System.out.println(info.getTitle());
		
	}

}
