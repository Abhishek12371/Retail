package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import browsers.Base;
import pom.Headers;
import pom.LoginPage;

/**
 * x
 *
 */

public class verifyUiTestNG {

	WebDriver driver;
	Headers headers;
	LoginPage loginPage;
	SoftAssert softAssert;

	@Parameters("browserName")

	@BeforeTest

	public void launchBrowser(String browser) {

		System.out.println("before class");

		if (browser.equals("Chrome")) {
			driver = Base.openChromeBrowser();
		}

		if (browser.equals("Edge")) {
			driver = Base.openEdgeBrowser();
		}

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		// driver.get("https://www.flipkart.com/");

	}

	@BeforeClass
	public void createPOMobjects() {

		loginPage = new LoginPage(driver);
		headers = new Headers(driver);

	}

	@BeforeMethod
	public void loginToApplication() {
		System.out.println("before method");

	driver.get("https://www.flipkart.com/");

		loginPage.sendUserName();
		loginPage.sendpassword();
		loginPage.clickOnLogin();

		softAssert = new SoftAssert();

	}

//**** Test case 1

	@Test(priority = 1, description = "This is about Seller")
	public void toVerifySellerButton() {

		System.out.println("test A");
		headers.openSeller();

		String actualTitle = "Sell Online on Flipkart | Grow your business with the leader in Indian e-commerce";
		String url = driver.getCurrentUrl();
		String expectedTitle = driver.getTitle();
		System.out.println(url);
		System.out.println(expectedTitle);

		softAssert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertEquals(url,
				"https://seller.flipkart.com/sell-online/?utm_source=fkwebsite&utm_medium=websitedirect");
		softAssert.assertAll();

	}

// **** Test case 2

	@Test(priority = 2, description = "This is add to Cart section")
	public void toVerifyCart() {

		System.out.println("test B ");
		headers.openCart();

		String actualTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String url = driver.getCurrentUrl();
		String expectedTitle = driver.getTitle();
		System.out.println(url);
		System.out.println(expectedTitle);

		softAssert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertEquals(url, "https://www.flipkart.com/viewcart?otracker=Cart_Icon_Click");
		softAssert.assertAll();

	}

//**** Test case 3

	@Test(priority = 3)

	public void toVerifySearchBar() {

		System.out.println("test C");

		headers.clickOnSearch();

		String expectedTitle = "Search for products, brands and more";
		String actualTitle = driver.getTitle();
		System.out.println(expectedTitle);
		System.out.println(actualTitle);

		softAssert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertAll();

	}

	@AfterMethod
	public void logoutFromApp() {
		System.out.println("after method");

		headers.clickOnLogout();

	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("after class");

		loginPage = null;
		headers = null;
	}

	@AfterTest
	public void closedBrowser() {
		System.out.println("after test");

		driver.quit();
		driver = null;
		System.gc(); // garbage

	}

//	if (url.equals("https://seller.flipkart.com/sell-online/?utm_source=fkwebsite&utm_medium=websitedirect")
//	&& title.equals("Sell Online on Flipkart | Grow your business with the leader in Indian e-commerce")) {
//System.out.println("PASS");
//} else {
//System.out.println("FAILED");
//}

//	if (url.equals("https://www.flipkart.com/viewcart?otracker=Cart_Icon_Click") && title.equals(
//	"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
//
//{
//System.out.println("PASS");
//} else {
//System.out.println("FAILED");
//}	

}
