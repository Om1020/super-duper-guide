package com.mobizio.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.mobizio.constant.GlobalConstant.FileNames;
import com.mobizio.datamodel.CustomerModel;
import com.mobizio.selenium.framework.BasePage;

public class CustomerPage extends BasePage {

	@FindBy(xpath = "//li[contains(text(),'Customers')]")
	private WebElement customerPage;

	@FindBy(xpath = "//a[@id='addNewCustomerBtn']/span")
	private WebElement newCustomerButton;

	@FindBy(xpath = "//li[contains(text(),'New Customer')]")
	private WebElement newCustomerPage;

	@FindBy(xpath = "//input[@id='usernameValueInput']")
	private WebElement userName;

	@FindBy(xpath = "//input[@id='emailValueInput']")
	private WebElement emailId;

	@FindBy(xpath = "//input[@id='passwordValueInput']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='confirmPasswordValueInput']")
	private WebElement confirmPassword;

	@FindBy(xpath = "//input[@id='firstNameValueInput']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='lastNameValueInput']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='tenantCustomerIdValueInput']")
	private WebElement customerId;

	@FindBy(xpath = "//div[contains(@id,'branchNameInput')]")
	private WebElement searchSelectTextBox;

	@FindBy(xpath = "//input[@id='s2id_autogen2_search']")
	private WebElement branchName;

	@FindBy(xpath = "//button[@id='btnSave']")
	private WebElement createButton;

	@FindBy(xpath = "//span[@class='select2-match']")
	private WebElement selectValueFromBranchDropdown;

	@FindBy(xpath = "//table[@id='user-table']/tbody/tr[1]//a")
	private WebElement newCustomer;

	@FindBy(xpath = "//select[@id='titleValueInput']")
	private WebElement title;

	@FindBy(xpath = "//select[@id='genderValueInput']")
	private WebElement gender;

	@FindBy(xpath = "//input[@id='firstLineValueInput']")
	private WebElement addressLine1;

	@FindBy(xpath = "//input[@id='secondLineValueInput']")
	private WebElement addressLine2;

	@FindBy(xpath = "//input[@id='cityValueInput']")
	private WebElement city;

	@FindBy(xpath = "//input[@id='stateValueInput']")
	private WebElement county;

	@FindBy(xpath = "//input[@id='postcodeValueInput']")
	private WebElement postcode;

	@FindBy(xpath = "//select[@id='countryValueInput']")
	private WebElement country;

	@FindBy(xpath = "//input[@id='latitudeValueInput']")
	private WebElement latitude;

	@FindBy(xpath = "//input[@id='longitudeValueInput']")
	private WebElement longitude;

	@FindBy(xpath = "//input[@id='primaryTelephoneValueInput']")
	private WebElement primaryTelephone;

	@FindBy(xpath = "//input[@id='secondaryTelephoneValueInput']")
	private WebElement secondaryTelephone;

	@FindBy(xpath = "//input[@id='nicknameValueInput']")
	private WebElement likesToBeCalled;

	@FindBy(xpath = "//input[@id='nfcTagIdValueInput']")
	private WebElement nfcTagContent;

	@FindBy(xpath = "//input[@id='dobValueInput']")
	private WebElement dob;
	
	@FindBy(xpath = "//input[contains(@aria-activedescendant,'select2-result')]")
	private WebElement waitForSearchSelectTextBox;

	public CustomerPage(WebDriver driver) {
		super(driver);
	}

	/*
	 * Verify Customer Page
	 */
	public void verifyCustomerPage() {
		_waitForJStoLoad();
		waitForElement(customerPage);
		String customerPageText = customerPage.getText();
		Assert.assertEquals(FileNames.Customers.toString(), customerPageText);
	}

	/*
	 * Verify New Customer Page
	 */
	public void verifyNewCustomerPage() {
		_waitForJStoLoad();
		waitForElement(newCustomerPage);
		String customerPageText = newCustomerPage.getText();
		Assert.assertEquals(FileNames.NewCustomer.toString(), customerPageText);
	}

	/*
	 * click on add new customer button
	 */
	public void clickOnAddNewCustomer() {
		waitForElement(newCustomerButton);
		clickOn(newCustomerButton);
	}

