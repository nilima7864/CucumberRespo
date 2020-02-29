package com.basic.MyGoogleRestAssured;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyStepDef {

	Response res;
	
	@Given("^google have website$")  //^ and $ used for to read whole string.
	public void google_have_website() {
		System.out.println("yes");
	}
	
	@When("hit google application")
	public void hit_google_application() {
		res= RestAssured.get("https://google.com/");
	}
	
	@Then("I validate status code")
	public void I_validate_status_code() {
		int actualStateCode = res.getStatusCode();
		System.out.println("actualStateCode =" +actualStateCode);
		Assert.assertTrue(200==actualStateCode);
	}
	@Given("Ergast have website")
	public void Ergast_have_website() {
		System.out.println("yes");
	}
	
	@When("hit Ergast application")
	public void hit_Ergast_application() {
		res= RestAssured.get("http://ergast.com/mrd/");
	}
	
	@Then("validate status code of Ergast")
	public void validate_status_code_of_Ergast() {
		int actualStateCode = res.getStatusCode();
		System.out.println("actualStateCode =" +actualStateCode);
		Assert.assertTrue(200==actualStateCode);
}
}


