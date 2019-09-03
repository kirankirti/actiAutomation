package com.acti.qa.testcase;

import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.acti.qa.pages.EnterTimepage;
//import com.acti.qa.pages.Loginpage;


public class TC02_EnterTimeTrackPage extends TC00_BaseTest {           //creating second test case where login to applictaion , and verify the Taskmenu is 
	                                                                 // displayed or not ,on enter time track page
	
	@Test
	public void testVerifyTaskMenu()
	{
		lp.login(prop.getProperty("username"),prop.getProperty("password"));   // first we will login using credentials defined in config-properties and 
		boolean flag = etp.verifyTaskMenuDisplayed();                        // verify if Task Menu is displayed or not.
		Assert.assertTrue(flag);
		etp.clickLogout();
	}
	
    
}

//Instead of writing BeforeMethod and Aftermethod everytime , we can create a Base test case and call from there again and again
//Ctril+Shift+o - to remove unwanted code
