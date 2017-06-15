package com.mobizio.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.mobizio.selenium.framework.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "txtUserName")
	private WebElement userNameFiled;

	@FindBy(id = "txtPassword")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//div[@id='login-reset-password']/a")
	private WebElement forgotPasswordLink;

	@FindBy(xpath = "//div[@class='alert-message alert-message-danger']")
	private WebElement failedLoginMessage;

	public DashboardPage login(String userName, String password) {
		_waitForJStoLoad();
		inputText(userNameFiled, userName);
		inputText(passwordField, password);
		clickOn(loginButton);
		return PageFactory.initElements(getDriver(), DashboardPage.class);
	}
	
	public LoginPage verifyLoginPage(){
		waitForElement(userNameFiled);
		Assert.assertTrue(isElementPresent(userNameFiled), "User is not panding on login page");
		Assert.assertTrue(isElementPresent(loginButton), "User is not panding on login page");
		Assert.assertTrue(isElementPresent(passwordField), "User is not panding on login page");
		return this;
	}
}
