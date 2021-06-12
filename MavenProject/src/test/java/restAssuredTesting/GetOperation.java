package restAssuredTesting;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetOperation {

 
 @Test
 void getDetails()
 {
 
	 RestAssured.baseURI="https://reqres.in/api/users?page=2";
	 
	 RequestSpecification req = RestAssured.given();
	 
	 Response res = req.request(Method.GET);
	 
	 System.out.println("RESPONSE IS *****"+res.getBody().asString());
	 
	 System.out.println("STATUS CODE IS ********"+res.getStatusCode());
	 
	 System.out.println("STATUS LINE********* "+ res.getStatusLine());
	 //res.
	 System.out.println("Time is ******"+res.getTime());
 }
  
}
