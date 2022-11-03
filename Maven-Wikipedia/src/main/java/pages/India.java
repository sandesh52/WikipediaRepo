package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class India 
{
     private WebDriver driver;
	
	  private WebDriverWait wait;
	

 	 
	  //Constructor - for initialization
	  
	  public India(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
		  
		  this.driver=driver;
	  }
	  
	  
	  //xpath of webelements
	  
	  
		 @FindBy (xpath = "(//img)[3]")
			private WebElement indianFlagLink;
		 
		 @FindBy (xpath = "//button[@title='Show next image']")
			private WebElement nextButtonLink;
		 
		 
		 @FindBy (xpath = "(//a[text()='Mohandas Karamchand Gandhi'])[3]")
			private WebElement mahatmaGandhiLink;
		 
		 @FindBy (xpath = "//a[text()='More details']")
			private WebElement moreDetailsGandhiLink;

		 
		 
		//Methods - Actions on webelement
		  
		  public void indianFlag()
		  {
			  wait = new WebDriverWait(driver,20);
			  wait.until(ExpectedConditions.visibilityOf(indianFlagLink));
			  
			  indianFlagLink.click();
		  }
		  
		 
		 
		  public void nextButton()
		  {
			  wait = new WebDriverWait(driver,20);
			  wait.until(ExpectedConditions.visibilityOf(nextButtonLink));
			  
			  
			  for(int i=0; i<10;i++)
			  {
				  nextButtonLink.click();
			  }
			 
		  }
		  
		  
		  public void mahatmaGandhi()
		  {
			  wait = new WebDriverWait(driver,20);
			  wait.until(ExpectedConditions.visibilityOf(mahatmaGandhiLink));
			  
			  mahatmaGandhiLink.click();
		  }
		  
		  public void moreDetailsGandhi()
		  {
			  wait = new WebDriverWait(driver,20);
			  wait.until(ExpectedConditions.visibilityOf(moreDetailsGandhiLink));
			  
			  moreDetailsGandhiLink.click();
		  }
		 
		 
		 
}
