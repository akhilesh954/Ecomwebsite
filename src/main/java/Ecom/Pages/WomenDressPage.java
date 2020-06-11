package Ecom.Pages;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.common.XPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WomenDressPage {

	WebDriver driver;
	Actions A;

	@FindBy(xpath = "//a[@title='Women']")
	WebElement women;

	@FindBy(xpath = "(//a[@title='T-shirts'])[1]")
	WebElement Tshirts;

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img")
	WebElement quickView;

	@FindBy(xpath = "//input[@id='quantity_wanted']")
	WebElement addquantity;

	@FindBy(xpath = "//button[@name='Submit']")
	WebElement addtocart;
	@FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
	WebElement checkout;

	@FindBy(xpath = "//div[@id='center_column']/p[2]/a/span")
	WebElement summaryPage;

	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	WebElement addressPage;

	@FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
	WebElement shipingPage;
	@FindBy(xpath = "//*[@id=\"cgv\"]")
	WebElement termsconditions;
	@FindBy(css = "a.bankwire")
	WebElement bankPayment;

	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	WebElement confirmOrder;

	@FindBy(css = ".account")
	WebElement account;
	@FindBy(css = ".icon-list-ol")
	WebElement purchaseHistory;
	
	@FindBy(xpath="//*[@id=\"order-list\"]/tbody/tr[1]/td[3]")
	WebElement orderTotalAmount;

	public WomenDressPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goToTshirts() {
		A = new Actions(driver);
		A.moveToElement(women).build().perform();
		A.moveToElement(Tshirts).click().build().perform();
	}

	public void clickQuickView() {

		quickView.click();

	}

	public void addquantity(String quantity) throws InterruptedException {
		driver.switchTo().frame(0);

		Thread.sleep(5000);
		addquantity.clear();
		addquantity.sendKeys(quantity);
	}

	public void addcart() {
		addtocart.click();
	}

	public void proceedToCheckout() {
		checkout.click();
	}

	public void proceedToSummaryPage() {
		summaryPage.click();
	}

	public void proceedToAddressPage() {
		addressPage.click();
	}

	public void termsCondion() {
		termsconditions.click();
	}

	public void proceedToShipingPage() {
		shipingPage.click();
	}

	public void bankPayment() {
		bankPayment.click();
	}

	public void confirmOrder() {
		confirmOrder.click();
	}

	public void account() {
		account.click();
	}

	public void purchaseHistory() {
		purchaseHistory.click();
	}
	public void Orderfianlamount()
	{
		String A =orderTotalAmount.getText();
		System.out.println(A);
		
	}
}
