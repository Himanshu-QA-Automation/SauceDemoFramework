package com.saucedemo.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
	
	@FindBy(xpath ="//span[@class='title']")
	private  WebElement pageTitle;
	
	@FindBy(className  ="shopping_cart_link")
	private  WebElement  cartIcon;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private  WebElement  addBackPackBtn;
	
	@FindBy(className="shopping_cart_badge")
	private  WebElement  cartBadge;
	
	@FindBy(className="inventory_item")
	private  List<WebElement> products;
	
	WebDriver driver;
	
	public InventoryPage(WebDriver driver1)
	
	{this.driver=driver1;
	PageFactory.initElements(driver,this);
		}
	
	public boolean isInventoryPageDisplayed() {
		return pageTitle.isDisplayed();
			}
	
	public String getPageTitleText() {
		return pageTitle.getText();
	}
	
	public int totalProductCount() {
		return products.size();
	}
	
	public void addBagPackToCart() {
		addBackPackBtn.click();
	}
	 
	public String getCartBadgeCount() {
		return cartBadge.getText();
	}
	
	public void clickCartIcon() {
		cartIcon.click();
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


