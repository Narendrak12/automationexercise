package com.automationexercise.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationexercise.Uilities.Keywordsfunctions;
import com.automationexercise.base.BaseClass;

import PageObjectsclass.Homepage;

public class HomePageTest extends BaseClass

{
	WebDriver driver;
	
	@BeforeMethod
    public void Lanchbrowser() {
    	setupLaunchbrowser();
    	
    }
    @AfterMethod
    public void Teardown() {
    	driver.quit();
    }
    
    @Test
    public void verifyhomopage() 
    {
    	Homepage home = new Homepage();
    	home.checkhomepage();
    	
    }
    
}
