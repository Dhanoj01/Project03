package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id ="first-name")
	WebElement firstName;
	
	@FindBy(id ="last-name")
	WebElement lastName;
	
	@FindBy(id ="postal-code")
	WebElement pinCode;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	public void enterDetails(String fname , String lname , String pin)
	{
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		pinCode.sendKeys(pin);
		
		continueBtn.click();
	}
	
}
