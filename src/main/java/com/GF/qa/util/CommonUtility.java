package com.GF.qa.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GF.qa.base.TestBase;

public class CommonUtility extends TestBase {

	public CommonUtility() throws IOException {
		PageFactory.initElements(driver, this);
	}

	//clicking on add to cart
	@FindBy(xpath="//input[@value='ADD TO CART']")
	WebElement addToCart;
	public void ValidateAddToCart()
	{
		addToCart.click();
	}
	
	//clicking on Go To Checkout
	@FindBy(xpath="//span[contains(text(),'Go to Checkout')]")
	WebElement goToCheckout;
	
	public void ValidateGoToCheckout()
	{
		goToCheckout.click();
	}
	
	//Select check box
	public void OrderOptions(int number)
	{
		if(number==1)
		{
			driver.findElement(By.xpath("//label[@for=\"caps-b2g1f\"]")).click();
		}
		else if (number==2)
		{
			driver.findElement(By.xpath("//label[@for=\"caps-subscribe\"]")).click();
		}
		else if(number==3)
		{
			driver.findElement(By.xpath("//input[@id='caps-onetime']")).click();
		}
		else
		{
			System.out.println("Please select the options to add product in cart");
		}
	}
	
		//Sreecnshot method
		public static void takeScreenshotAtEndOfTest() throws IOException 
		{
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			String currentDir = System.getProperty("user.dir");
			
			FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		}
	
		//Close POPUP
		@FindBy(xpath="//div[@id='ltkpopup-close-button']")
		WebElement closepop;		
		
		public void closePopup()
		{
			closepop.click();
		}
	
	
	
}
