package Pages;

import SeleniumBase.ProjectSpecificClass;

public class LoginPage extends ProjectSpecificClass {
	
	
	public LoginPage enterUserName()
	{
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		return this;
		
	}
	
	public LoginPage enterPasword()
	{
		
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		return this;
			
	}
	
	public HomePage ClickSubmit()
	{
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		return new HomePage();
		
			
	}
	
	

}
