package com.acti.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.qa.base.DriverScript;

public class EnterTimepage extends DriverScript {             
	
	/*Tester:Kirti
	Date Created :8/25/2019
	Description:Login Page Object
*/
	
	//*****************************************************Page Elements*****************************************************************//
	
	@FindBy(xpath="//div[text()='TASKS']") WebElement taskMenu;
	@FindBy(xpath="//div[text()='REPORTS']") WebElement reportsMenu;
	@FindBy(xpath="//div[text()='USERS']") WebElement usersMenu;
	@FindBy(xpath="//div[text()='TIME-TRACK']") WebElement timetrackmenu;
	@FindBy(id="logoutLink") WebElement logoutLink;
	
	//******************************************Page Initialization***********************************************************************//
	
	public EnterTimepage()               // create a constructor same as Classname
	{
		PageFactory.initElements(driver, this);          //Page factory used to initialize the webelements , driver is a supermost class
	//  PageFactory.initElements(driver, Loginpage.class);   this is a keyword used to initialize current class elements
	}
	
	//**********************************************Page Actions**************************************************************************//
	
	public boolean verifyTaskMenuDisplayed()                  // this method to verify if logi displayed or not
	{
		return taskMenu.isDisplayed();
	}
	
	public void clickTaskMenu() 
	{
		taskMenu.click();
	}
	
	public void clickLogout() 
	{
		logoutLink.click();
	}
	
			
}
