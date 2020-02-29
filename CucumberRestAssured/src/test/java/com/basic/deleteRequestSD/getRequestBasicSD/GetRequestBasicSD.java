package com.basic.getRequestBasicSD;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestBasicSD {
	Response res;
	
	@Given("^race ciricute application is running$")
	public void race_ciricute_application_is_running()  {
     System.out.println("application is ready");
	 
	}
	
   //below code used all fields which are present json URl , just  only add statement in feature file
	
	
	@When("^I hit get request to get response$")
	public void i_hit_get_request_to_get_response() {
		res= RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
		String actualData = res.getBody().asString();
		System.out.println("Data = " +actualData);
	}

	@Then("^I validate ciricute \"([^\"]*)\" value as \"([^\"]*)\" present$")
	public void i_validate_ciricute_value_as_present(String jPath, String valueTobevalidated)  {
		String attrvalue = res.body().jsonPath().getString(jPath);
		Assert.assertTrue(attrvalue.equals(valueTobevalidated));
	}

   /*
    
    #below code used  for single particular field that is static code for single feilds
	
	@Then("^I validate ciricute ID$")
      public void i_validate_ciricute_ID() throws Throwable {
    	String totalValue = res.body().jsonPath().getString("MRData.total");
    	int  totalIntV = Integer.parseInt(totalValue);
    	
    	for (int i = 0; i < totalIntV; i++) {
    		String idValue = res.body().jsonPath().getString("MRData.CircuitTable.Circuits["+i+"].circuitId");
    		if(idValue.equals("americas")) {
    			Assert.assertTrue(idValue.equals("americas"));
    			break;
    		}else {
    			if(i==totalIntV-1) {
    				Assert.assertTrue(false);
    			}
    		}

		}
 	
       
	    
	}
*/
}
