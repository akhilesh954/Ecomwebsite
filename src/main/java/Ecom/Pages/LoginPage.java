package Ecom.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	// Page factory
	WebDriver driver;

	
		@FindBy(xpath="//input[@id='email']")
		WebElement email;
		
		@FindBy(xpath="//input[@id='passwd']")
		WebElement password;
	
		@FindBy(xpath="//button[@id='SubmitLogin']")
		WebElement singInBtn;
		
		@FindBy(xpath="//*[@id='email_create']")
		WebElement emailAddressCreateAccount;
		
		@FindBy(xpath="//button[@id='SubmitCreate']")
		WebElement createAnAccountBtn;
		
		public LoginPage(WebDriver driver){
			this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		
		public void goToSignupPage(String email)
		{
			emailAddressCreateAccount.sendKeys(email);
			createAnAccountBtn.click();
		}
		public void login(String emailAddress, String pwd)
		{
			email.sendKeys(emailAddress);
			password.sendKeys(pwd);
			singInBtn.click();
	
		}
		
			
		}


