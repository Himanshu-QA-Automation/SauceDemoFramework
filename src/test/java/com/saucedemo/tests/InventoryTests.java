package com.saucedemo.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.utils.FrameWorkConstants;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class InventoryTests extends BaseTest {
	
	@Test(priority=3 , groups= {"smoke","regression"})
	public void verifyInventoryPageAndAddToCart() {
		System.out.println("Smoke group detected for inventory");
		LoginPage lp=new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");
		
		InventoryPage ip= new InventoryPage(driver);
		
		//SoftAssert sa=new SoftAssert();
		Assert.assertTrue(ip.isInventoryPageDisplayed(), "Inventory page not displayed");
		Assert.assertEquals(ip.totalProductCount(), 6, "Total number of products are wrong");
		 Assert.assertEquals(ip.getPageTitleText(), FrameWorkConstants.INVENTORY_PAGE_TITLE,
	                "Page title mismatch");
	
		ip.addBagPackToCart();
		Assert.assertEquals(ip.getCartBadgeCount(), "1", "Cart Badge number not matching to the total number of bagpacks user added");
		
		
		System.out.println("Inventory  page verified");;
		
		Reporter.log("Inventory page verified",true);
		
		
		
	}

}
