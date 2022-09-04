package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	
	
	//flipkart
	@FindBy (xpath = "(//input[@type='text'])[2]")
	private WebElement userName;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginButton;
	
	
	// private WebDriver driver ; //global 
	//private Actions action;
	//private WebDriverWait wait;
	
	public LoginPage(WebDriver driver) // ->driver = driver of main method = new chromeDriver() 
	{
		PageFactory.initElements(driver, this);
		
	//	this.driver= driver ;
		
	//	action = new Actions(driver);
		
		
	}
	
	public void sendUserName() {
		
	//	wait = new WebDriverWait(driver,30);
	//	wait.until(ExpectedConditions.visibilityOf(userName));
		userName.sendKeys("7841022872");
	}
	
	public void sendpassword() {
		
	//	wait = new WebDriverWait(driver,20);
	//	wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("satyam@123");
	}
	
	public void clickOnLogin() {
		loginButton.click();
		//action.moveToElement(loginButton).click().build().perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
// OR
//	
//	public void loginToApplication() {
//		
//		userName.sendKeys("7841022872");
//		password.sendKeys("satyam@123");
//		loginbutton.click();
		
		
	}
	
	
	