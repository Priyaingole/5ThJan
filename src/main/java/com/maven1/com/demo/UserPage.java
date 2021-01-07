package com.maven1.com.demo;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class UserPage extends TestBase2 {
	
	int i=0; int j=0;
	public UserPage(WebDriver driver) {
		UserPage.driver=driver;	
		PageFactory.initElements(driver,this); 
		}
	
	@FindBy(xpath="//span[text()='Delete']")
	private WebElement UserDeleteBtn;
	
	@FindBy(tagName="td")
	private List<WebElement> tblData;
	
	public void ClickDeleteBtn() throws Exception {
		System.out.println("Deleting user");
		UserDeleteBtn.click();
		
		Alert al=driver.switchTo().alert();
		Thread.sleep(3000);
		al.accept();
		System.out.println("Tried  delete operation");
		
	}
	}
	


