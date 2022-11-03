package utils;

import org.openqa.selenium.WebDriver;

public class Utility 
{
	public static void captureScreen(int testID, WebDriver driver)//it should be public static
	{
		
		//Name : Test- testID Date & Time
		//eg. Test-1234 31-10-2022 08 23 12
	}

	
	//sheet name ,row no, cell no variables
	public static String getDataFromExelSheet()
	{
		
		//execl code
		String data ="";
		
		try
		{
			data= getStringCellValue();
		}
		catch(ExpectedException e)
		{
			double value = getNumericCellValue();
			
			//how to convert double to string 
			//how to convert int to string
			
			data =double to Sting;
		}
		
		catch(Exception e)
		{
			e.printStackTrace(); //return void
			e.getMessage(); //return string
		}
		
		return data;
	}
	
}
