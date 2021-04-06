package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException {
		driver.get(baseURL);
		logger.info("open URL");

		LoginPage lp = new LoginPage(driver);
		lp.UserName(username);
		logger.info("Enter UserName");
		lp.Password(password);
		logger.info("Enter Password");
		lp.clicksubmit();
		logger.info("Click Button");
		if (driver.getTitle().equals("Guru99 Bank Manager Homepage")) {
			Assert.assertTrue(true);
			logger.info("Login Test Pass");
		} else {
			Screenshot(driver,"loginTest");
			Assert.assertFalse(false);
			logger.info("Login Test Fail");
		}
	}

}
