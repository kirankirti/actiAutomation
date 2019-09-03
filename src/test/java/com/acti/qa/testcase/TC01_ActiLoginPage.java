package com.acti.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.qa.base.DriverScript;
import com.acti.qa.pages.Loginpage;

public class TC01_ActiLoginPage extends DriverScript{ 
	
	Loginpage lp;       // create a gloabla variable
	
	public TC01_ActiLoginPage()   //create a constructor
	{
		super(); //super is the keywork to invoke or call parent class constructor , parent class which is Driver script contains configuration properties
	}
	
	@BeforeMethod
	public void preTest()
	{
		initBrowser();
		lp=new Loginpage();   //create a global variable for login page
	}
	
	@Test(priority=1)
	public void testVerifyActiLogo()  //to verify if logo is there or not
	{
	boolean flag = lp.logoDisplayed();
	//System.out.println(flag);            //Run this program it will print true or false
	Assert.assertTrue(flag);           //instead of priniting it will just validate the result
	}
	
	@Test(priority=2)
	public void testValidatelogin() throws InterruptedException
	{
		lp.login("admin", "manager");           // global variable is declared above and it will access all objects from Loginpage.java inside com,acti.qa.pages
		Thread.sleep(2000);
		Assert.assertTrue(driver.getTitle().contains("Enter"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	

}

//What is the class in TestNG to verify ? Assert
//Verify will go and check for something , validate will actually validate the functionality


