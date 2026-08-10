package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

@FindBy(className="title")
private WebElement  cartTitle  ;

@FindBy(xpath = "//div[@class='inventory_item_name' and text()='Sauce Labs Backpack']")
private WebElement  productAddedName   ;

@FindBy(id="remove-sauce-labs-backpack")
private WebElement  removeButton ;


@FindBy(id="checkout")
private WebElement checkOut ;

WebDriver driver;

public CartPage(WebDriver driver1) {
	
	this.driver=driver1;
	PageFactory.initElements(driver,this);

}

public String getCartPageTitle()
{ return cartTitle.getText();
	}
public String getProductAddedName()
{ return productAddedName.getText();
	}
public boolean isRemoveButtonVisible()
{
	return removeButton.isDisplayed();
	
}
public void clickCheeckOutBtn()
{checkOut.click(); 
}




}
