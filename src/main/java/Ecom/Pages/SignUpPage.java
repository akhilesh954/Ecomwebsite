package Ecom.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage 
{
	WebDriver driver;
	Select select;

	@FindBy(xpath = "//input[contains(@id,'id_gender')]")
	List<WebElement> title;

	@FindBy(xpath = "//*[@id='customer_firstname']")
	WebElement firstname;

	@FindBy(xpath = "//*[@id='customer_lastname']")
	WebElement lastname;

	@FindBy(xpath = "//*[@id='passwd']")
	WebElement password;

	@FindBy(xpath = "//*[@id='days']")
	WebElement days;

	@FindBy(xpath = "//*[@id='months']")
	WebElement months;

	@FindBy(xpath = "//*[@id='years']")
	WebElement years;

	@FindBy(xpath = "//*[@id='company']")
	WebElement company;

	@FindBy(xpath = "//*[@id='address1']")
	WebElement address1;

	@FindBy(xpath = "//*[@id='city']")
	WebElement city;

	@FindBy(xpath = "//*[@id='id_state']")
	WebElement state;

	@FindBy(xpath = "//*[@id='postcode']")
	WebElement postcode;
	
	@FindBy(xpath="//select[@id='id_country']")
	WebElement country;

	@FindBy(xpath = "//*[@id='phone_mobile']")
	WebElement mobilephone;

	@FindBy(xpath = "//*[@id='submitAccount']")
	WebElement register;

	public SignUpPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void goToRegistrationPage(String userfirstname, String userlastname, String userpassword, String companyname,
			String useraddress, String cityname, String userpincode, String usermobileno,String day, String month, String year, String statename, String countryname, int i)
	{
		title.get(i).click();
		firstname.sendKeys(userfirstname);
		lastname.sendKeys(userlastname);
		password.sendKeys(userpassword);
		select=new Select(days);
		select.selectByValue(day);
		select=new Select(months);
		select.selectByValue(month);
		select=new Select(years);
		select.selectByValue(year);
		company.sendKeys(companyname);
		address1.sendKeys(useraddress);
		city.sendKeys(cityname);
		select=new Select(state);
		select.selectByValue(statename);
		postcode.sendKeys(userpincode);
		select=new Select(country);
		select.selectByVisibleText(countryname);
		mobilephone.sendKeys(usermobileno);
		register.click();
	}
}