
package com.saucedemo.runnerbase;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(publish = true, features = { "src/test/resources/features" }, glue = {
		"com/saucedemo/stepdefinitions" }, plugin = { "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, tags = "@LoginFeature", dryRun = false)

public class Runner extends AbstractTestNGCucumberTests {

}
