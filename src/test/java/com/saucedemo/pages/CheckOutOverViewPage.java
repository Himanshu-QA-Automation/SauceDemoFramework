package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.utils.ScrollUtilityMethods;

public class CheckOutOverViewPage {
	
	@FindBy(xpath="//span[text()='Checkout: Overview']")
	private WebElement pageTitle ;
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement productName ;

	@FindBy(id="finish")
	private WebElement finishButton;
	
	@FindBy(xpath="//div[text()='SauceCard #31337']")
	private WebElement paymentInformation;
	
	@FindBy(xpath="//div[text()='Free Pony Express Delivery!']")
	private WebElement shippingInformation;
	
	@FindBy(className="summary_total_label")
	private WebElement totalPrice;
	
	WebDriver driver;
	
	public CheckOutOverViewPage(WebDriver driver1)
	
	{ this.driver=driver1;
	PageFactory.initElements(driver1, this);
		}
	
	public String getPageTitle()
	{return pageTitle.getText();
		}


	public String getProductName()
	{return productName.getText();
		}
	
	public boolean isFinishButtonDisplayed()
	{
	  return finishButton.isDisplayed();	
		
	}
    public void clickFinishButton()
    {
    	
    	finishButton.click();
    }


	public String getPaymentInformation()
	{return paymentInformation.getText();
		}
	

	public String getShippingInformation()
	{return shippingInformation.getText();
		}
	

	public String getTotalPrice()
	{return totalPrice.getText();
		}
	
	public void scrollToFinishButton() {
	   ScrollUtilityMethods scroll=new ScrollUtilityMethods();
	   scroll.scrollToElement(driver, finishButton);
	}
}
