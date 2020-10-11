package userDataInformation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETOneUser {
	
	@Test
	public void getresponseforoneuser() {
		RestAssured.baseURI = "https://reqres.in/api";
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.request(Method.GET,"/users/2");
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
	}

}
