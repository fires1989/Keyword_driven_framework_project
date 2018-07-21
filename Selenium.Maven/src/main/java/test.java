import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//successfully ran this test 
public class test {
	@Test
	public void Testrun(){
	 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KRISHNAA\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.39\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("http://www.facebook.com");
	 
	driver.quit();
	 
	}
}
