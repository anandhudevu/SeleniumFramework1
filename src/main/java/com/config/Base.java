package com.config;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utilites.Utilities;

public class Base {
	public static WebDriver driver;
	public static void instalisation() throws IOException {
		//String browser = System.getProperty("browsername", "chrome");
		String browser = System.getProperty("browsername", Utilities.getpropertiesFileValue("browser"));
		if(browser.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
		}
		else
			System.out.println("invalid");
	
	//driver.get("https://demo1.dev.contentpro.ai/login");
	driver.get(Utilities.getpropertiesFileValue("url"));
		
	}

}
