package com.vtiger.tests;

import org.testng.annotations.Test;

import com.vtiger.pages.LeadPage;
import com.vtiger.pages.LoginPage;

public class LeadTest extends BaseTest {
	
	
	
	@Test
	public void TestCase3_LeadCreation()
	{
		String TCName ="TestCase3_LeadCreation"; 
		logger = extent.createTest(TCName);		
		LoginPage lp = new LoginPage(driver,logger);
		lp.login(td.get(TCName).get("Userid"), td.get(TCName).get("Password"));
		LeadPage ldp = new LeadPage(driver,logger);
		ldp.clickNewLead();
		ldp.createLead(td.get(TCName).get("LastName"), td.get(TCName).get("Company"));
		ldp.verifyLeadCreation(td.get(TCName).get("LastName"), td.get(TCName).get("Company"));
		ldp.clickLogout();
		extent.flush();
	}

}
