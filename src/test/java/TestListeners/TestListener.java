package TestListeners;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.saucedemo.base.BaseTest;
import com.saucedemo.utils.ScreenShotUtility;

import io.qameta.allure.Allure;

public class TestListener extends BaseTest implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Execution Started");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started : " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed : " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        Object testClass = result.getInstance();

        if (testClass instanceof BaseTest) {

            WebDriver driver = ((BaseTest) testClass).getDriver();

            if (driver != null) {

                // Save screenshot in Screenshots folder
                ScreenShotUtility.captureScreenshot(driver, result.getName());

                // Take screenshot as bytes
                byte[] screenshot = ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.BYTES);

                // Attach screenshot to Allure report
                Allure.addAttachment(
                        "Failure Screenshot",
                        "image/png",
                        new ByteArrayInputStream(screenshot),
                        ".png"
                );

                System.out.println("Allure Screenshot Attached");
            }
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Execution Finished");
    }
}