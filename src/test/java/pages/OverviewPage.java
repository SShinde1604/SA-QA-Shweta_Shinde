package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class OverviewPage extends BasePage {

	public OverviewPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//button[@id='finish']") public WebElement finishButton;
	@FindBy(xpath = "//h2[text()='Thank you for your order!']") public WebElement ThankyouMsg;
	@FindBy(xpath = "//button[@id='back-to-products']") public WebElement BackToHomeButn;
	
	public boolean Order_Success_MSG()
	{
		try {
			return ThankyouMsg.isDisplayed();
		}
		catch (Exception e) {
			return false;
		}
	}

}
