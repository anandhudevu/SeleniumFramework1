package com.pack;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;

public class HomeTest extends BaseTest {

	@Test(priority = 0)
	public void Filterbutton() throws InterruptedException, IOException, ParseException {
		 
			
			login.enterusrnm();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			login.enterpswrd();
			Thread.sleep(7000);
			//home
			login.LoginClick();
			Thread.sleep(4000);
			Assert.assertEquals(home.Createbuttondisplay(), true);
			
	}
	@Test(priority = 1)
	public void Createproject() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		
		
		login.enterusrnm();
		login.enterpswrd();
		Thread.sleep(7000);
		login.LoginClick();
		Thread.sleep(4000);
		home.createproject();
		home.enterprojectName("project1");
		home.projectcreatebutton();
		
	}

}
