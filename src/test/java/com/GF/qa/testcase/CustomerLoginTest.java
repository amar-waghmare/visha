package com.GF.qa.testcase;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.GF.qa.base.TestBase;
import com.GF.qa.pagelayer.Customerlogin;
import com.GF.qa.pagelayer.Homepage;
import com.GF.qa.util.CommonUtility;

public class CustomerLoginTest extends TestBase {

	public CustomerLoginTest() throws IOException {
		super();
		
	}
	
	Customerlogin customerdetail;
	CommonUtility util;
	
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		customerdetail=new Customerlogin();
		util=new CommonUtility();
		util.closePopup();
	
	}
	
	@Test(priority=1)
	public void logotest()
	{
		customerdetail.clickOnCustomerLogin();
		customerdetail.Signin("amar@codebas", "1728sdhfh");
		System.out.println("Able to enter all the details");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}


}
