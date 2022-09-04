/**
 * 
 */
package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @author Abhishek Singh x
 *
 */
public class Base {
	
	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek Singh\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver ;   //void 
	}
	                                               
	public static WebDriver openEdgeBrowser()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Abhishek Singh\\Downloads\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        return driver ;
	}
	
	
	
	
	
	
	
	
}
