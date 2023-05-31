package com.automationexercise.Uilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automationexercise.base.BaseClass;

public class Keywordsfunctions extends BaseClass {
	public static WebDriver driver;
	// This is click Action

	public void clickingOnElement(WebElement elemnet, long waitTimeInSeconds) {

		WebDriverWait Webwait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
		WebElement element = null;
		Webwait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();

	}

	// This is for sendkeys Action :: on text filed
	public void ClearandType(WebElement element, String text) {
		element.click();
		element.clear();
		element.sendKeys(text);

	}

	public void clickWebelment(WebDriver driver, WebElement element) {
		try {
			element.click();
		} catch (WebDriverException e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
		}

	}

	public String getElementtext(WebElement element) {
		return element.getText();

	}
}
