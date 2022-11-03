package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainWikiPage 
{
    
	private WebDriver driver;
	
	private WebDriverWait wait;
	

 	 
	  //Constructor - for initialization
	  
	  public MainWikiPage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
		  
		  this.driver=driver;
	  }
	  
	  
	  //xpath of webelements
	  
	  
		 @FindBy (xpath = "//a[text()='Contact Wikipedia']")
			private WebElement contactWikipediaLink;
			 
		 @FindBy (xpath = "//input[@id='searchInput']")
			private WebElement searchBoxLink;
		 
		 @FindBy (xpath = "//input[@title='Go to a page with this exact name if it exists']")
			private WebElement searchingLink;
		 
	  
	  //Methods - Actions on webelement
	  
	  public void contactWikipedia()
	  {
		  wait = new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.visibilityOf(contactWikipediaLink));
		  
		  contactWikipediaLink.click();
	  }
	  
	  public void searchBox()
	  {
		  wait = new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.visibilityOf(searchBoxLink));
		  
		  wait = new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.visibilityOf(searchingLink));
		  
		  searchBoxLink.click();
		  
		  searchBoxLink.sendKeys("India");
		  
		  searchingLink.click();
		  
		  
		  
	  }
	  
	 
	  


}
