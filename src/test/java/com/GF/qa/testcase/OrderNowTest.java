package com.GF.qa.testcase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.GF.qa.base.TestBase;
import com.GF.qa.pagelayer.Ordernow;

import com.GF.qa.util.CommonUtility;

public class OrderNowTest extends TestBase {

	public OrderNowTest() throws IOException {
		super();
	}
	
	Ordernow ordernow;
	CommonUtility util;
	
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		ordernow=new Ordernow();
		util=new CommonUtility();
		util.closePopup();
	}
	
	//Checking of title
	@Test(priority=1)
	public void TitleTest()
	{
		 ordernow.clickOnOrderNow();
		 String title = ordernow.validateTitle();
		 AssertJUnit.assertEquals(title, "Buy HGH for Men - Growth Hormone Pills | Growth Factor 9");
		 System.out.println("Title is correct");
	}
	
	//Subscribe and save
	@Test(priority=2)
	public void buyingSubscribeAndSaveTest()
	{
		ordernow.clickOnOrderNow();
		ordernow.clickOnAddToCartSubscribeAndSave();
		util.ValidateGoToCheckout();
		
	}
	
	@Test(priority=3)
	public void buying30DaySupplyTest()
	{
		ordernow.clickOnOrderNow();
		ordernow.clickonAddToCart30DaySupply();
		util.ValidateGoToCheckout();
		
	}

	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
