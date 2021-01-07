package com.maven1.com.demo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashbaoardPage extends TestBase2 {
	
	public DashbaoardPage(WebDriver driver) {
		DashbaoardPage.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="	//span[contains(text(),'Downloads')]")
	private WebElement downloadLink;
	
	@FindBy(xpath="	//span[contains(text(),'Users')]") 
	private WebElement Users;

	@FindBy(xpath="//h1")
	private WebElement pageheader ;
	
	@FindBy(xpath="//h3")
	private List<WebElement> courses;
	
	public void verifycouuses() {
		for(WebElement cr :courses) {
			cr.isDisplayed();}	
	}

	public UserPage clickUserButton() {
		
		Users.click();
		return new UserPage(driver);
	}
public DownloadPage clickDwnldButton() {
		
		downloadLink.click();
		return new DownloadPage(driver);
	}
	
}	
