package com.maven1.com.demo;

import org.testng.annotations.Test;

public class DownloadPageTest extends TestBase2 {

	@Test(priority=1)
	public void LinksVerify(){
		dwld=dp.clickDwnldButton();
		dwld.verifyLink();
	}
	
	@Test(priority=2)
public void clickJavaLink() {
		dwld=dp.clickDwnldButton();
		dwld.clickJavaLink();
	}
}
