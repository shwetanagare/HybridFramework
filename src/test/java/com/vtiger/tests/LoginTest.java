package com.vtiger.tests;

import org.testng.annotations.Test;

import com.vtiger.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void TestCase1_InValidLogin()
	{
		String TCName ="TestCase1_InValidLogin"; 
		logger = extent.createTest(TCName);		
		LoginPage lp = new LoginPage(driver,logger);
		lp.login(td.get(TCName).get("Userid"), td.get(TCName).get("Password"));
		extent.flush();
	}
	
	@Test
	public void TestCase2_ValidLogin()
	{
		String TCName ="TestCase2_ValidLogin"; 
		logger = extent.createTest(TCName);		
		LoginPage lp = new LoginPage(driver,logger);
		lp.login(td.get(TCName).get("Userid"), td.get(TCName).get("Password"));
		extent.flush();
	}

}
