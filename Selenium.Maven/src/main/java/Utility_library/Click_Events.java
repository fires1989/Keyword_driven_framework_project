package Utility_library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Click_Events {
	public static String clickaction(WebDriver driver,String Locator_type,String Locator_value)
	{
	try {
		if(Locator_type.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(Locator_value)).click();
		}
		else if(Locator_type.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(Locator_value)).click();
		}
	return "pass";
	} catch (Exception e) {
		// TODO Auto-generated catch block
		return e.getMessage();
	}
	
	}
		
		
}
