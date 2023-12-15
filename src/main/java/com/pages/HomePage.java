package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilites.Utilities;

public class HomePage {
	WebDriver driver;
	
	By Filter  = By.xpath("//span[@class='dropdown-text']");
	By CreateNewProject = By.xpath("//span[@class='create-title']");
	By ProjectName = By.id("projectName");
	By ProjectCreateButton = By.xpath("//button[@type='submit']");
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public boolean Createbuttondisplay() {
		//return driver.findElement(CreateNewProject).isDisplayed();
		return Utilities.isElementDisplayed(driver, CreateNewProject);
		
	}
	public void createproject() {
		//driver.findElement(CreateNewProject).click();
		Utilities.clickElement(driver, CreateNewProject);
	}
	public void enterprojectName(String prjctnme) {
		//driver.findElement(ProjectName).sendKeys(prjctnme);
		Utilities.enterText(driver, ProjectName, prjctnme);
	}
	public void projectcreatebutton() {
		//driver.findElement(ProjectCreateButton).click();
		Utilities.clickElement(driver,ProjectCreateButton );
	}

}
