package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Headers;
import pom.LoginPage;

public class Verification {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek Singh\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//TestCase 1
		
		driver.get("https://www.flipkart.com/");
	
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.sendUserName();
	    loginPage.sendpassword();
		loginPage.clickOnLogin();
		
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
        Thread.sleep(5000);
        
		Headers headers = new Headers(driver);
		headers.openSeller();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		
		
		
		if(url.equals("https://seller.flipkart.com/sell-online/?utm_source=fkwebsite&utm_medium=websitedirect") && title.equals("Sell Online on Flipkart | Grow your business with the leader in Indian e-commerce"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAILED");
		}
		
		//driver.close();
		driver.navigate().back();
		
		headers.clickOnLogout();
		
			
		
//       TestCase 2
		
				driver.get("https://www.flipkart.com/");
			
		     	loginPage = new LoginPage(driver);
				
				loginPage.sendUserName();
			    loginPage.sendpassword();
				loginPage.clickOnLogin();
				
		    // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		       
				 Thread.sleep(5000);
				 
		        headers = new Headers(driver);
		        
				headers.openCart();                           
				
				url = driver.getCurrentUrl();
				title = driver.getTitle();
				System.out.println(url);
				System.out.println(title);
				
				 
				
           if(url.equals("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART") && title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
				{
					System.out.println("PASS");
				}
				else
				{
					System.out.println("FAILED");
				}
		
          
           
	        driver.quit();
		
	}

}
