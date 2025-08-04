package testCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.TestBase;
import pages.AddToCartPage;
import pages.CartPage;
import pages.LogOutPage;
import pages.YourInformationPage;
import pages.LoginPage;
import pages.Login_Page_Negative;
import pages.OverviewPage;

public class TC001_PurchaseFlow_Test extends TestBase {

	@Test(groups = { "Sanity", "Master" })
	public void VerifyLoginFun() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.Username.sendKeys(p.getProperty("Username"));
		lp.Password.sendKeys(p.getProperty("Password"));
		lp.LoginButton.click();
		Thread.sleep(3000);

		boolean VerfyTitle = lp.LoginSuccessful();
		System.out.println("User is logged in");
		System.out.println("--------------------------------------------------");
		Assert.assertEquals(VerfyTitle, true, "Login F");
		Thread.sleep(1000);

	}

	@Test(priority = 1, groups = { "Sanity", "Master" })
	public void VerifyAddToCartFunc() throws InterruptedException {
		AddToCartPage ac = new AddToCartPage(driver);
		ac.AddToCartButton();
		Thread.sleep(2000);

		boolean ProductCount = ac.ProductCountInCartContainer();
		System.out.println("Product count is displayed in cart container: " + ProductCount);
		Assert.assertEquals(ProductCount, true, "Product count in cart container is incorrect");	
		Thread.sleep(1000);
		System.out.println("--------------------------------------------------");
	}

	@Test(priority = 2, groups = { "Sanity", "Master" })
	public void Verify_CartPage_Func() throws InterruptedException {
		CartPage cp = new CartPage(driver);
		cp.CartButton.click();
		Thread.sleep(1000);
		boolean ProductInCart =cp.ProductDisplay_In_YourCart();
		System.out.println("Added Product is displayed in Cart Page: "+ProductInCart);
		Assert.assertEquals(ProductInCart, true, "Product is not displayed in Cart Page");
		cp.CheckoutButton.click();
		Thread.sleep(1000);
		System.out.println("--------------------------------------------------");
		
		boolean ChkOutPageTitle = cp.CheckOutPageTitle();
		System.out.println("Title of the Checkout Page is verfied: "+ChkOutPageTitle);
		Assert.assertEquals(ChkOutPageTitle, true, "Checkout: Your Information - is not displayed");
		Thread.sleep(1000);
		System.out.println("--------------------------------------------------");
	}
	
	@Test(priority = 3, groups= {"Sanity", "Master"})
	public void Verify_Checkout_Func() throws InterruptedException
	{
		YourInformationPage YoInfo = new YourInformationPage(driver);
		
		YoInfo.fname.sendKeys("Test1");
		YoInfo.lname.sendKeys("Automation");
		YoInfo.ZipCode.sendKeys("123456");
		Thread.sleep(1000);
		YoInfo.ContinueButton.click();
		Thread.sleep(3000);
		boolean OverviewTitle = YoInfo.OverviewPageTitle();
		System.out.println("Title of the Checkout Overview Page is verified: "+OverviewTitle);
		Assert.assertEquals(OverviewTitle, true, "Checkout: Overview - is not displayed");
		System.out.println("--------------------------------------------------");
		
	}
	
	@Test(priority = 4, groups= {"Sanity", "Master"})
	public void Verify_Order_Success_Func() throws InterruptedException
	{
		OverviewPage OP = new OverviewPage(driver);
		OP.finishButton.click();
		
		boolean Odermsg = OP.Order_Success_MSG();
		System.out.println("Title of the Checkout Complete Page is verified: "+Odermsg);
		Assert.assertEquals(Odermsg, true, "Checkout: Complete - is not displayed");
		
		OP.BackToHomeButn.click();
		Thread.sleep(1000);
		System.out.println("--------------------------------------------------");
		
	}
	
	@Test(priority = 5, groups= {"Sanity", "Master"})
	public void Verify_Logout_Fun() throws InterruptedException
	{
		LogOutPage lg = new LogOutPage(driver);
		lg.Menu.click();
		lg.logoutBtn.click();
		System.out.println("User is logged out");
		System.out.println("--------------------------------------------------");
	}
	
	// Negative test case
	@Test(priority = 6, groups= {"Sanity", "Master"})
	public void Verify_Invalid_Login_Fun() throws InterruptedException
	{
		Login_Page_Negative lgN = new Login_Page_Negative(driver);
			lgN.Username_N.sendKeys("standard_user456");
			lgN.Password_N.sendKeys("secret_sauce456");
			lgN.LoginButton_N.click();
			System.out.println("Negative Test Case: ");
			
			boolean FailedLogin = lgN.LoginFailure();
			System.out.println("Error message is displayed for invalid login: "+FailedLogin);
			Assert.assertEquals(FailedLogin, true, "Expected login to fail with invalid credentials, but it passed.");
			System.out.println("--------------------------------------------------");		
		
	}
	
}
