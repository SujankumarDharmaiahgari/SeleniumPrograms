package userDataInformation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETallUsers {
	
	@Test
	public void getuserslist() {
		RestAssured.baseURI = "https://reqres.in/api";
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.request(Method.GET,"/users?page=2");
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
	}

}
