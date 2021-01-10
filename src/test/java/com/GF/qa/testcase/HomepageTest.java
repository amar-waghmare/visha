package com.GF.qa.testcase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.GF.qa.base.TestBase;
import com.GF.qa.pagelayer.Homepage;
import com.GF.qa.util.CommonUtility;

public class HomepageTest extends TestBase{
	
	Homepage homepage;
	CommonUtility util;
	
	public HomepageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		homepage=new Homepage();
		util=new CommonUtility();
		//util.closePopup();
	
	}
	
	@Test(priority=1)
	public void logotest()
	{
		boolean flag = homepage.validateLogo();
		AssertJUnit.assertTrue(flag);
		System.out.println("Logo of growth factor is visible");
	}
	
	@Test(priority=2)
	public void buyingProductTest() throws InterruptedException
	{
		util.ValidateAddToCart();
		//util.OrderOptions(3);
		util.ValidateGoToCheckout();
		System.out.println("Able to process in the functional flow.");
		
		Thread.sleep(4000);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
