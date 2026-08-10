package com.saucedemo.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;

public class CartPageTest extends BaseTest{

	@Test(priority=4, groups= {"smoke","regression"})
	public void verifyCartPageFlow() {
		System.out.println("Smoke group detected for cart");
	LoginPage lp =new LoginPage(driver);
	lp.login("standard_user","secret_sauce");
	
	InventoryPage ip= new InventoryPage(driver);
	ip.addBagPackToCart();
	ip.clickCartIcon();
	
	CartPage cp= new CartPage(driver);
	
	Assert.assertEquals(cp.getCartPageTitle(), "Your Cart", "CartPage Title Not Matching");
	Assert.assertEquals(cp.getProductAddedName(), "Sauce Labs Backpack", "CartPage Title Not Matching");
	Assert.assertTrue(cp.isRemoveButtonVisible(), "Remove Button Not Visible");
	Reporter.log("Cart FLOW Check Successfull",true);
	
	
	
	
	
	
	
	}
	
	
	
}
