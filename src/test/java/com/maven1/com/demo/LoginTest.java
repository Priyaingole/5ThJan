package com.maven1.com.demo;

import com.maven1.com.demo.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest extends TestBase2{

	@BeforeSuite
	public void setup() {
		initialization();
		lp = new LoginPage(driver);

	}

	// SDET----software developer eng. in Test
	@Test(priority=1)
	public void loginTest() {
		dp = lp.validLogin();
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");

	}

	/*@Test
	public void verifyCourses() {

		dp.verifycouuses();
	}

	@Test
	public void verifyLink() {
		dwnld=dp.clickDashButton();
		dwnld.verifyLink();

	}
*/
}

