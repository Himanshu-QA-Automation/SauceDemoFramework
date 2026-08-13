package com.saucedemo.tests;

import org.testng.Assert;
import org.testng.Reporter;

import org.testng.annotations.Test;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.utils.ConfigReader;
import com.saucedemo.utils.ScreenShotUtility;
import com.saucedemo.utils.TestDataProvider;



public class LoginTest extends BaseTest{
	
	 @Test(priority=1, groups= {"smoke","regression"})
	    public void verifyValidLogin() {
		 ConfigReader cr=new ConfigReader();
		 System.out.println("Smoke group detected for valid login");
	        LoginPage loginPage = new LoginPage(driver);

	        loginPage.login(cr.getDataFromConfigReader("username"),cr.getDataFromConfigReader("password"));
	       // ScreenShotUtility.captureScreenshot(driver, "LoginSuccess");
	        String currentUrl = driver.getCurrentUrl();

	        Assert.assertTrue(currentUrl.contains("inventory"),
	                "Login failed!");
	        

	        Reporter.log("Login successful",true);
	    }
	 
	 @Test(priority=2,groups= {"regression"})
	 public void verifyInvalidLogin() {
	LoginPage lp= new LoginPage(driver)	; 
	lp.login("Himanshu", "Singh");
	String actualErrorMessage = lp.getErrorMessage();
	 Assert.assertTrue(actualErrorMessage.contains("Username and password do not match"),
             "Error message is not displayed correctly");
		 Reporter.log("Invalid username and password",true);
		 
	 
	 }
	 

@Test(dataProvider = "loginDataFromExcel",
      dataProviderClass = TestDataProvider.class)
public void loginDataProviderTest(String username, String password) {

    LoginPage lp = new LoginPage(driver);

    lp.login(username, password);

    Reporter.log(username + " : " + password,true);
}
	}


