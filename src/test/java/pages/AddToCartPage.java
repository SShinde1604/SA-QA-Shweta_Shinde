package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class AddToCartPage extends BasePage {

	public AddToCartPage(WebDriver driver) 
	{
		super(driver);		
	}
	
	//Locators
	@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory '][@name='add-to-cart-sauce-labs-fleece-jacket']") WebElement AddJacket;
	@FindBy(xpath="//span[@class='shopping_cart_badge'][text()='1']") public WebElement CartContainer;

	// Action Methods
	public void AddToCartButton()
	{
		AddJacket.click();
	}
	
	public boolean ProductCountInCartContainer()
	{
		try
		{
		return CartContainer.isDisplayed();
		}
		catch(Exception e) 
		{
			return false;
		}
		
	}
	

}
