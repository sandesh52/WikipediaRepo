package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{

	//	browser related code
    // can change exe easily
	
	
	public static WebDriver openChromeBrowser() //return type Webdriver
	
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		return driver;//driver local is obj.so to send to other class return it. 
	}
	
	
	public static WebDriver openFirefoxBrowser() throws InterruptedException//return type Webdriver
	
	{
		System.setProperty("webdriver.gecko.driver","F:\\Selenium\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		
		Thread.sleep(3000);
		
		WebDriver driver = new FirefoxDriver();
		
		
		return driver;
		
	}

public static WebDriver openMicrosoftEdgeBrowser() //return type Webdriver
	
	{
		System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		return driver;//driver local is obj.so to send to other class return it. 
	}
	
//abc

}

//<!-- for firefox-->
//<test name="FirefoxTest">
//<parameter name="browser" value="Firefox"></parameter>
//    <classes>
//   
//    <class name="testPack.ToVerifyContactUsPageTestNg"/>
//      <class name="testPack.ToVerifyDetailsInImages"/>
//      
//    </classes>
//  </test> <!-- Test1234 --> 
//  