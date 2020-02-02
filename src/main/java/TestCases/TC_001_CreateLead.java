package TestCases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import SeleniumBase.ProjectSpecificClass;

public class TC_001_CreateLead extends ProjectSpecificClass{
	
	
	@Test
	
	public void runLogin () {
		
		//LoginPage obj =  new LoginPage();
		
		new LoginPage()
		
		.enterUserName()
		.enterPasword()
		.ClickSubmit()
		.ClickCRMSFA()		
		.ClickLeads()
		.clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.ClickSubmit()
		.viewleads();


	}

}
