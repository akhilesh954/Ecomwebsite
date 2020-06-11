package ecom.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Ecom.Base.EcomTestBase;
import Ecom.Pages.HomePage;
import Ecom.Pages.LoginPage;
import Ecom.Pages.SignUpPage;
import Ecom.Pages.WomenDressPage;

public class Flow extends EcomTestBase{
	WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	SignUpPage signUpPage;
	WomenDressPage womenDressPage;
	
@BeforeTest
public void setUp()
{
	driver=initialization();
}
@Test(priority=0)
public void SignUp()
{
	homePage=new HomePage(driver);
	homePage.clickOnSignInButton();
	loginPage=new LoginPage(driver);
	loginPage.goToSignupPage(prop.getProperty("username"));
	signUpPage=new SignUpPage(driver);
	signUpPage.goToRegistrationPage(prop.getProperty("userfirstname"), prop.getProperty("userlastname"), 
			prop.getProperty("password"), 
			prop.getProperty("companyname"), 
			prop.getProperty("useraddress"), 
			prop.getProperty("cityname"), 
			prop.getProperty("userpincode"),
			 prop.getProperty("usermobileno"),
			 prop.getProperty("day"), 
			 prop.getProperty("month"), 
			 prop.getProperty("year"), 
			 prop.getProperty("statename"), 
			 prop.getProperty("countryname"),
			 Integer.parseInt(prop.getProperty("Gender")));
	
	         homePage.logout();


}
@Test(priority=1)
public void signInPage()
{
	homePage.clickOnSignInButton();
	loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	
}
@Test(priority=2)
public void WomenDress() throws InterruptedException
{
	womenDressPage=new WomenDressPage(driver);
	womenDressPage.goToTshirts();
	womenDressPage.clickQuickView();
	womenDressPage.addquantity(prop.getProperty("quantity"));
	womenDressPage.addcart();
	driver.switchTo().defaultContent();
	womenDressPage.proceedToCheckout();
	womenDressPage.proceedToSummaryPage();
	womenDressPage.proceedToAddressPage();
	womenDressPage.termsCondion();
	womenDressPage.proceedToShipingPage();
	womenDressPage.bankPayment();
	womenDressPage.confirmOrder();
	womenDressPage.account();
	womenDressPage.purchaseHistory();
	
	// how to get elements using child parent relationship
	
}

@AfterTest 
public void tearDown()
{
	driver.quit();
}

}
