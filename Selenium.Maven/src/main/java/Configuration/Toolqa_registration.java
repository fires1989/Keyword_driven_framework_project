package Configuration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Data_provider.ExcelDataProvider;
import Utility_library.Browser_action;
import Utility_library.Click_Events;
import Utility_library.Type_Events;

public class Toolqa_registration {
	WebDriver driver;
	@Test
	public void start_toolsQAregistration() throws InterruptedException{
		//we're calling the excel file class we created	
		ExcelDataProvider excel=new ExcelDataProvider();
		
		//Get total rows in the excel.Give sheetname which is specified in excel 
		int rowcount=excel.getrowcount("Toolsregistration");
		System.out.println(rowcount);
		for(int i=1;i<=rowcount;++i)
		{
		String Description=excel.getdata("Toolsregistration", i, 0);
		String Object_Type=excel.getdata("Toolsregistration", i, 1);
		String Actions=excel.getdata("Toolsregistration", i, 2);
		String Locator_type=excel.getdata("Toolsregistration", i, 3);
		String Locator_value=excel.getdata("Toolsregistration", i, 4);
		String Testdata=excel.getdata("Toolsregistration", i, 5);
		if(Object_Type.equalsIgnoreCase("browser"))
		{
			if(Testdata.equalsIgnoreCase("chrome"))
			{
				if(Actions.equalsIgnoreCase("startbrowser"))
				{
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\KRISHNAA\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.39\\chromedriver.exe");	
					driver=new ChromeDriver();		
			    }
				if(Actions.equalsIgnoreCase("closebrowser"))
				{
					driver.quit();
				}
           
		}
        
			
		}
	if(Object_Type.equalsIgnoreCase("openapp"))
	{
		if(Actions.equalsIgnoreCase("navigate"))
		{
			Browser_action.openapplication(driver, Testdata);
		}
	}
	if(Object_Type.equalsIgnoreCase("typetext"))
			{
		Type_Events.typeaction(driver, Locator_type, Locator_value, Testdata);
			}
	if(Object_Type.equalsIgnoreCase("checkbox"))
	{
		Click_Events.clickaction(driver, Locator_type, Locator_value);
		
	}
	if(Object_Type.equalsIgnoreCase("dropdown"))
	{
		Click_Events.clickaction(driver, Locator_type, Locator_value);
		
	}
	if(Object_Type.equalsIgnoreCase("Options"))
	{
		Click_Events.clickaction(driver, Locator_type, Locator_value);
		
	}  
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("scroll(0,500)");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(Object_Type.equalsIgnoreCase("typetext"))
	{
		Click_Events.clickaction(driver, Locator_type, Locator_value);
		
	}
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js.executeScript("scroll(0,150)");
	
	if(Object_Type.equalsIgnoreCase("button"))
	{
		Click_Events.clickaction(driver, Locator_type, Locator_value);
		
	}	
	}
	
}}
