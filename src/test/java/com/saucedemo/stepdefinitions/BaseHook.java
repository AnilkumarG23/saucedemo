package com.saucedemo.stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.saucedemo.main.BrowserDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BaseHook {

	public static WebDriver driver;
	public static String executionEnvironment = "";

	public static String getExecutionEnvironment() {
		return executionEnvironment;
	}

	public static void setExecutionEnvironment(String executionEnvironment) {
		BaseHook.executionEnvironment = executionEnvironment;
	}
	
	@Before
	public void setUp() {
		setExecutionEnvironment("edge");
		BrowserDriverFactory browserDriverFactory = new BrowserDriverFactory(getExecutionEnvironment());
		driver = browserDriverFactory.getBrowser();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown(Scenario scenario) {
		String scName = scenario.getName().replace(" ", "");
		if (scenario.isFailed()) {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			byte[] bs = screenshot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(bs, "image/png", scName);
		}
		driver.close();
	}
}
