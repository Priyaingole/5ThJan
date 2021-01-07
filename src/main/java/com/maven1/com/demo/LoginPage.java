package com.maven1.com.demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage extends TestBase2 {

	
	
	public LoginPage(WebDriver driver){
		 LoginPage.driver=driver;
		 PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(xpath="//button")
	private WebElement loginButton;
	
	public void enterUserName(String text) {
		
		uname.sendKeys(text);
	}
	public void enterPassword(String text) {
		
		pass.sendKeys(text);
	}
	public void clickLoginButton() {
		
		loginButton.click();
	}
	
public DashbaoardPage validLogin() {
	enterUserName("kiran@gmail.com");
	enterPassword("123456");
	clickLoginButton();
	return new DashbaoardPage( driver);
}	
	
	
	
	
}
