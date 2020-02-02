package Pages;

import SeleniumBase.ProjectSpecificClass;

public class CreateLeadPage extends ProjectSpecificClass {

	public CreateLeadPage enterCompanyName()
	{
	
	driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
	return this;
	
	}
	
	public CreateLeadPage enterFirstName()
	
	{
	driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
	
	return this;
	
	}
	
	public CreateLeadPage enterLastName()
	{
	driver.findElementById("createLeadForm_lastName").sendKeys("J");
	
	return this;
	
	}
	
	public ViewLeadPage ClickSubmit()
	{
	
	driver.findElementByName("submitButton").click();
	
	return new ViewLeadPage();
	
	
	}
	
}
