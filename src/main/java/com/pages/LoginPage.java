package com.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilites.Utilities;

public class LoginPage {
	WebDriver driver;
	
	By LoginButton = By.xpath("//button[@type='submit']");
	By AlertMessage = By.xpath("//div[@class='input-error-msg mb-3'][1]");
	By username = By.xpath("//input[@type='email']");
	By passwrd = By.id("password");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public boolean verifybutton() {
		//return driver.findElement(LoginButton).isDisplayed();
		return Utilities.isElementDisplayed(driver, LoginButton);
	}
	public void LoginClick()  {
		//driver.findElement(LoginButton).click();
		Utilities.clickElement(driver, LoginButton);
		
	}
	public String verifyMessage() {
		//return driver.findElement(AlertMessage).getText();
		return Utilities.getTextValue(driver, AlertMessage);
	}
	public void enterusrnm() throws  IOException, ParseException {
		//driver.findElement(username).sendKeys(usrnm);
		Utilities.enterText(driver, username, Utilities.readJsonFile("username", "./src/main/resources/login.json"));
	}
	public void enterpswrd() throws  IOException, ParseException {
		//driver.findElement(passwrd).sendKeys(pswrd);
		Utilities.enterText(driver, passwrd, Utilities.readJsonFile("password", "./src/main/resources/login.json"));
	}

}

