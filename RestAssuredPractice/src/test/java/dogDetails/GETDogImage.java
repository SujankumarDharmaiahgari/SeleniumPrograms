package dogDetails;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETDogImage {
	
	@Test
	public void dogimage() {
		RestAssured.baseURI = "https://images.dog.ceo/breeds";
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.request(Method.GET,"/setter-gordon/n02101006_635.jpg");
		String responseimage = response.getBody().asString();
		System.out.println(responseimage);
	}

}
