package com.mobizio.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.mobizio.selenium.framework.BasePage;

public class ConfigurationPage extends BasePage {

	public ConfigurationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath= "//span[contains(text(),'Users')]")
	private WebElement users;
	
	public void clickOnUsers()
	{
		waitForElement(users);
		clickOn(users);
	}

}
