package Utility_library;

import org.openqa.selenium.WebDriver;

public class Browser_action {
	public static String openapplication(WebDriver driver,String localURl)
	{
		try {
			driver.manage().window().maximize();
			driver.get(localURl);
			return "Pass";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return e.getMessage();
			
		}
	}
		public static String closeapplication(WebDriver driver)
		{
			
			try {
				driver.quit();
				return "Pass";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return e.getMessage();
			}
		}
}
