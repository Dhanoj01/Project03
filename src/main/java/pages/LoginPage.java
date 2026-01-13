package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

     WebDriver driver;
     
     public LoginPage(WebDriver ldriver)
     {
    	 this.driver = ldriver;
    	 PageFactory.initElements(driver, this);
     }
     
     
     @FindBy(id = "user-name")
     WebElement userId;
     
     
     @FindBy(id = "password")
     WebElement password;
     
     
     @FindBy(id = "login-button")
     WebElement loginBtn;
     
     public void loginWithCred(String id , String pass)
     {
    	 userId.sendKeys(id);
    	 password.sendKeys(pass);
     }
     
     public void clickLoginButton()
     {
    	 loginBtn.click();
    	 
     }
     
}
