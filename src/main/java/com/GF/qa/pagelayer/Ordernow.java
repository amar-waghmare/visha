package com.GF.qa.pagelayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GF.qa.base.TestBase;

public class Ordernow extends TestBase {

	public Ordernow() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	//Click on OrderNow
	
	@FindBy(xpath="//a[contains(text(),'ORDER NOW!')]")
	WebElement ordernow;
	
	public void clickOnOrderNow()
	{
		ordernow.click();
	}
	
	//CheckTitle
	
	public String validateTitle()
	{
		return driver.getTitle();
		
	}
	
	//SUBSCRIBE AND SAVE
	
	@FindBy(xpath="(//button[@class=\"button btn offer-btn\"])[1]")
	WebElement subscribeandsave;
	
	public void clickOnAddToCartSubscribeAndSave()
	{
		subscribeandsave.click();
	}
	
	//30-DAY SUPPLY
	
	@FindBy(xpath="(//button[@class=\"button btn offer-btn\"])[2]")
	WebElement daysupply30;
	
	public void clickonAddToCart30DaySupply()
	{
		daysupply30.click();
	}

}
