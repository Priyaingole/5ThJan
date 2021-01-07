package com.maven1.com.demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.maven1.com.demo.DashbaoardPage;
import com.maven1.com.demo.DownloadPage;
import com.maven1.com.demo.LoginPage;
import com.maven1.com.demo.UserPage;

public class TestBase2 {
	
	public static WebDriver driver;
	public static LoginPage lp=null;
	public static DashbaoardPage dp=null;
	public static DownloadPage dwld=null;
	public static UserPage usr=null;
	
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("file:///F:/seleniumm/Offlinewebsite/index.html");


	}


}
