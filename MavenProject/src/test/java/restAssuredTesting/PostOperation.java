package restAssuredTesting;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostOperation {
@Test
public void post() {
	RestAssured.baseURI="https://reqres.in/api/users";
	RequestSpecification req = RestAssured.given();
	JSONObject json = new JSONObject();
	
	json.put("name", "morpheus");
	json.put("job", "leader");
	req.header("Content-Type","application/json");
	Response response = req.request(Method.POST);
	System.out.println("getBody****************"+response.getBody().asString());
	System.out.println("prettyPrint********************"+response.getBody().asPrettyString());
	System.out.println("without getBody*****************"+response.asPrettyString());
	String id = response.jsonPath().get("id");
	System.out.println(id);
			
	
}
}