package SeleniumBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificClass {
	
	public static ChromeDriver driver;	
    public String excelFileName;
    
	
	@BeforeMethod

	public void RunCreateEdit1 () {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("I am @BeforeMethod");
	}
		
        @AfterMethod
		
		public void RunCreateEdit2 () {	
		
			driver.close();
			
			System.out.println("I am @AfterMethod");
			
	
	}
        
        	
            
}
        
        

