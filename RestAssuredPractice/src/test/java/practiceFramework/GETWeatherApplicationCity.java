package practiceFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETWeatherApplicationCity {
	
	@Test
	public void getWeatherDetails() {
		
		//Specify BaseURI
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		
		//Request Object
		RequestSpecification httprequest = RestAssured.given();
		
		//Response Object
		Response response = httprequest.request(Method.GET, "/Hyderabad");
		
		//Printing Response in console window
		String ResponseBody = response.getBody().asString();
		System.out.println("Response Body is "+ ResponseBody);
		
		//Printing Status Code
		int StatusCode = response.getStatusCode();
		System.out.println("Status Code is"+ "  " +StatusCode);
		Assert.assertEquals(StatusCode, 200);
		
		//Printing Status Line
		String Statusline = response.getStatusLine();
		System.out.println("Status Line is"+ " " +Statusline);
		Assert.assertEquals(Statusline, "HTTP/1.1 200 OK");
		
		
		//Verification in received data
		JsonPath jsonpath = response.jsonPath();
		String Cityname = jsonpath.get("City");
		System.out.println("CityName is"+ " "+Cityname);
		Assert.assertEquals(Cityname, "Hyderabad");
		
		//Print headers
		Headers allheaders = response.headers();
		for(Header headerdetails:allheaders) {
			
			System.out.println(headerdetails.getName()+":"+headerdetails.getValue());
			System.out.println();
		}
		
		
		String contentheader = response.header("Content-Type");
		System.out.println(contentheader);
		
	}

}
