package dogDetails;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETDogsList {
	
	@Test
	public void doglist() {
		RestAssured.baseURI = "https://dog.ceo/api/breeds";
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.request(Method.GET,"/list/all");
		String doglistresponse = response.getBody().asString();
		System.out.println(doglistresponse);
		
		JsonPath jsonpath = response.jsonPath();
		String breeddetails = jsonpath.get("status");
		System.out.println("Details of a sample breed"+ " "+breeddetails);
	}

}
