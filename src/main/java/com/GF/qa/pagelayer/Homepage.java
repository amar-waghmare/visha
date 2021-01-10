package com.GF.qa.pagelayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GF.qa.base.TestBase;

public class Homepage extends TestBase{


	public Homepage()throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	//Logo of Growth Factor
	@FindBy(xpath="//img[@class=\"img-nhlogo\"]")
	WebElement logo;
	
	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	//Title of Page
	public String validateTitle()
	{
		return driver.getTitle();
	}
	
	

}	
	