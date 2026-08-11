package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.utils.ScrollUtilityMethods;

public class CheckOutPage {

@FindBy(id="first-name")
private WebElement  firstName ;

@FindBy(id="last-name")
private WebElement  lastName ;

@FindBy(id="postal-code")
private WebElement  postalCode ;

@FindBy(id="continue")
private WebElement  continueBtn ;

WebDriver driver;

public CheckOutPage(WebDriver driver1)
{this.driver=driver1;
PageFactory.initElements(driver, this);
	
}


public void  enterFirstName(String firstName1)
{   firstName.sendKeys(firstName1);
	}

public void  enterLastName(String lastName1)
{   lastName.sendKeys(lastName1);
	}

public void  enterPostalCode(String postalCode1)
{   postalCode.sendKeys(postalCode1);
	}
public void  clickContinue()
{   continueBtn.click();
	}

public void scrollToContinueButton() {
	   ScrollUtilityMethods scroll=new ScrollUtilityMethods();
	   scroll.scrollToElement(driver,  continueBtn);
	}

}
