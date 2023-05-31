package com.automationexercise.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.automationexercise.Uilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	ReadConfig config = new ReadConfig();
	Properties prop;

	@BeforeClass
	public void setupLaunchbrowser() {
		// Launch browser
		WebDriverManager.chromiumdriver().setup();
		String browsername = config.getBrowser("firefox");

		if (browsername.contains("Chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.contains("firefox")) {
			driver = new FirefoxDriver();

		} else if (browsername.contains("IE")) {
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		driver.get(config.getApplicationurl("url"));
		// driver.get("https://automationexercise.com/");

	}

	@BeforeMethod
	public void openWebsite() {

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
