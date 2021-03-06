package com.mobizio.pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.mobizio.constant.GlobalConstant.FileNames;
import com.mobizio.datamodel.GroupModel;
import com.mobizio.datamodel.SectionModel;
import com.mobizio.datamodel.UserModel;
import com.mobizio.selenium.framework.BasePage;
import com.mobizio.selenium.framework.BasePage;


public class SubscriptionPage extends BasePage{

	public SubscriptionPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@id='table_service_user_filter']/label/input")
	private WebElement search;
	
	@FindBy(xpath="//span[contains(text(),'Subscriptions')]")
	private WebElement subscription;
	
	@FindBy(xpath="//table[@id='table_service_user']//a[@class='subscribe-user']")
	private WebElement subscribe;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	private WebElement okButton;
	
	/*
	 * search user for subscription
	 */
	public void searchUser(UserModel userModel)
	{
		_waitForJStoLoad();
		clickOn(search);
		inputText(search, userModel.getUserName());
		search.sendKeys(Keys.ENTER);
	}
	
	/*
	 * verify subscription page
	 */
	public void verifySubscriptionPage()
	{
		_waitForJStoLoad();
		String subscriptionPageText=subscription.getText();
		Assert.assertEquals(FileNames.Subscriptions.toString(), subscriptionPageText);
	}
	
	/*
	 * click on subscribe
	 */
	public void clickOnSubscribe()
	{
		waitForElement(subscribe);
		clickOn(subscribe);
		_waitForJStoLoad();
		clickOn(okButton);
	}
}
