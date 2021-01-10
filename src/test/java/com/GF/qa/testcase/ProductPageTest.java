package com.GF.qa.testcase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.GF.qa.base.TestBase;
import com.GF.qa.pagelayer.Productpage;
import com.GF.qa.util.CommonUtility;

public class ProductPageTest extends TestBase {

	public ProductPageTest() throws IOException {
		super();
	}

	Productpage productpage;
	CommonUtility util;
	
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		productpage=new Productpage();
		util=new CommonUtility();
		//util.closePopup();
	}
	
	@Test(priority=1)
	public void ValiateTitleOfPageTest()
	
	{
		productpage.clickOnProducts();
		String title = productpage.validateTitle();
		AssertJUnit.assertEquals(title, "Products");
		System.out.println("Title is correct");
	}
	
	@Test(priority=2)
	public void buyingGrowthFactor9Test()
	{
		productpage.clickOnProducts();
		productpage.clickOnGF9();
		util.ValidateAddToCart();
		util.ValidateGoToCheckout();
	}
	
	@Test(priority=3)
	public void buyingOxydreneNADEnhancerTest()
	{
		productpage.clickOnProducts();
		productpage.clickOnOxydreneNADEnhancer();
		util.ValidateAddToCart();
		util.ValidateGoToCheckout();
	}
	
	@Test(priority=4)
	public void buyingTestroVaxTest()
	{
		productpage.clickOnProducts();
		productpage.clickOnTestroVax();
		util.ValidateAddToCart();
		util.ValidateGoToCheckout();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
