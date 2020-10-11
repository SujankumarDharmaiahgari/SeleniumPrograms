package userDataInformation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTUser {
	
	@Test
	public void createuser() {
		RestAssured.baseURI = "https://reqres.in/api/users";
		RequestSpecification httprequest = RestAssured.given();
		JSONObject requestparams = new JSONObject();
		requestparams.put("name", "Shakespere");
		requestparams.put("job", "Poet");
		httprequest.header("Content-Type", "application/json");
		httprequest.body(requestparams.toJSONString());
		//Response Object
				Response response = httprequest.request(Method.POST, "/register");

				//Print Response in console window
				String ResponseBody = response.getBody().asString();
				System.out.println("Response Body is " + ResponseBody);
		
	}

}
