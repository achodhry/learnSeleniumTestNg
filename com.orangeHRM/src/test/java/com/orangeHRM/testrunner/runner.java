package com.orangeHRM.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/Login.feature",
		glue="com.orangeHRM.stepdefinitions",
		dryRun=false,
		monochrome=true
		)


public class runner {

}
