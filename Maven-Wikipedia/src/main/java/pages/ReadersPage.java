package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadersPage 
{
    private WebDriver driver;
	
	private WebDriverWait wait;
	
	 @FindBy (xpath = "//a[text()='Contact Wikipedia']")
	private WebElement contactWikipediaLink;
	 
 	 
	  //Constructor - for initialization
	  
	  public ReadersPage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
		  
		  this.driver=driver;
	  }
	  
	  //Methods - Actions on webelement
	  
	  public void contactWikipedia()
	  {
		  wait = new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.visibilityOf(contactWikipediaLink));
		  
		  contactWikipediaLink.click();
	  }
	  
	 
	  



}
