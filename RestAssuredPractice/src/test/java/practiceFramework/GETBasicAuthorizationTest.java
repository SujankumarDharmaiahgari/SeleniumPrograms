package practiceFramework;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETBasicAuthorizationTest {
	
	@Test
	public void UserAuthorization() {
		
		RestAssured.baseURI = "http://restapi.demoqa.com/authentication/CheckForAuthentication/";
		
		//Basic Authentication
		
		PreemptiveBasicAuthScheme auth = new PreemptiveBasicAuthScheme();
		auth.setUserName("ToolsQA");
		auth.setPassword("TestPassword");
		RestAssured.authentication = auth;
		
		RequestSpecification httprequest = RestAssured.given();
		
		Response response = httprequest.request(Method.GET,"/");
		
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
	
	
	}
}
