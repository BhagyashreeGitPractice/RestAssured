package restAssuredTesting;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ComplexPayload {
	@Test
	public void jsonObject() {
	RestAssured.baseURI="https://reqres.in/api/users";
	RequestSpecification req = RestAssured.given();
			
	JSONArray jr = new JSONArray();
	jr.add("java");
	jr.add("c");
	
	JSONObject json1 = new JSONObject();
	json1.put("companyName" ,"XYZ");
	json1.put("emailId","morpheus@xyz.com");
		
	JSONObject json = new JSONObject();
	json.put("name" ,"morpheus");
	json.put("job","leader");
	json.put("skills",jr);
	json.put("details",json1);
	req.header("Content-Type","application/json");
	req.body(json.toJSONString());
	Response response = req.request(Method.POST);
	System.out.println("*******************Headers*******");
	
	Headers allHeader = response.headers();
	for(Header h:allHeader)
	{
		System.out.println(h.getName() +"     "+":"+"       "+ h.getValue());
	}
	//System.out.println("//////////////////////getBody****************"+response.getBody().asString());
	//System.out.println("prettyPrint********************"+response.getBody().asPrettyString());
	System.out.println("without getBody*****************"+response.asPrettyString());
	
	String f =response.getBody().path("id");
	System.out.println(f);
	
	JsonPath j= response.jsonPath();
	System.out.println(j.get("id"));
	System.out.println(j.get("createdAt"));
	
	
	}
	@Test
	public void hashMap() {
		RestAssured.baseURI="https://reqres.in/api/users";
		RequestSpecification request = RestAssured.given();
		HashMap<String,Object> h = new HashMap<String,Object>();
		
		h.put("name","morpheus");
		h.put("job","leader");
		
		ArrayList ar = new ArrayList();
		ar.add("java");
		ar.add("c");
		h.put("skills", ar);
		
        HashMap<String,Object> h1 = new HashMap<String,Object>();
		
		h1.put("companyName","XYZ");
		h1.put("emailId","morpheus@xyz.com");
	
		h.put("details", h1);	
		request.header("Content-Type","Application/json");
		request.body(h1);
		Response response=request.request(Method.POST);
		
		System.out.println("********************************");
		System.out.println(response.getBody().asString());
	}

}

	
