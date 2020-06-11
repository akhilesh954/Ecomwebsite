package Ecom.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	@FindBy(css="a.login")
	WebElement signIn;
	
	@FindBy(css="a.logout")
	WebElement logoutBtn;

	public HomePage(WebDriver driver){
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignInButton() {
		signIn.click();
	}
	public void logout()
	{
    logoutBtn.click();
	}
}
