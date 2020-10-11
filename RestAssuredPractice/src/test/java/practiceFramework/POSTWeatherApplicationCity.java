package practiceFramework;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTWeatherApplicationCity {

	@Test
	public void POSTUserRegistration() {

		// Specify base URI
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";

		//Request Object
		RequestSpecification httprequest = RestAssured.given();

		//Request payload(parameters) sending along with post request
		JSONObject requestparams = new JSONObject();

		requestparams.put("FirstName", "Sujaagaa");

		requestparams.put("LastName", "Kumaaga");

		requestparams.put("UserName", "Sujangxyzaa");

		requestparams.put("Password", "Sujakumargxyzaa");

		requestparams.put("Email", "sujankumgaxyzaba@gmail.com");

		httprequest.header("Content-Type", "application/json");

		httprequest.body(requestparams.toJSONString());
		
		//Response Object
		Response response = httprequest.request(Method.POST, "/register");

		//Print Response in console window
		String ResponseBody = response.getBody().asString();
		System.out.println("Response Body is " + ResponseBody);

		//Status code validation
		int StatusCode = response.getStatusCode();
		System.out.println("Status Code is" + "  " + StatusCode);
		Assert.assertEquals(StatusCode, 201);

		//Successcode validation
		String Successcode = response.jsonPath().get("SuccessCode");
		System.out.println("Successcode received is" + " " + Successcode);
		Assert.assertEquals(Successcode, "OPERATION_SUCCESS");

	}

}
