package Utility_library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_factory {
	static WebDriver driver;
	public static WebDriver startbrowser(String browsername,String url)
	{
	if(browsername.equalsIgnoreCase("firefox"))
	{
	driver=new FirefoxDriver();
	}
	/*equalsignorecase will not check whether the argument is upper or lower case*/ 
	else if(browsername.equalsIgnoreCase("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","G:\\Sel_testng_Jarfiles\\chromedriver_win32 (1).exe");	 
	driver=new ChromeDriver();		
	}
	driver.manage().window().maximize();
	driver.get(url);
	return driver; /*return type of this class is webdriver so we've returned the driver*/	
	}
}
