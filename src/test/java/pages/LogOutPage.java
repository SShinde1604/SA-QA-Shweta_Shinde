package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class LogOutPage extends BasePage{

	public LogOutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") public WebElement Menu;
	@FindBy(xpath = "//a[@id='logout_sidebar_link']") public WebElement logoutBtn;

}
