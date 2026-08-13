package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;
    
    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement errorMessage;

    public void enterUsername(String uname) {
        username.sendKeys(uname);
    }

    public void enterPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void login(String uname, String pwd) {
        enterUsername(uname);
        enterPassword(pwd);
        clickLoginButton();
    }
    
    public String getErrorMessage() {
        return errorMessage.getText();
}}