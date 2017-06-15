package com.mobizio.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import com.mobizio.datamodel.BranchModel;
import com.mobizio.selenium.framework.BasePage;

public class BranchPage extends BasePage {

	@FindBy(xpath = "//*[@id='addNewBranchBtn']/span")
	private WebElement newBranch;
	
	@FindBy(xpath = "//*[@id='nameValueInput']")
	private WebElement name;
	
	@FindBy(xpath = "//*[@id='tenantBranchIdValueInput']")
	private WebElement tenantBranchID;
	
	@FindBy(xpath = "//*[@id='primaryTelephoneValueInput']")
	private WebElement primaryTelephone;
	
	@FindBy(xpath = "//*[@id='secondaryTelephoneValueInput']")
	private WebElement secondaryTelephone;
	
	@FindBy(xpath = "//*[@id='firstLineValueInput']")
	private WebElement addressLine1;
	
	@FindBy(xpath = "//*[@id='secondLineValueInput']")
	private WebElement addressLine2;
	
	@FindBy(xpath = "//*[@id='cityValueInput']")
	private WebElement city;
	
	@FindBy(xpath = "//*[@id='stateValueInput']")
	private WebElement county;
	
	@FindBy(xpath = "//*[@id='countryValueInput']")
	private WebElement country;

	@FindBy(xpath = "//*[@id='postcodeValueInput']")
	private WebElement postcode;

	@FindBy(xpath = "//*[@id='faxValueInput']")
	private WebElement fax;
	
	@FindBy(xpath = "//*[@id='alertNotificationEmailsValueInput']")
	private WebElement alertNotificationEmail;
	
	@FindBy(xpath = "//*[@id='alertNotificationPhoneNumbersValueInput']")
	private WebElement alertNotificationPhoneNumber;
	
	@FindBy(xpath = "//*[@id='btnSave']")
	private WebElement bt_create;
	
	@FindBy(xpath = "//*[@id='branchesTable']/tbody/tr[1]/td[1]")
	private WebElement branchName;
	
	public BranchPage(WebDriver driver) {
		super(driver);
	}

	/*
	 * click on add new branch button
	 */
	public void clickOnNewBranch() {
		_waitForJStoLoad();
		waitForElement(newBranch);
		clickOn(newBranch);
		_waitForJStoLoad();
	}

	/*
	 * create a device with its details
	 */
	public void enterNewBranchDetail(BranchModel branchModel) {
		
		waitForElement(name);
		clickOn(name);
		inputText(name, branchModel.getName());
		
		waitForElement(tenantBranchID);
		clickOn(tenantBranchID);
		inputText(tenantBranchID, branchModel.getTenantBranchID());
		
		waitForElement(primaryTelephone);
		clickOn(primaryTelephone);
		inputText(primaryTelephone, branchModel.getPrimaryTelePhone());
		
		waitForElement(secondaryTelephone);
		clickOn(secondaryTelephone);
		inputText(secondaryTelephone, branchModel.getSecondaryTelePhone());
		
		waitForElement(addressLine1);
		clickOn(addressLine1);
		inputText(addressLine1, branchModel.getAddressLine1());
		
		waitForElement(addressLine2);
		clickOn(addressLine2);
		inputText(addressLine2, branchModel.getAddressLine2());
		
		waitForElement(city);
		clickOn(city);
		inputText(city, branchModel.getCity());
		
		waitForElement(county);
		clickOn(county);
		inputText(county, branchModel.getCounty());
		
		waitForElement(country);
		clickOn(country);
		inputText(country, branchModel.getCountry());
		
		waitForElement(postcode);
		clickOn(postcode);
		inputText(postcode, branchModel.getPostcode());
		
		waitForElement(fax);
		clickOn(fax);
		inputText(fax, branchModel.getFax());
		
		waitForElement(alertNotificationEmail);
		clickOn(alertNotificationEmail);
		inputText(alertNotificationEmail, branchModel.getAlertNotificationEmail());
		
		waitForElement(alertNotificationPhoneNumber);
		clickOn(alertNotificationPhoneNumber);
		inputText(alertNotificationPhoneNumber, branchModel.getAlertNotificationPhoneNumber());
		
		waitForElement(bt_create);
		clickOn(bt_create);
		_waitForJStoLoad();
	}
	
	/*
	 * verify newly created customer on customer page
	 */
	public void verifyCreatedBranchOnBranchPage(String expectedBranchName) {
		String branch = branchName.getText();
		Assert.assertEquals(branch, expectedBranchName);
	}
	
}
