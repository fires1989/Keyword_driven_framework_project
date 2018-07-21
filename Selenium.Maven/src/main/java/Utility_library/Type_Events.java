package Utility_library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Type_Events {
	//we make this static to call it via class name
		public static String typeaction(WebDriver driver,String Locator_type,String Locator_value,String data)
		{
		try {
			if(Locator_type.equalsIgnoreCase("id"))
			{
				driver.findElement(By.id(Locator_value)).sendKeys(data);
			}
			else if(Locator_type.equalsIgnoreCase("xpath"))
			{
				driver.findElement(By.xpath(Locator_value)).sendKeys(data);
			}
		return "pass";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
		
		}

}
