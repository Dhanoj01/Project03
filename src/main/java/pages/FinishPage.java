package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class FinishPage {

	WebDriver driver;
	
	public FinishPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="finish")
	WebElement finishBtn;
	
	@FindBy(className = "complete-header")
	WebElement successMsg;
	
	
	
	public void finishClick() {
		
		finishBtn.click();
 
	}
	
	public String getSuccessMessage()
	{
		return successMsg.getText();
	}
	
	
}
