package com.GF.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.GF.qa.util.WebEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public  static EventFiringWebDriver e_driver;
	public static WebDriverEventListener eventListener;
	
	public TestBase() throws IOException
	{
		prop=new Properties();
		FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/GF"
				+ "/qa/config/config.properties");
		
		prop.load(ip);
	}

	public static void initialization() throws IOException
	{
		String browserName = prop.getProperty("browser");
		
		//browser property setting
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"Drivers/chromedriver");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver");
			driver=new FirefoxDriver();
		}
		else if (browserName.equals("safari"))
		{
			driver=new SafariDriver();
		}
		
		else if(browserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "/Users/admin/Downloads/edgedriver_mac64 (3)/msedgedriver");
			
			driver=new EdgeDriver();
		}
		
		else
		{
			System.out.println("Browser not found");
		}
		
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		
		
		//Common contents
		
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		
		
	}
}
