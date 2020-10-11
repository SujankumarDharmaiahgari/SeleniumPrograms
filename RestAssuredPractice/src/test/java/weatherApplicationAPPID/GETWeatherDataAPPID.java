package weatherApplicationAPPID;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETWeatherDataAPPID {
	
	@Test
	
	public void GETGoogleMarketsData() {
		
		RestAssured.baseURI = "http://api.openweathermap.org";
		
		RequestSpecification httprequest = RestAssured.given();
		
		Response response = httprequest.request(Method.GET,"/data/2.5/weather?q=56083&APPID=60e61d7013ac89038ffe388dc60095b9");
		
		String weatherdetails = response.getBody().asString();
		
		System.out.println("Weather Details:"+ " "+weatherdetails);
		
	}

}
