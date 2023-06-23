package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class LeadPage extends HeaderPage {
	

	public LeadPage(WebDriver driver, ExtentTest logger)
	{
		super(driver,logger);		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="firstname")
	WebElement tb_firstname;
	
	@FindBy(name="lastname")
	WebElement tb_lastname;
	
	@FindBy(name="company")
	WebElement tb_company;
	
	@FindBy(name="button")
	WebElement btn_save;
	
	@FindBy(xpath="//td[text()='Last Name:']/following::td[1]")
	WebElement lbl_LastNameValue;
	
	@FindBy(xpath="//td[text()='Company:']/following::td[1]")
	WebElement lbl_CompanyValue;
	
	
	
	
	
	
	
	public void createLead(String lname, String comp)
	{
		type(tb_lastname,lname, lname+" has been entered into lastname fields");
		type(tb_company,comp, comp+" has been entered into company fields");
		click(btn_save, "Save button clicked");
	}
	
	public void verifyLeadCreation(String lname, String comp)
	{
		getTextandValidate(lbl_LastNameValue, lname, "Lastname Expected text matched with actual");
		getTextandValidate(lbl_CompanyValue, comp, "company Expected text matched with actual");
	}
	
	
	

}
