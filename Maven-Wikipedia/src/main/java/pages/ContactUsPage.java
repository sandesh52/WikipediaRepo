package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUsPage 
{

    private WebDriver driver;
	
	private WebDriverWait wait;
	
	 
	 
	//Constructor - for initialization
	  
	  public ContactUsPage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
		  
		  this.driver=driver;
	  }
	 
	  
	  //Xpath of webelements
	  
	  @FindBy (xpath = "//span[text()='Readers']")
		private WebElement readersButtonLink;
	 
	  
	  @FindBy (xpath = "//span[text()='Licensing']")
		private WebElement LicensingButtonLink;
	 
	  
	  //Methods
	  
	  
	 public void ReadersButton()
	  {
		  wait = new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.visibilityOf(readersButtonLink));
		  
		  readersButtonLink.click();
	  }
	 
	 public void LicensingButton()
	  {
		  wait = new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.visibilityOf(LicensingButtonLink));
		  
		  LicensingButtonLink.click();
	  }

}
