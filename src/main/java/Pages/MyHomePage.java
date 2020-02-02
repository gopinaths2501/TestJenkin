package Pages;

import SeleniumBase.ProjectSpecificClass;

public class MyHomePage extends ProjectSpecificClass {
	
	public MyLeadsPage ClickLeads()
	
	{
		driver.findElementByLinkText("Leads").click();
		
		return new MyLeadsPage();
		
	}
	

}
