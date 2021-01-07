package com.maven1.com.demo;

import org.testng.annotations.Test;

public class DashboardPageTest extends TestBase2{


	@Test(priority=1)
	public void verifyCourses() {

		dp.verifycouuses();
		
	}
	@Test(priority=2)
	public void Userslink() throws Exception {
		System.out.println("user Test");
		 usr =dp.clickUserButton();
	}

	
	@Test(priority=3)
	public void verifyDownloadLink() {
		
		dwld=dp.clickDwnldButton();
	}


}
