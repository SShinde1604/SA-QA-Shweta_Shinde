package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	//Locators
	@FindBy(xpath="//input[@id='user-name']") public WebElement Username;
	@FindBy(xpath="//input[@id='password']") public WebElement Password;
	@FindBy(xpath="//input[@id='login-button']") public WebElement LoginButton;
	@FindBy(xpath="//span[text()='Products']") public WebElement LoginSuccess;
		
	// Action Methods

	public boolean LoginSuccessful()
	{
		try
		{
		return LoginSuccess.isDisplayed();
		} 
		catch (Exception e) {
	        return false;
	    }

	}
	
}
