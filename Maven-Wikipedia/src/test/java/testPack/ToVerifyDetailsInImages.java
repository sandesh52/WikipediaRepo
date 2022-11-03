package testPack;

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

import pages.India;
import pages.MainWikiPage;
import setUp.Base;



public class ToVerifyDetailsInImages extends Base

 {
	private WebDriver driver;
	private MainWikiPage mainWikiPage;
	private India india;
	
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
		india = new India (driver);
	
	}
	
	@BeforeMethod
	
	public void indiaImages()
	{
		System.out.println("before method");
		
		 driver.get("https://en.wikipedia.org/wiki/Wiki");
		 
	     mainWikiPage.searchBox();
	     
	     india.indianFlag();
	     
	     india.nextButton();
	     
	}
	
	@Test 
	public void verifyMahatmaGandhiPage()
	{
		System.out.println("test 1");
		
        india.mahatmaGandhi();
        
        
		//Actual Results
        
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		

		Assert.assertEquals(url, "https://en.wikipedia.org/wiki/Mahatma_Gandhi");
		Assert.assertEquals(title,"Mahatma Gandhi - Wikipedia" );
		
		
	}
	
	@Test 
	
	public void verifyMoreDetailsButton()
	{
		System.out.println("test 2");
		
       india.moreDetailsGandhi();
        
        
		//Actual Results
        
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		

		Assert.assertEquals(url, "https://commons.wikimedia.org/wiki/File:Nehru_gandhi.jpg");
		Assert.assertEquals(title,"File:Nehru gandhi.jpg - Wikimedia Commons" );
		
		
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
		india = null;
    }
    
    
    
    @AfterTest
    
    public void closeBrowser()
    {
    	
    	driver.close();
    	driver= null;  //so make it null
    	System.gc();
    	
    }
    
    



}
