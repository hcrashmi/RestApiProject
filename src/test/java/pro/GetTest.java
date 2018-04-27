package pro;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetTest
{
	@Test
	public void getTest()
	{
		Response result = RestAssured.get(" http://localhost:3000/posts");
		int statusCode=result.getStatusCode();
		System.out.println(statusCode);
		
		System.out.println(result.asString());//to print the body
	}
}
