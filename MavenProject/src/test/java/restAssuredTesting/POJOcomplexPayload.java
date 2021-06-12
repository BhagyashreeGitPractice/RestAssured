package restAssuredTesting;

import com.practice.pojo.restassured.Details;
import com.practice.pojo.restassured.POJOCLass;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POJOcomplexPayload {
	public static void main(String[] users)
	{
	RestAssured.baseURI ="https://reqres.in/api/users";
	RequestSpecification req =RestAssured.given();
	
	POJOCLass pojo = new POJOCLass("morpheus","leader",new String[]{"java","c"},new Details("XYZ","morpheus@xyz.com"));
	req.body(pojo);
	req.header("Content-Type","Application/json");
	
	
	Response response = req.request(Method.POST);
	
	System.out.println("*****************************"+response.asPrettyString());
	
}
}