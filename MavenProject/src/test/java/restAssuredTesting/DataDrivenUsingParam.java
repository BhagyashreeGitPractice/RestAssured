package restAssuredTesting;

import org.json.simple.JSONObject;
//import org.junit.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataDrivenUsingParam {
	@Test(dataProvider ="userDetails")
	public void User(String name,String job) {
	RestAssured.baseURI ="https://reqres.in/api/users";
	RequestSpecification req = RestAssured.given();
	JSONObject json = new JSONObject();
	
	json.put("name", name);
	json.put("job", job);
	req.header("Content-Type","application/json");
	Response response = req.request(Method.POST);
	System.out.println("*************************************");
	System.out.println(response.asPrettyString());
	}
@DataProvider(name="userDetails")
	public String[][] Users(){
		 String[][] userData= {{"morpheus","leader"},{"Abc","PQR"}};
		return userData;
	}
}
