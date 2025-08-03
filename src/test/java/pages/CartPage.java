package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class CartPage extends BasePage{

	public CartPage(WebDriver driver) {
		super(driver);		
	}

	//LOcators
	@FindBy(xpath="//a[@class='shopping_cart_link']") public WebElement CartButton;
	@FindBy(xpath ="//div[text()='Sauce Labs Fleece Jacket']") public WebElement Jacket_YourCart;
	@FindBy(xpath = "//button[@id='checkout']") public WebElement CheckoutButton;
	@FindBy(xpath = "//div//span[text()='Checkout: Your Information']") public WebElement CheckOutPage;
	
	
	// Action Methods
	public boolean ProductDisplay_In_YourCart()
	{
		try 
		{
			return Jacket_YourCart.isDisplayed();
		}
		catch (Exception e) 
		{
			return false;
		}
		
	}
	
	public boolean CheckOutPageTitle()
	{
		try {
			return CheckOutPage.isDisplayed();
		}
		catch (Exception e) {
			return false;
		}		
	}
	

}
