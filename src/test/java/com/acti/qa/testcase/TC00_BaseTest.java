package com.acti.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.qa.base.DriverScript;
import com.acti.qa.pages.EnterTimepage;
import com.acti.qa.pages.Loginpage;


public class TC00_BaseTest extends DriverScript{ 
	
	Loginpage lp;  
	EnterTimepage etp;
	
	public TC00_BaseTest()
	{
		super(); 
	}
	
	@BeforeMethod
	public void preTest()
	{
		initBrowser();
		lp=new Loginpage();   
		etp=new EnterTimepage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
