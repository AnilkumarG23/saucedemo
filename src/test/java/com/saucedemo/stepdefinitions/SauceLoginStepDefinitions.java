package com.saucedemo.stepdefinitions;

import com.revport.utilities.ConfigReader;
import com.saucedemo.main.BrowserDriverFactory;
import com.saucedemo.pageobjects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceLoginStepDefinitions {

	LoginPage loginPage = new LoginPage(BrowserDriverFactory.getDriver());

	@Given("I navigate to {string} to URL")
	public void i_navigate_to_to_url(String string) {
		loginPage.navigateToURL(ConfigReader.getValue(string, "baseUrl"));
	}

	@When("I Enter Username for {string} Environment")
	public void i_enter_username_for_environment(String string) {
		loginPage.inputText(loginPage.userName, (ConfigReader.getValue(string, "username")));
		loginPage.staticwait(10);
	}


	@When("I Enter Password for {string} Environment")
	public void i_enter_password_for_environment(String string) {
		loginPage.inputText(loginPage.passWord, (ConfigReader.getValue(string, "password")));
		loginPage.staticwait(10);
	}

	

	@Then("I Click on Login Button")
	public void i_click_on_login_button() {
		loginPage.click(loginPage.loginButton);
	}
	
	@Then("I Click on Add to Cart")
	public void i_click_on_add_to_cart() {
	   loginPage.click(loginPage.addtoCart);
	}
}
