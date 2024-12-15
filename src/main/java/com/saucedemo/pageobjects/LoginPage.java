package com.saucedemo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.saucedemo.main.BasePage;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public By userName = By.xpath("//input[@id='user-name']");
	public By passWord = By.xpath("//input[@id='password']");
	public By loginButton = By.xpath("//input[@id='login-button']");
	public By addtoCart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
}
