package com.GF.qa.pagelayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GF.qa.base.TestBase;

public class Productpage extends TestBase {

	public Productpage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	
	//Click on product
	@FindBy(xpath="//a[contains(text(),'PRODUCTS')]")
	WebElement product;
	
	public void clickOnProducts()
	{
		product.click();
	}
	
	//Validating Title
	public String validateTitle()
	{
		return driver.getTitle();
	}
	
	
	//GF-9™
	@FindBy(xpath="(//a[@class='product-item-link'])[1]")
	WebElement GF9;
	
	public void clickOnGF9()
	{
		GF9.click();
	}
	
	//Oxydrene® NAD+ Enhancer
	@FindBy(xpath="(//a[@class='product-item-link'])[2]")
	WebElement OxydreneNADEnhancer;
	public void clickOnOxydreneNADEnhancer()
	{
		OxydreneNADEnhancer.click();
	}
	
	//TestroVax™ 
	@FindBy(xpath="(//a[@class='product-item-link'])[3]")
	WebElement Testrovax;
	
	public void clickOnTestroVax()
	{
		Testrovax.click();
	}

}
