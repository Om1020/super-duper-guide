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
import com.mobizio.datamodel.ServiceModel;
import com.mobizio.selenium.framework.BasePage;
import com.mobizio.selenium.framework.BasePage;

public class ServicePage extends BasePage  {

	public ServicePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//table[@id='servicesTable']/tbody/tr")
	private List<WebElement> serviceName;
	
	@FindBy(xpath="//div[@id='servicesTable_paginate']/ul/li")
	private List<WebElement> totalPage;
	
	@FindBy(xpath="//li[@class='next']/a")
	private WebElement nextPage;
	
	@FindBy(xpath="//a[@id='serviceDataGroupsBtn']")
	private WebElement sections;
	
	@FindBy(xpath="//a[@id='serviceFieldsBtn']")
	private WebElement field;
	
	@FindBy(xpath="//a[@id='serviceUsersBtn']")
	private WebElement subscriptions;
	
	/*
	 * click on services name
	 */
	public void clickOnServiceName(ServiceModel serviceModel)
	{
		_waitForJStoLoad();
		int pageCount=totalPage.size()-2;
		boolean status=false;
		int currentPageNumber=1;
		for (int j=1;j<=pageCount;j++)
		{
			int count=serviceName.size();
			for(int i=1;i<=count;i++)
			{
				WebElement serviceName=getDriver().findElement(By.xpath("//table[@id='servicesTable']/tbody/tr["+i+"]/td[1]//span"));
				String sName=serviceName.getText();
				if(sName.equals(serviceModel.getServiceName()))
				{
					clickOn(serviceName);
					status=true;
					break;
				}
			}
			
			if(status)
			{
				break;
			}
			
			if(currentPageNumber<pageCount)
			{
				clickOn(nextPage);
				currentPageNumber++;
			}
			
			else if(currentPageNumber==pageCount)
			continue;
			
			else
				break;
		
		}
	}
	
	/*
	 * click on fields
	 */
	public CaseFieldPage clickOnFields()
	{
		_waitForJStoLoad();
		clickOn(field);
		return PageFactory.initElements(getDriver(), CaseFieldPage.class);
	}
	
	/*
	 * click on sections
	 */
	public SectionPage clickOnSections()
	{
		_waitForJStoLoad();
		clickOn(sections);
		return PageFactory.initElements(getDriver(), SectionPage.class);
	}
	
	/*
	 * click on subscription
	 */
	public SubscriptionPage clickOnSubscriptions()
	{
		_waitForJStoLoad();
		clickOn(subscriptions);
		return PageFactory.initElements(getDriver(), SubscriptionPage.class);
	}
	

}
