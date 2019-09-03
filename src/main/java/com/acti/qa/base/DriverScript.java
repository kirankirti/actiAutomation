package com.acti.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

/*     Tester:Kirti
       Date Created : 8/25/2019
       Verified By : Shantosh
       Description : Parent Script    */

public class DriverScript {        //it will drive the script and read the contents from acti-config properties
	
	public static WebDriver driver;     //declare a global variable
	public static Properties prop;      //declare another global variable
	
	public DriverScript()    // create a contructor
	{
		try
		{
			//create an object of Fileinputstream  . remember 4 lines of code
			File src = new File("./acti-config/Config-properties");
			FileInputStream fis = new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		
		}
		catch(Exception e)
		{
			System.out.println("File no found :" +e.getMessage());
		}
	}
	
	@Test                                     //if we want to run this driver script , annotate with @Test
	public static void initBrowser()          //initialized all browsers
	{
		String browser = prop.getProperty("browser");           //if u want to run on different browser , go and change in the Config properties
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./acti-browsers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.gecko.driver","./acti-browsers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","./acti-browsers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.out.println("Not a valid browser name");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("qaurl"));               //u can also change this URL and give any other as defined in the config properties
		
	}

}
