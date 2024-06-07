package Day1REst;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;



class d01 {

	@Test
	void test() {
		Response res;
		res= RestAssured.get("https://rahulshettyacademy.com/maps/api/place/get/json?key=qaclick123&place_id=e34ab71c88caaf7e6c8e299d16e0df13");
		String body= res.getBody().asString();
		System.out.println(body);
		
		JsonPath js= new JsonPath(body);
		System.out.println(js.getString("location.latitude"));
		System.out.println(js.getString("location.longitude"));
		System.out.println(js.getString("address"));
		
		JSONObject jo= new JSONObject();
		
		jo.put("a", "A");
		jo.put("b", "BB");
		
		System.out.println(jo);
		

		
	}

}
