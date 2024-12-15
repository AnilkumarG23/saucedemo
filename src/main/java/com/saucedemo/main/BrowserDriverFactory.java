package com.saucedemo.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserDriverFactory {

	private String browser;

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public BrowserDriverFactory(String browser) {
		this.browser = browser;
	}

	public WebDriver getBrowser() {
		switch (browser) {
		case "ie":
			
			driver.set(new InternetExplorerDriver());
			break;

		case "chrome":
			
			driver.set(new ChromeDriver());
			break;

		case "edge":
			
			driver.set(new EdgeDriver());
			break;

		default:
		
			driver.set(new EdgeDriver());
			break;

		}
		return getDriver();
	}

	public static WebDriver getDriver() {

		return driver.get();

	}

}
