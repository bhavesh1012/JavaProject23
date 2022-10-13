package restAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Get_Request {
	
	@Test
	public void getAll() {
		
		//given() - pass information - URL, Header
		//when() - Give API methods, endpoints
		//then() - expect response, log, assertion/validation
		
		given().
			baseUri("https://reqres.in/").
		when().
			get("/api/users?page=2").
		then().
			statusCode(200).
			//log().status().
			//log().body();
			log().all();
		
	}

}
