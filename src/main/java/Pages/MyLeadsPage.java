package Pages;

import SeleniumBase.ProjectSpecificClass;

public class MyLeadsPage extends ProjectSpecificClass {
	
	public CreateLeadPage clickCreateLead()
	{
	
	driver.findElementByLinkText("Create Lead").click();
	
	return new CreateLeadPage();
	
	}

}
