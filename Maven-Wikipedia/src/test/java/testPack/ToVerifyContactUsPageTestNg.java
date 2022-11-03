package testPack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.MainWikiPage;
import pages.ReadersPage;
import setUp.Base;

public class ToVerifyContactUsPageTestNg extends Base

{
	//globaly created references
	private WebDriver driver;
	private MainWikiPage mainWikiPage;
	
	private ContactUsPage contactUsPage;

	
	@Parameters ("browser")
	
	
	//browser launch code is present in base class.here we only give call
	
	@BeforeTest
	public void launchBrowser(String browserName) throws InterruptedException

	
	{
		System.out.println(browserName);
     
		if(browserName.equals("Chrome"))
	
     {
			driver = openChromeBrowser();
		
	  }
		
		if(browserName.equals("Firefox"))
			
	     {
			driver = openFirefoxBrowser();
			 
		 }
		
		if(browserName.equals("Edge"))
			
	     {
			driver = openMicrosoftEdgeBrowser();
			 
		 }
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		 driver.manage().window().maximize();
	}
	
	
	
	//All POM class obj will creat here
	//POM class avoid stale element exec 99%
	
	@BeforeClass
	public void creatPOMObjects()
	{
		 mainWikiPage = new MainWikiPage(driver);
		 contactUsPage = new ContactUsPage(driver);
		
	}
	
	
	@BeforeMethod
	
	public void contactWiki()
	{
		System.out.println("before method");
		
		 driver.get("https://en.wikipedia.org/wiki/Wiki");
		
	    mainWikiPage.contactWikipedia();
	    
	    }
	
    @Test //(priority = 1)
	
	
	public void verifyReadersButton()
	{
		System.out.println("test 1");
		
        contactUsPage.ReadersButton();
        
        
		//Actual Results
        
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		

		Assert.assertEquals(url, "https://en.wikipedia.org/wiki/Wikipedia:Contact_us/Readers");
		Assert.assertEquals(title,"Wikipedia:Contact us/Readers - Wikipedia");
		
//        if(url.equals("https://en.wikipedia.org/wiki/Wikipedia:Contact_us/Readers") && title.equals("Wikipedia:Contact us/Readers - Wikipedia")) //write this title from html page.and not from tab name.
//			{
//				System.out.println("PASSED");
//			}
//				else
//				{
//					System.out.println("FAILED");
//				}
		
	}
	
	@Test // (priority = 2 , dependsOnMethods = "verifyReadersButton")
	
	
	public void verifyLicensing()
	{
		System.out.println("test 2");
		
          contactUsPage.LicensingButton();
        
        
		//Actual Results
        
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		

		
		Assert.assertEquals(url, "https://en.wikipedia.org/wiki/Wikipedia:Contact_us/Licensing");
		Assert.assertEquals(title,"Wikipedia:Contact us/Licensing - Wikipedia");
		
		
//        if(url.equals("https://en.wikipedia.org/wiki/Wikipedia:Contact_us/Licensing") && title.equals("Wikipedia:Contact us/Licensing - Wikipedia")) //write this title from html page.and not from tab name.
//			{
//				System.out.println("PASSED");
//			}
//				else
//				{
//					System.out.println("FAILED");
//				}
		
	}
	
	
	
    @AfterMethod
    
    public void logOutFromApplication()
    {
    	System.out.println("logout");
    }
    
    @AfterClass
    
    public void clearObject()
    {
    	mainWikiPage = null;
		 contactUsPage = null;
    }
    
    
    
    @AfterTest
    
   public void closeBrowser()
    {
    	driver.close(); //work of driver obj finish.
    	driver= null;  //so make it null
    	System.gc();
    }
    
    

}
