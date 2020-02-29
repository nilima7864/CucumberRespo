package com.basic.MyGoogleRestAssured;

import org.junit.Assert;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicOfRestAssured {
	
	//@Test
	public void TestGoogle() {
		Response res= RestAssured.get("http://google.com/");
		int actualStateCode = res.getStatusCode();
		System.out.println("actualStateCode =" +actualStateCode);
		Assert.assertTrue(200==actualStateCode);
	}

	
	//@Test
	public void TestF1() {
		Response res= RestAssured.get("http://ergast.com/api/f1/2017/circuits");
		int actualStateCode = res.getStatusCode();
		System.out.println("actualStateCode =" +actualStateCode);
		Assert.assertTrue(200==actualStateCode);
		
		String actualData = res.getBody().asString();
		System.out.println("Data = " +actualData);
	}

}
