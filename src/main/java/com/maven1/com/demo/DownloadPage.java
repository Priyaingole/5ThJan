package com.maven1.com.demo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DownloadPage extends TestBase2 {
	
	public DownloadPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		DownloadPage.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Website')]")
	private List<WebElement> links;
	
	@FindBy(xpath="//tr[2]/td[8]//span")
	private WebElement javaLink ;
	
	public void verifyLink() {
		for(WebElement linkk:links) {
		
		String linkSelected=linkk.getText();
		System.out.println(linkSelected);}
		
		}
	
	public void clickJavaLink() {
		
		javaLink.click();
	}
	}


