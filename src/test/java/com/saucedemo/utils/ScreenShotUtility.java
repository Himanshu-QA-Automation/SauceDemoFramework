package com.saucedemo.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtility {

	  public static void captureScreenshot(WebDriver driver, String testName) {


		    TakesScreenshot ts = (TakesScreenshot) driver;
		    File src = ts.getScreenshotAs(OutputType.FILE);

		    // screenshots folder create hoga agar nahi hai
		    File folder = new File("./screenshots");

		    if (!folder.exists()) {
		        folder.mkdir();
		    }

		    File dest = new File(folder, testName + ".png");

		    try {
		        FileUtils.copyFile(src, dest);
		        System.out.println("Screenshot saved successfully");
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
	    }
}
