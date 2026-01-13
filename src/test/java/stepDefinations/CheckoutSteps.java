package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.CheckoutPage;
import pages.FinishPage;
import pages.LoginPage;
import pages.ProductPage;

public class CheckoutSteps {

	WebDriver driver;
	
	LoginPage login;
	ProductPage product;
	CartPage cart;
	CheckoutPage checkout;
	FinishPage finish;
	
	
	public CheckoutSteps()
	{
		this.driver = Hooks.driver;
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    
       driver.get("https://www.saucedemo.com/");
       login = new LoginPage(driver);
       
	}

	@When("user logs in")
	public void user_logs_in(){
	    
		login.loginWithCred("standard_user", "secret_sauce");
	    login.clickLoginButton();
	}

	@When("user adds two products")
	public void user_adds_two_products(){
	   
		product = new ProductPage(driver);
		
		product.addItem();
		product.goToCart();
	}

	@When("user proceeds to checkout")
	public void user_proceeds_to_checkout(){
	    
		cart = new CartPage(driver);
		
		cart.checkOutClick();
	}

	@When("user enters details")
	public void user_enters_details(){
	    
		checkout = new CheckoutPage(driver);
		
		checkout.enterDetails("Dhanoj", "Singh", "802206");
	}

	@Then("order completes successfully")
	public void order_completes_successfully(){
	   
		finish = new FinishPage(driver);
		
		finish.finishClick();
		
		String actualText = "Thank you for your order!";
		
		Assert.assertEquals(actualText, finish.getSuccessMessage());
		
	}

}