	/*
	 * click on create button on create new customer page
	 */
	public void clickOnCreateButton() {
		waitForElement(createButton);
		clickOn(createButton);
	}

	/*
	 * enter customer details on create new customer page
	 */
	public void enterNewCustomerDetails(CustomerModel customerModel)
			throws InterruptedException {

		waitForElement(userName);
		clickOn(userName);
		inputText(userName, customerModel.getUserName());

		waitForElement(emailId);
		clickOn(emailId);
		inputText(emailId, customerModel.getEmail());

		waitForElement(password);
		clickOn(password);
		inputText(password, customerModel.getPassword());

		waitForElement(confirmPassword);
		clickOn(confirmPassword);
		inputText(confirmPassword, customerModel.getConfirmPassword());

		waitForElement(firstName);
		clickOn(firstName);
		inputText(firstName, customerModel.getFirstName());

		waitForElement(lastName);
		clickOn(lastName);
		inputText(lastName, customerModel.getLastName());

		if (customerModel.getDob() != null) {
			waitForElement(dob);
			clickOn(dob);
			inputText(dob, customerModel.getDob());
		}

		if (customerModel.getTitle() != null) {
			waitForElement(title);
			selectDropDownByValue(title, customerModel.getTitle());
		}

		if (customerModel.getGender() != null) {
			waitForElement(gender);
			selectDropDownByValue(gender, customerModel.getGender());
		}

		if (customerModel.getAddressLine1() != null) {
			waitForElement(addressLine1);
			clickOn(addressLine1);
			inputText(addressLine1, customerModel.getAddressLine1());
		}

		if (customerModel.getAddressLine2() != null) {
			waitForElement(addressLine2);
			clickOn(addressLine2);
			inputText(addressLine2, customerModel.getAddressLine2());
		}

		if (customerModel.getCity() != null) {
			waitForElement(city);
			clickOn(city);
			inputText(city, customerModel.getCity());
		}

		if (customerModel.getCounty() != null) {
			waitForElement(county);
			clickOn(county);
			inputText(county, customerModel.getCounty());
		}

		if (customerModel.getPostCode() != null) {
			waitForElement(postcode);
			clickOn(postcode);
			inputText(postcode, customerModel.getPostCode());
		}

		if (customerModel.getCountry() != null) {
			waitForElement(country);
			selectDropDownByValue(country, customerModel.getCountry());
		}

		if (customerModel.getLatitude() != null) {
			waitForElement(latitude);
			clickOn(latitude);
			inputText(latitude, customerModel.getLatitude());
		}

		if (customerModel.getLongitude() != null) {
			waitForElement(longitude);
			clickOn(longitude);
			inputText(longitude, customerModel.getLongitude());
		}

		if (customerModel.getPrimaryTelephone() != null) {
			waitForElement(primaryTelephone);
			clickOn(primaryTelephone);
			inputText(primaryTelephone,customerModel.getPrimaryTelephone());
		}

		if (customerModel.getSecondaryTelephone() != null) {
			waitForElement(secondaryTelephone);
			clickOn(secondaryTelephone);
			inputText(secondaryTelephone,customerModel.getSecondaryTelephone());
		}

		if (customerModel.getLikesToBeCalled() != null) {
			waitForElement(likesToBeCalled);
			clickOn(likesToBeCalled);
			inputText(likesToBeCalled, customerModel.getLikesToBeCalled());
		}

		if (customerModel.getNfcTagContent() != null) {
			waitForElement(nfcTagContent);
			clickOn(nfcTagContent);
			inputText(nfcTagContent, customerModel.getNfcTagContent());
		}

		waitForElement(searchSelectTextBox);
		clickOn(searchSelectTextBox);
		inputText(branchName, customerModel.getBranch());
		waitForElement(waitForSearchSelectTextBox);
		branchName.sendKeys(Keys.ENTER);

		waitForElement(customerId);
		clickOn(customerId);
		inputText(customerId, customerModel.getCustomerId());

	}

	/*
	 * verify newly created customer on customer page
	 */
	public void verifyCreatedCustomerOnCustomerPage(String expectedCustomerName) {
		String customerName = newCustomer.getText();
		Assert.assertEquals(customerName, expectedCustomerName);
	}

}
