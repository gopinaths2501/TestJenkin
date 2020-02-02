package Pages;

import SeleniumBase.ProjectSpecificClass;

public class HomePage extends ProjectSpecificClass {
	
	
	public MyHomePage  ClickCRMSFA()
	{
		   
		driver.findElementByLinkText("CRM/SFA").click();
		
		return new MyHomePage();
		
			
		
	}
	
	

}
