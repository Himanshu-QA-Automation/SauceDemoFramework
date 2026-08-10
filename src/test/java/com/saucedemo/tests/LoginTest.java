package com.saucedemo.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.LoginPage;

public class LoginTest extends BaseTest{
	
	 @Test(priority=1, groups= {"smoke","regression"})
	    public void verifyValidLogin() {
		 System.out.println("Smoke group detected for valid login");
	        LoginPage loginPage = new LoginPage(driver);

	        loginPage.login("standard_user", "secret_sauce");

	        String currentUrl = driver.getCurrentUrl();

	        Assert.assertTrue(currentUrl.contains("inventory"),
	                "Login failed!");

	        Reporter.log("Login successful",true);
	    }
	 
	 @Test(priority=2,groups= {"regression"})
	 public void verifyInvalidLogin() {
	LoginPage lp= new LoginPage(driver)	; 
	lp.login("Himanshu", "Chutia");
	String actualErrorMessage = lp.getErrorMessage();
	 Assert.assertTrue(actualErrorMessage.contains("Username and password do not match"),
             "Error message is not displayed correctly");
		 Reporter.log("Invalid username and password",true);
		 
	 
	 }
	}


