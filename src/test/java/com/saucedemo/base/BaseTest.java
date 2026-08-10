package com.saucedemo.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {

        // Automatically downloads matching ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Launch Chrome browser
        driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open SauceDemo application
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}