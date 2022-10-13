package restAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class GetID_Request {
	
	@Test
	public void getID() {
		
	String response = given().
			baseUri("https://reqres.in/api/users/10").
		when().
			get().
		then().
			statusCode(200).
			log().all().
			extract().response().asString();
		
	System.out.println(response);	
	
	JsonPath js = new JsonPath(response);
	
	String lastname = js.get("data.last_name");  //Fields
	
	System.out.println(lastname);
		
	}


}
