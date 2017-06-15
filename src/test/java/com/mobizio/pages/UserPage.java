package com.mobizio.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.mobizio.constant.GlobalConstant.FileNames;
import com.mobizio.datamodel.UserModel;
import com.mobizio.selenium.framework.BasePage;

public class UserPage extends BasePage{

	public UserPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//li[contains(text(),'Users')]")
	private WebElement users;
	
	@FindBy(xpath = "//a[@id='addNewUserBtn']/span")
	private WebElement newUserButton;
	
	@FindBy(xpath = "//li[contains(text(),'New User')]")
	private WebElement newUser;
	
	@FindBy(xpath = "//input[@id='usernameValueInput']")
	private WebElement enterUserName;
	
	@FindBy(xpath = "//input[@id='emailValueInput']")
	private WebElement enterEmailId;
	
	@FindBy(xpath = "//input[@id='passwordValueInput']")
	private WebElement enterPassword;

	@FindBy(xpath = "//input[@id='confirmPasswordValueInput']")
	private WebElement enterConfirmPassword;

	@FindBy(xpath = "//input[@id='firstNameValueInput']")
	private WebElement enterFirstName;

	@FindBy(xpath = "//input[@id='lastNameValueInput']")
	private WebElement enterLastName;
	
	@FindBy(xpath = "//select[@id='roleValueInput']")
	private WebElement userType;
	
	@FindBy(xpath = "//input[@id='tenantCarerIdValueInput']")
	private WebElement tenantUserId;
	
	@FindBy(xpath = "//div[contains(@id,'branchNameInput')]")
	private WebElement searchSelectTextBox;
	
	@FindBy(xpath = "//input[@id='s2id_autogen2_search']")
	private WebElement branchName;
	
	@FindBy(xpath = "//input[contains(@aria-activedescendant,'select2-result')]")
	private WebElement waitForSearchSelectTextBox;
	
	@FindBy(xpath = "//button[@id='btnSave']")
	private WebElement createButton;
	
	@FindBy(xpath = "//table[@id='user-table']/tbody/tr[1]//a")
	private WebElement newlyCreatedUser;
	
	@FindBy(xpath = "//input[@id='dobValueInput']")
	private WebElement dob;
	
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


	/*
	 * Verify User Page
	 */
	public void verifyUserPage() {
		_waitForJStoLoad();
		waitForElement(users);
		String customerPageText = users.getText();
		Assert.assertEquals("Users", customerPageText);
	}

	
	/*
	 * Click on new user button
	 */
	public void clickOnNewUserButton()
	{
		waitForElement(newUserButton);
		clickOn(newUserButton);
	}
	
	/*
	 * Verify New User Page
	 */
	public void verifyNewUserPage() {
		_waitForJStoLoad();
		waitForElement(newUser);
		String userPageText = newUser.getText();
		Assert.assertEquals(FileNames.NewUser.toString(), userPageText);
	}
	
	
	/*
	 * click on create button
	 */
	public void clickOnCreateButton()
	{
		waitForElement(createButton);
		clickOn(createButton);
	}
	
	
	/*
	 * verifyCreatedUserOnUserPage
	 */
	public void verifyCreatedUserOnUserPage(String expectedUserName)
	{
		String UserName= newlyCreatedUser.getText();
		Assert.assertEquals(UserName, expectedUserName);
	}
	
	
	
	/*
	 * enter user details on create new user page
	 */
	public void enterNewUserDetails(UserModel userModel)
			throws InterruptedException {

		waitForElement(enterUserName);
		clickOn(enterUserName);
		inputText(enterUserName, userModel.getUserName());

		waitForElement(enterEmailId);
		clickOn(enterEmailId);
		inputText(enterEmailId, userModel.getEmail());

		waitForElement(enterPassword);
		clickOn(enterPassword);
		inputText(enterPassword, userModel.getPassword());

		waitForElement(enterConfirmPassword);
		clickOn(enterConfirmPassword);
		inputText(enterConfirmPassword, userModel.getConfirmPassword());

		waitForElement(enterFirstName);
		clickOn(enterFirstName);
		inputText(enterFirstName, userModel.getFirstName());

		waitForElement(enterLastName);
		clickOn(enterLastName);
		inputText(enterLastName, userModel.getLastName());
		
		waitForElement(userType);
		selectDropDownByText(userType,userModel.getUserType());
		
		waitForElement(tenantUserId);
		clickOn(tenantUserId);
		inputText(tenantUserId, userModel.getTenantUserId());
		
		clickOn(searchSelectTextBox);
		inputText(branchName, userModel.getBranch());
		waitForElement(waitForSearchSelectTextBox);
		branchName.sendKeys(Keys.ENTER);
		
		if (userModel.getDob() != null) {
			waitForElement(dob);
			clickOn(dob);
			inputText(dob, userModel.getDob());
		}

		if (userModel.getTitle() != null) {
			waitForElement(title);
			selectDropDownByValue(title, userModel.getTitle());
		}

		if (userModel.getGender() != null) {
			waitForElement(gender);
			selectDropDownByValue(gender, userModel.getGender());
		}

		if (userModel.getAddressLine1() != null) {
			waitForElement(addressLine1);
			clickOn(addressLine1);
			inputText(addressLine1, userModel.getAddressLine1());
		}

		if (userModel.getAddressLine2() != null) {
			waitForElement(addressLine2);
			clickOn(addressLine2);
			inputText(addressLine2, userModel.getAddressLine2());
		}

		if (userModel.getCity() != null) {
			waitForElement(city);
			clickOn(city);
			inputText(city, userModel.getCity());
		}

		if (userModel.getCounty() != null) {
			waitForElement(county);
			clickOn(county);
			inputText(county, userModel.getCounty());
		}

		if (userModel.getPostCode() != null) {
			waitForElement(postcode);
			clickOn(postcode);
			inputText(postcode, userModel.getPostCode());
		}

		if (userModel.getCountry() != null) {
			waitForElement(country);
			selectDropDownByValue(country, userModel.getCountry());
		}

		if (userModel.getLatitude() != null) {
			waitForElement(latitude);
			clickOn(latitude);
			inputText(latitude, userModel.getLatitude());
		}

		if (userModel.getLongitude() != null) {
			waitForElement(longitude);
			clickOn(longitude);
			inputText(longitude, userModel.getLongitude());
		}

		if (userModel.getPrimaryTelephone() != null) {
			waitForElement(primaryTelephone);
			clickOn(primaryTelephone);
			inputText(primaryTelephone,userModel.getPrimaryTelephone());
		}

		if (userModel.getSecondaryTelephone() != null) {
			waitForElement(secondaryTelephone);
			clickOn(secondaryTelephone);
			inputText(secondaryTelephone,userModel.getSecondaryTelephone());
		}
		
		
	}
}
