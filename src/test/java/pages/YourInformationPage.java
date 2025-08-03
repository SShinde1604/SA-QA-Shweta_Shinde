package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class YourInformationPage extends BasePage{

	public YourInformationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='first-name']") public WebElement fname;
	@FindBy(xpath = "//input[@id='last-name']") public WebElement lname;
	@FindBy(xpath = "//input[@id='postal-code']") public WebElement ZipCode;
	@FindBy(xpath = "//input[@id='continue']") public WebElement ContinueButton;
	@FindBy(xpath = "//span[text()='Checkout: Overview']") public WebElement Overview;
	
	

	public boolean OverviewPageTitle()
	{
		try {
			return Overview.isDisplayed();
		}
		catch (Exception e) {
			return false;
		}		
	}
	
	
	

}
