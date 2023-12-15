package com.pack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.config.Base;
import com.pages.HomePage;
import com.pages.LoginPage;

public class BaseTest extends Base {
//	WebDriver driver;
	
	LoginPage login;
	HomePage home;
	
	@BeforeMethod
	public void setUp() throws IOException {
//		driver =  new ChromeDriver();
//		driver.get("https://demo1.dev.contentpro.ai/login");
		instalisation();
		 login = new LoginPage(driver);
		 home = new HomePage(driver);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}


}
