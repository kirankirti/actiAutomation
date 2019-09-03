package com.acti.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.qa.base.DriverScript;

public class Loginpage extends DriverScript {             //create a login page and inherit from DriverScript
	
	/*Tester:Kirti
	Date Created :8/25/2019
	Description:Login Page Object
*/
	
	//*****************************************************Page Elements*****************************************************************//
	
	@FindBy(xpath="//div[@class='atLogoImg']") WebElement actiLogo;
	@FindBy(id="username") WebElement usernameTb;
	@FindBy(name="pwd") WebElement passwordTb;
	@FindBy(id="loginButton") WebElement loginBtn;
	
	//******************************************Page Initialization***********************************************************************//
	
	public Loginpage()               // create a constructor same as Classname
	{
		PageFactory.initElements(driver, this);          //Page factory used to initialize the webelements , driver is a supermost class
	//  PageFactory.initElements(driver, Loginpage.class);   this is a keyword used to initialize current class elements
	}
	
	//**********************************************Page Actions**************************************************************************//
	
	public boolean logoDisplayed()                  // this method to verify if logi displayed or not
	{
		return actiLogo.isDisplayed();
	}
	
	public void login(String username , String passowrd)       //to enter user name and pw
	{
		usernameTb.sendKeys(username);
		passwordTb.sendKeys(passowrd);
		loginBtn.click();
	}
		
			
}
