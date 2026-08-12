package com.saucedemo.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.CheckOutOverViewPage;
import com.saucedemo.pages.CheckOutPage;
import com.saucedemo.pages.CheckoutCompletePage;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.utils.FrameWorkConstants;
import com.saucedemo.utils.ScrollUtilityMethods;

public class CheckOutFlowTest extends BaseTest {
@Test
public void verifyCheckOutFlowTest()
{
	LoginPage lp=new LoginPage(driver);
	
	lp.login("standard_user", "secret_sauce");
	
	InventoryPage ip= new InventoryPage(driver);
	
	CartPage cp=new CartPage(driver);
	
	CheckOutPage cop= new CheckOutPage(driver);
	
	CheckOutOverViewPage cvp=new CheckOutOverViewPage(driver);
	
	CheckoutCompletePage ccp= new CheckoutCompletePage(driver);
	
	Reporter.log("Inventory Flow Task Start",true);
	
	ip.addBagPackToCart();
	
	ip.clickCartIcon();
	
	Reporter.log("Cart Flow Task Start",true);
	
	Assert.assertEquals(cp.getCartPageTitle(), "Your Cart", "Title Not Matching");
	
	Assert.assertEquals(cp.getProductAddedName(), "Sauce Labs Backpack", "Product Name Not Matching");
	
	cp.clickCheeckOutBtn();
	
	Reporter.log("Checkout Flow task Start",true);
	
	cop.enterFirstName("Himanshu");
	
	cop.enterLastName("Singh");
	
	cop.enterPostalCode("110084");
	
	cop.scrollToContinueButton();
	
	cop.clickContinue();
	
	Reporter.log("CheckOutOverView Flow Task Start",true);
	
	Assert.assertEquals(cvp.getPageTitle(), "Checkout: Overview", "CheckOutOverView Page Title Not Matching");
	
	Assert.assertEquals(cvp.getProductName(), "Sauce Labs Backpack", "Product Name Not Matching");
	
	Assert.assertEquals(cvp.getPaymentInformation(), "SauceCard #31337", "Payment Information Not Matching");
	
	Assert.assertEquals(cvp.getShippingInformation(), "Free Pony Express Delivery!", "Shipping Information Not Matching");
	
	Reporter.log("Total Amount = "+cvp.getTotalPrice(),true);
	
	Assert.assertTrue(cvp.isFinishButtonDisplayed(),"Finish Button on CheckOut OverView Page Not Displayed");
	
	cvp.scrollToFinishButton();
	
	cvp.clickFinishButton();
	
	Reporter.log("CheckOutCompletePage Task Start",true);
	
	Assert.assertEquals(ccp.getTextOfPageTitle(), FrameWorkConstants.CHECKOUT_COMPLETE_PAGE_TITLE, "CheckOut Page Title Not Matching");
	
	Assert.assertEquals(ccp.getTextOfSuccessMsg(), "Thank you for your order!", "CheckOut Success Text Message Not Matching");
	
    Assert.assertTrue(ccp.isBackHomeBtnVisible(), "Back Home Button Not Visible");


}

}
