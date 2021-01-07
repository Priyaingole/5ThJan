package com.maven1.com.demo;

import org.testng.annotations.Test;

public class UserPageTest extends TestBase2 {
	
	
	
		@Test(priority=1)
		public void verifyDeleteButton() throws Exception {
		usr=dp.clickUserButton();
		usr.ClickDeleteBtn();


	}
	
}
