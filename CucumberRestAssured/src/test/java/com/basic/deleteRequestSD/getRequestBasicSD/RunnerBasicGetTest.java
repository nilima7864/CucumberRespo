package com.basic.getRequestBasicSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/com/basic/getRequestBasicFF/"},   //feature files path :resources
		glue = {"com/basic/getRequestBasicSD/"}   ,                 //all files from java folder , glues file always taken java file
		monochrome=true
		)



public class RunnerBasicGetTest {

}
