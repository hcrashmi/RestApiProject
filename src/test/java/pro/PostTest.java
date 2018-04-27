package pro;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostTest 
{
	@Test
	public void postMethod()
	{
		RequestSpecification request = RestAssured.given();
		//given() RequestSpecification
		request.header("Content-Type","application/json");
		
		//format data
		JSONObject jobj=new JSONObject();
		jobj.put("id", "18");
		jobj.put("title", "restAPi");
		jobj.put("author", "R4");
		
		//add json body
		request.body(jobj.toJSONString());
		Response response = request.post(" http://localhost:3000/posts");
		int code=response.getStatusCode();
		
		System.out.println(response.getStatusCode());
		
		String resBody = response.asString();
		System.out.println(resBody);
		
		Assert.assertEquals(code, 201);
		Reporter.log("data created",true);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
