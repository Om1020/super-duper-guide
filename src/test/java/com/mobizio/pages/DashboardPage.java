package com.mobizio.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.mobizio.selenium.framework.BasePage;

public class DashboardPage extends BasePage {

	@FindBy(id = "usernameMenu")
	private WebElement userMenu;
	
	@FindBy(xpath = "//div[@class='navbar-header']/button")
	private WebElement HamburgerIcon;
	
	@FindBy(xpath = "//li[@id='configurationMenu']/a/span[1]")
	private WebElement configuration;
	
    @FindBy(xpath = "//*[@id='profile-picture']")
	private WebElement profilePic;

	@FindBy(xpath = "//*[@id='user-dropdown-menu']//span[text()='Log Out']")
	private WebElement logOutLink;
	
	@FindBy(xpath = "//li[@id='customersMenu']/a/span[1]")
	private WebElement customer;
	
	@FindBy(xpath = "//li[@id='usersConfigMenu']/a/span[1]")
	private WebElement user;
	
	@FindBy(xpath = "//li[@id='groupsConfigMenu']/a/span[1]")
	private WebElement groups;
	
	@FindBy(xpath = "//*[@id='devicesConfigMenu']/a/span[2]")
	private WebElement device;
	
	@FindBy(xpath = "//*[@id='branchesConfigMenu']/a/span[2]")
	private WebElement branch;
	
	@FindBy(xpath = "//li[@id='taskTypesConfigMenu']/a/span[contains(text(),'Task Types')]")
	private WebElement taskTypes;
	
	@FindBy(xpath = "//li[@id='servicesConfigMenu']/a/span[contains(text(),'Services')]")
	private WebElement services;
	

	public DashboardPage(WebDriver driver) {
		super(driver);
	}

	public DashboardPage verifyLoginSuccess() {
		_waitForJStoLoad();
		Assert.assertTrue(isElementPresent(userMenu), "User not login");
		Assert.assertTrue(isElementPresent(profilePic), "User not login");
		return this;
	}
	
	/*
	 * click On Hamburger Icon 
	 */
	public void clickOnHamburgerIcon()
	{
		waitForElement(HamburgerIcon);
	    clickOn(HamburgerIcon);
	}
	
	/*
	 * click On Configuration
	 */
	public void clickOnConfiguration()
	{
		waitForElement(configuration);
		clickOn(configuration);
	}
	
	/*
	 * click On Customer
	 */
	public CustomerPage clickOnCustomer()
	{
		waitForElement(customer);
		clickOn(customer);
		return PageFactory.initElements(getDriver(), CustomerPage.class);
	}
	
	/*
	 * click On services
	 */
	public ServicePage clickOnServices()
	{
		waitForElement(services);
		clickOn(services);
		return PageFactory.initElements(getDriver(), ServicePage.class);
	}
	
	/*
	 * click On Users
	 */
	public UserPage clickOnUsers()
	{
		waitForElement(user);
		clickOn(user);
		return PageFactory.initElements(getDriver(), UserPage.class);
	}
	
	/*
	 * click On Task Type
	 */
	public TaskTypePage clickOnTaskType()
	{
		waitForElement(taskTypes);
		clickOn(taskTypes);
		return PageFactory.initElements(getDriver(), TaskTypePage.class);
	}
	
	
	
	/*
	 * click On Groups
	 */
	public GroupPage clickOnGroups()
	{
		waitForElement(groups);
		clickOn(groups);
		return PageFactory.initElements(getDriver(), GroupPage.class);
	}
	
	/*
	 * click On Device
	 */
	public DevicePage clickOnDevice()
	{
		waitForElement(device);
		clickOn(device);
		return PageFactory.initElements(getDriver(), DevicePage.class);
	}
	
	/*
	 * click On Branches
	 */
	public BranchPage clickOnBranch()
	{
		waitForElement(branch);
		clickOn(branch);
		return PageFactory.initElements(getDriver(), BranchPage.class);
	}
	
	

	public LoginPage logOut() {
		_waitForJStoLoad();
		clickOn(userMenu);
		clickOn(logOutLink);
		return PageFactory.initElements(getDriver(), LoginPage.class);
	}

}
