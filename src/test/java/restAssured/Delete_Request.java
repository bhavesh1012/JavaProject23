package restAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Delete_Request {
	
	@Test
	public void delete() {
		
	given().
		baseUri("https://reqres.in/").
		header("Content-Type", "application/json").
			
	when().
		delete("/api/users/10").
	then().
		statusCode(200).
		//log().status().
		//log().body();
		log().all();
	}

}
