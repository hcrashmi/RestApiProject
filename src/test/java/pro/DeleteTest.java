package pro;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class DeleteTest
{
	@Test
	public void deleteTest() 
	{
		RequestSpecification request = RestAssured.given();
		
		Response response = request.delete("http://localhost:3000/posts/9");
		int code=response.getStatusCode();
		System.out.println(code);
		Assert.assertEquals(code, 200);
		Reporter.log("data deleted",true);
	}
}
