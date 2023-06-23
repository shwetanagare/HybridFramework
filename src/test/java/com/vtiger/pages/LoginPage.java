package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.utilities.CommonActions;

public class LoginPage extends CommonActions {
		
	public LoginPage(WebDriver driver, ExtentTest logger)
	{
		super(driver,logger);		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name")
	WebElement tb_username;
	
	@FindBy(name="user_password")
	WebElement tb_password;
	
	@FindBy(name="Login")
	WebElement btn_login;
	
	/*
	String user = "//user_name";
	By uid = By.name("user_name");
	By password =By.name("user_password");
	By login = By.name("Login");
	*/
	
	
	
	public void login(String userid, String pwd)
	{
		type(tb_username,userid,userid +" has been entered into username field");
		type(tb_password,pwd,"Password "+pwd +" has been entered into password field");
		click(btn_login,"Login button clicked successfully");
	}
	

}
