package com.GF.qa.testcase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.GF.qa.base.TestBase;
import com.GF.qa.pagelayer.Sciencepage;
import com.GF.qa.util.CommonUtility;

public class SciencePageTest extends TestBase{

	Sciencepage sciencepage;
	CommonUtility util;
	
	public SciencePageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		sciencepage=new Sciencepage();
		util=new CommonUtility();
	
	}
	
	@Test(priority=1)
	public void scienceTitleTest()
	{
		sciencepage.validateScience();
		String title = sciencepage.validateTitle();
		AssertJUnit.assertEquals(title, "How a Natural HGH Booster Works - The Science | Growth Factor 9");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

	

}
