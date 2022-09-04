package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Headers {

	@FindBy(xpath = "(//span[contains(text(),'Become a Seller')])[1]")
	private WebElement becomeSeller;

	@FindBy(xpath = "//span[contains(text(),'Cart')]")
	private WebElement cart;

	@FindBy(xpath = "//div[text()='Abhishek']")
	private WebElement abhi;

	@FindBy(xpath = "//div[text()='Logout']")
	private WebElement logout;

	@FindBy(xpath = "//input[@title='Search for products, brands and more']")
	private WebElement searchbar;


	private WebDriver driver; 
	private WebDriverWait wait;  
	private Actions action;

	public Headers(WebDriver driver) // ->driver = driver of main method = new chromeDriver()
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		action = new Actions(driver);

	}
//vgfjhvbvvvvvvvvvvvvvhhjbgh
	//vhhjvjhbjbvh
	public void openSeller() {
		becomeSeller.click();
	}

	public void openCart() {
		cart.click();
	}

	public void abhishek() throws InterruptedException {

		//Thread.sleep(2000);
		action.moveToElement(abhi).perform();

		Thread.sleep(2000);
		action.moveToElement(logout).click().build().perform();
	}

	public void clickOnLogout() {


		action.moveToElement(logout).click().build().perform(); 




		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(null)		

				//		Actions action = new Actions(driver);
				//		action.moveToElement(abhi).perform();		
				//	action.click().perform(); 
				//  logout.click();

	}

	public void clickOnSearch(){

		searchbar.click();
	}








}
