package com.saucedemo.utils;

import org.openqa.selenium.WebElement;

public class WebDriverUtility {
	

    // sendKeys reusable method
    public void enterText(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    // click reusable method
    public void clickElement(WebElement element) {
        element.click();
    }

    // getText reusable method
    public String fetchText(WebElement element) {
        return element.getText();
    }

}
