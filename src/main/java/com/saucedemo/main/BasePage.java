package com.saucedemo.main;

import java.time.Duration;
import java.util.Base64;
import java.util.Base64.Decoder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToURL (String url) {
		driver.navigate().to(url);
	}
	
	public String decode(String string) {
		Decoder decoder = Base64.getDecoder();
		return new String(decoder.decode(string));
	}
	
	public WebElement find(By locator) {
		return driver.findElement(locator);
	}
	
	public void clear(By locator,String text) {
		waitForVisibility(locator);
		find(locator).clear();
	}
	public void inputText(By locator, String text) {
		waitForVisibility(locator);
		clear(locator,text);
		find(locator).sendKeys(text);
	}
	
	public Select select(By locator) {
		waitForVisibility(locator);
		return new Select(find(locator));
	}
	public void waitForVisibility(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void selectByVisibleText(By locator,String text) {
		select(locator).selectByVisibleText(text);
	}
	
	public void staticwait (int timeInSeconds) {
		try {
			Thread.sleep(timeInSeconds * 1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void click(By locator) {
		find(locator).click();
	}
}
