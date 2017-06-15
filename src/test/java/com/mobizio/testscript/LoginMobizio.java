package com.mobizio.testscript;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.mobizio.dataproviders.DataProviders;
import com.mobizio.selenium.framework.BaseTest;

public class LoginMobizio extends BaseTest {
	
	@Factory(dataProvider = "Config", dataProviderClass=DataProviders.class)
	public LoginMobizio(String browser) {
		super(browser);
	}
	
	@Test(description = "Jira ID: 12223, Desc: Login with valid user name and password")
	public void VerifyLoginSuccess() throws Exception {
		
		reportLog("Login with user name "+userName+" and password " +password);
		dashBoardPage = loginPage.login(userName, password);

		reportLog("verify user login succesfully");
		dashBoardPage.verifyLoginSuccess();
		
		reportLog("Logout from application");		
		loginPage = dashBoardPage.logOut();
		
		reportLog("verify logout successfully");
		loginPage.verifyLoginPage();
	}
}
