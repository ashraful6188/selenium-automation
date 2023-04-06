package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingWebdriverManager {

	public static void main(String[] args) {
		
		// Import webdriverManager and setup edge driver
//		WebDriverManager.edgedriver().setup();
		
		// create a webdriver instance of EdgeDriver
//		WebDriver driver = new EdgeDriver();
		
		/* 
		 * How can we do same thing using Chrome ?
		 * 
		 */
		
		// setting up Chromedirver
//	     WebDriverManager.chromedriver().setup();
		// create a webdriver instance of chromedriver
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments(" --remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(co);
		
		
		
		// with the help of the driver reference we are getting the url
		driver.get("https://www.apple.com/");
		
		// close windows associate with this driver
//	    driver.quit();
		
		
		
		
		
		
		

	}

}
