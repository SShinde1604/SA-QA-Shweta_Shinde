package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Login_Page_Negative extends BasePage{

	public Login_Page_Negative(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	@FindBy(xpath="//input[@id='user-name']") public WebElement Username_N;
	@FindBy(xpath="//input[@id='password']") public WebElement Password_N;
	@FindBy(xpath="//input[@id='login-button']") public WebElement LoginButton_N;
	@FindBy(xpath="//span[text()='Products']") public WebElement LoginFail;
	
	
	public boolean LoginFailure()
	{
		try
		{
		return LoginFail.isDisplayed();
		} 
		catch (Exception e) {
	        return false;
	    }

	}

}
