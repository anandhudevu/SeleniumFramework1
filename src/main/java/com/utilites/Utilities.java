package com.utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utilities {
	public static boolean isElementDisplayed(WebDriver driver, By bylocator) {
		return driver.findElement(bylocator).isDisplayed();
	}
	public  static void  clickElement(WebDriver driver, By bylocator) {
		 driver.findElement(bylocator).click();;
}
	public  static  String getTextValue(WebDriver driver, By bylocator) {
		return driver.findElement(bylocator).getText();
}
	public  static void  enterText(WebDriver driver, By bylocator, String value) {
		 driver.findElement(bylocator).sendKeys(value);

}
	public static String getpropertiesFileValue(String propertyName) throws IOException {
		String propertyValue;
		Properties prop=new Properties();
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		prop.load(fis);
		propertyValue=prop.getProperty(propertyName);
		return propertyValue;
		
	}
	public static String readJsonFile(String nodevalue,String filepath) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj=parser.parse(new FileReader(filepath));
		JSONObject jsonObject=(JSONObject) obj;
		String value=(String)jsonObject.get(nodevalue);
		return value;
		
	}
}