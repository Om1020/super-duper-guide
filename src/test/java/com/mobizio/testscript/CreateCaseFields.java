package com.mobizio.testscript;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.mobizio.constant.GlobalConstant.FileNames;
import com.mobizio.datamodel.CaseFieldModel;
import com.mobizio.datamodel.SectionModel;
import com.mobizio.datamodel.ServiceModel;
import com.mobizio.datamodel.UserModel;
import com.mobizio.dataproviders.DataProviders;
import com.mobizio.selenium.framework.BaseTest;
import com.mobizio.selenium.framework.Configuration;
import com.mobizio.selenium.framework.Utilities;

public class CreateCaseFields extends BaseTest{

	@Factory(dataProvider = "Config", dataProviderClass=DataProviders.class)
	public CreateCaseFields(String browser) {
		super(browser);
	}
	
	ServiceModel serviceModel;
	CaseFieldModel caseFieldModel;
	
	@BeforeMethod
	public void initiData() throws Exception{		
		Configuration servicePropertyReader = new Configuration(FileNames.ServiceProperties.toString());
		Configuration sectionPropertyReader = new Configuration(FileNames.SectionProperties.toString());
		serviceModel= new ServiceModel();
		caseFieldModel=new CaseFieldModel();
		
		serviceModel.setServiceName(servicePropertyReader.readApplicationData("serviceName"));
		
	}
	
	@Test (description = "create new case field")
	public void createNewCaseFields()throws Exception
	{
		reportLog("Login with user name "+userName+" and password " +password);
		dashBoardPage = loginPage.login(userName, password);
		
		reportLog("verify user login succesfully");
		dashBoardPage.verifyLoginSuccess();
		
		reportLog("Click on Hamburger Menu");
		dashBoardPage.clickOnHamburgerIcon();
		
		reportLog("Click on Configuration");
		dashBoardPage.clickOnConfiguration();
		
		reportLog("Click on services");
		servicePage=dashBoardPage.clickOnServices();
		
		reportLog("Click on service name");
		servicePage.clickOnServiceName(serviceModel);
		
		reportLog("Click on case fields");
		caseFieldPage=servicePage.clickOnFields();
		
		reportLog("Click on new field button");
		caseFieldPage.clickOnNewFieldButton();
		
		reportLog("verify new field type pop-up");
		caseFieldPage.verifyNewFieldTypePopUp();
		
		caseFieldPage.createCasefield(caseFieldModel);
	}

}
