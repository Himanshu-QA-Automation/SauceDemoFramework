package com.saucedemo.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.saucedemo.utils.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected WebDriver driver;
    ConfigReader cr= new ConfigReader();
    
    @Parameters("browser")
    @BeforeMethod
    public void setup(@Optional("chrome")String browser) {
      if(browser.equalsIgnoreCase("chrome")||browser.equalsIgnoreCase("ch"))
      {
    	  WebDriverManager.chromedriver().setup();
    	  driver=new ChromeDriver();
    	  
      }
      else if(browser.equalsIgnoreCase("edge"))
      {
    	  
    	  driver=new EdgeDriver();
    	  
      }
      
      else { throw new IllegalArgumentException("Invalid browser name: " + browser);}
      
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(cr.getDataFromConfigReader("url"));
    }

   @AfterMethod
   public void tearDown() {

       if (driver != null) {
          driver.quit();
       }
    }

   public WebDriver getDriver() {
	    return driver;
	}
}