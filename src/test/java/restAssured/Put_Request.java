package restAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Put_Request {
	
	@Test
	public void put() {
		
	given().
		baseUri("https://reqres.in/").
		header("Content-Type", "application/json").
		
	body(" {\r\n"
			+ "    \"data\": {\r\n"
			+ "        \"id\": 10,\r\n"
			+ "        \"email\": \"byron.fields@reqres.in\",\r\n"
			+ "        \"first_name\": \"Test\",\r\n"
			+ "        \"last_name\": \"Test\",\r\n"
			+ "        \"avatar\": \"https://reqres.in/img/faces/10-image.jpg\"\r\n"
			+ "    },\r\n"
			+ "    \"support\": {\r\n"
			+ "        \"url\": \"https://reqres.in/#support-heading\",\r\n"
			+ "        \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"\r\n"
			+ "    }\r\n"
			+ "} ").	
	when().
		put("/api/users/10").
	then().
		statusCode(200).
		//log().status().
		//log().body();
		log().all();
		
	}

}
