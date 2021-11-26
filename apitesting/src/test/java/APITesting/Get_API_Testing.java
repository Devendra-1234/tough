package APITesting;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_API_Testing {
	 @SuppressWarnings("static-access")
	 @Test
	 public void get_Test() {
	 RestAssured request = new RestAssured();
	 Response response = request.get("https://reqres.in/api/users?page=2");
	 System.out.println(response.body());
	 System.out.println(response.getBody());
	 System.out.println(response.getBody().asString());
	 }
//	@Test
//	public void get_Test_BDD() {
//		given()
//	
//	 .get("https://reqres.in/api/users?page=1")
//	 .then().
//	 statusCode(200)
//	 .body("data.first_name",hasItems("George"))
//	 //.body("data.id[0]",equalTo(13))
//	 .log().all();
		}
	
