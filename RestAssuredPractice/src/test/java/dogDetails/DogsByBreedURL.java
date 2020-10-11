package dogDetails;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DogsByBreedURL {
	
	@Test
	public void DogsByBreed() {
		RestAssured.baseURI = "https://dog.ceo/api/breeds/image";
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.request(Method.GET, "/random/5");
		String imagelist = response.getBody().asString();
		System.out.println(imagelist);
		String statusline = response.getStatusLine();
		System.out.println(statusline);
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);

		String cookievalue = response.getHeader("Set-Cookie");
		System.out.println(cookievalue);
		
		//Print headers
		Headers allheaders = response.headers();
		for(Header headerdetails:allheaders) {
			
			System.out.println(headerdetails.getName()+":"+headerdetails.getValue());
			System.out.println();
		}
	}

}
