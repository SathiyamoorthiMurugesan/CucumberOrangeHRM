package com.Orange.Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//https://www.way2automation.com/create-runner-file-in-cucumber-bdd/

@RunWith(Cucumber.class)
@CucumberOptions (
		features = {"src/test/resources/Features/AllTCs.feature"},
		tags = "@TC02", 
		glue = {"com.Orange.StepDefinitions"}
		)


public class MyRunner {
	

}
