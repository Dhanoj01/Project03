package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	WebDriver driver;
	
	public ProductPage(WebDriver ldriver)
	{
		this.driver = ldriver;
		PageFactory.initElements(driver , this);
	}
	
	//add two product to cart
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement product01;
	
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	WebElement product02;
	
	@FindBy(className="shopping_cart_link")
	WebElement cartBtn;
	
	public void addItem()
	{
		product01.click();
		product02.click();
	}
	
	public void goToCart()
	{
		cartBtn.click();
	}
}
