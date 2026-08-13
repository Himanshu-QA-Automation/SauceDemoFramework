package com.saucedemo.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtility {

    public static void captureScreenshot(WebDriver driver, String fileName) {

        if (driver == null) {
            System.out.println("Driver is null. Screenshot not captured.");
            return;
        }

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;

            File src = ts.getScreenshotAs(OutputType.FILE);

            File dest = new File("Screenshots/" + fileName + ".png");

            dest.getParentFile().mkdirs();

            Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Screenshot saved successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
