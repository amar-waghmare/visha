package com.GF.qa.pagelayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GF.qa.base.TestBase;

public class Sciencepage extends TestBase{
	
	public Sciencepage()throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	//clicking on science
	@FindBy(xpath="//a[contains(text(),'SCIENCE')]")
	WebElement science;
	
	public void validateScience()
	{
		science.click();
	}
	
	//Title of Page
	public String validateTitle()
	{
		return driver.getTitle();
	}
	

}
