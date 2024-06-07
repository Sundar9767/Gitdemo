package Day1REst;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

class d02 {

	@Test
	void test() {
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		SessionFilter sf= new SessionFilter();
		RequestSpecification resSpec= RestAssured.given();		
		Response res= resSpec.request(Method.GET,"/maps/api/place/get/json?key=qaclick123&place_id=e34ab71c88caaf7e6c8e299d16e0df13");
        		
		String body= res.getBody().asString();
		System.out.println(res.statusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.contentType());
		System.out.println(res.sessionId());
		System.out.println(res.header("Content-Length"));
		System.out.println(res.header("Keep-Alive"));
		
		Headers allhead= res.getHeaders();
		for(Header h: allhead) {
			System.out.println();
		}

	}

}
