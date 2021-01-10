package com.GF.qa.pagelayer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GF.qa.base.TestBase;

public class Customerlogin extends TestBase {

	public Customerlogin() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	//click on Customer Login Button
	@FindBy(xpath="//i[@class='fa fa-user']")
	WebElement customerlogin;
	
	public void clickOnCustomerLogin()
	{
		customerlogin.click();
	}
	
	//Registered Customers-If you have an account, sign in with your email address.
	public void Signin(String email,String password)
	{
		driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='send']")).click();
	}
	
	
	//New Customer-Creating an account has many benefits: check out faster, keep more than one address, track orders and more.
	public void SignUp(String firstname,String lastname,String email,String password,String confirmpass)
	{
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("(//input[@id='email_address'])[1]")).sendKeys(email);
		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys(password);
		driver.findElement(By.xpath("(//input[@name='password_confirmation'])[1]")).sendKeys(confirmpass);
		driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();
	}
	
	

}
