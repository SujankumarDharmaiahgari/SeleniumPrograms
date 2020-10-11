package practiceFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETWeatherDetailsAssertions {
	
	@Test
	public void weatherdetailsassert() {
		
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		
		RequestSpecification httprequest = RestAssured.given();
		
		Response response = httprequest.request(Method.GET,"/Delhi");
		
		String responsebody = response.getBody().asString();
		
		System.out.println(responsebody);
		
		Assert.assertEquals(responsebody.contains("Delhi"), true);
		
		int statuscode = response.statusCode();
		
		System.out.println(statuscode);
		
		String statuslinedata = response.statusLine();
		
		System.out.println(statuslinedata);
		
		
		
	}

}
