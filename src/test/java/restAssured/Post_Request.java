package restAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Post_Request {
	
	@Test
	public void post() {
		
		given().
			baseUri("https://reqres.in/").
			header("Content-Type", "application/json").
			
		body(" 	{\r\n"
				+ "    \"name\": \"Ankesh\",\r\n"
				+ "    \"job\": \"QA\"\r\n"
				+ "} ").	
		when().
			post("/api/users").
		then().
			statusCode(200).
			//log().status().
			//log().body();
			log().all();
		
	}

		
}
