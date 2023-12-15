package com.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class LoginTests extends BaseTest{
	
	@Test(priority = 0)
	public void LoginButton() {
		 
		
		Assert.assertEquals(login.verifybutton(), true);
		
		
	}
@Test(priority = 1)
	public void ErrorMessage()  {
		 
		login.LoginClick();
		Assert.assertEquals(login.verifyMessage(), "Email is required");
		
}
}