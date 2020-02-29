package com.basic.headerSD;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/basic/headerFF/HeaderFF.feature"},
		glue={"com/basic/headerSD/"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report22711.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		}

		
		)
public class RunnerHeader {

}
