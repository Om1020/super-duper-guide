package com.mobizio.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.mobizio.constant.GlobalConstant.FileNames;
import com.mobizio.datamodel.CaseFieldModel;
import com.mobizio.datamodel.CustomerModel;
import com.mobizio.selenium.framework.BasePage;

public class CaseFieldPage extends BasePage {

	public CaseFieldPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@id='addNewServiceFieldBtn']")
	private WebElement newFieldButton;
	
	@FindBy(xpath="//h4[@class='modal-title']")
	private WebElement fieldTypeHeading;
	
	@FindBy(xpath="//div[@class='form-group']/label[text()='SINGLE LINE TEXT']")
	private WebElement singleLineText;
	
	@FindBy(xpath="//div[@class='form-group']/label[text()='DATE']")
	private WebElement date;
	
	@FindBy(xpath="//div[@class='form-group']/label[text()='PARAGRAPH TEXT']")
	private WebElement paragraphText;
	
	@FindBy(xpath="//div[@class='form-group']/label[text()='CHECKBOXES']")
	private WebElement checkBoxes;
	
	@FindBy(xpath="//div[@class='form-group']/label[text()='NUMBER']")
	private WebElement number;
	
	@FindBy(xpath="//div[@class='form-group']/label[text()='DROPDOWN LIST']")
	private WebElement dropDownList;
	
	@FindBy(xpath="//div[@class='form-group']/label[text()='TIME']")
	private WebElement time;
	
	@FindBy(xpath="//div[@class='form-group']/label[text()='RADIO BUTTON']")
	private WebElement radioButton;
	
	@FindBy(xpath="//div[@class='form-group']/label[text()='DECIMAL']")
	private WebElement decimal;
	
	@FindBy(xpath="//div[@class='form-group']/label[text()='USER PICKER']")
	private WebElement userPicker;
	
	@FindBy(xpath="//input[@id='fieldLabelInput']")
	private WebElement label;
	
	
	
	/*
	 * click on new field button
	 */
	public void clickOnNewFieldButton()
	{
		_waitForJStoLoad();
		clickOn(newFieldButton);
	}
	
	/*
	 * verify new field type pop-up
	 */
	public void verifyNewFieldTypePopUp() throws InterruptedException
	{
		waitForWebElementPresent(fieldTypeHeading);
		String fieldTypeText=fieldTypeHeading.getText();
		Assert.assertEquals(fieldTypeText, fieldTypeText);
		
	}
	

	
	/*
	 * create case field
	 */
	public void createCasefield(CaseFieldModel caseFieldModel)
	{
		//if(caseFieldModel.getSingleLineText() != null)
		//{
			waitForElement(singleLineText);
			clickOn(singleLineText);
			enterDetailsIntoCaseFields(label,"Single line text");
		//}
	}

}
