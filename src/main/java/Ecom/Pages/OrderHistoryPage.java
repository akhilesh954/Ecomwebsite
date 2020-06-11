package Ecom.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistoryPage {
WebDriver driver;
	
	@FindBy(css="a.account")
	WebElement account;
	
	@FindBy(xpath="//*[@title=\"Orders\"]")
	WebElement orders;

	
}
