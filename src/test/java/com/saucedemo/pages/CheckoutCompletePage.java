package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {
	
	
@FindBy(className="complete-header")
private WebElement successMsg ;

@FindBy(id="back-to-products")
private WebElement  backHomeButton;

@FindBy(xpath="//span[text()='Checkout: Complete!']")
private WebElement checkOutCompletePageTitle ;


 WebDriver driver;

public  CheckoutCompletePage(WebDriver driver1)
{
	this.driver=driver1;
PageFactory.initElements(driver, this);
	
}

public String getTextOfSuccessMsg()
{
	return successMsg.getText();
	}

public String getTextOfPageTitle()
{
	return checkOutCompletePageTitle.getText();
	}

public boolean isBackHomeBtnVisible()
{
	return backHomeButton.isDisplayed();
	
}

}
