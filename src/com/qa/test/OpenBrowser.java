package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) throws Exception {
	    //System.setProperty("webdriver.edge.driver", "/Users/ashrafulhaq/Tools/msedgedriver.exe");
	     
	    // System.setProperty("webdriver.gecko.driver", "/Users/ashrafulhaq/Tools/geckodriver.exe ");
		 
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments(" --remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(co);
	   //WebDriver driver = new EdgeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		// browser navigation commands
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		driver.get("https://facebook.com/");
		Thread.sleep(1000);
		driver.get("https://www.target.com/");
		Thread.sleep(1000);
		
		//method change
		driver.navigate().back();
		Thread.sleep(1000);
		
		// browser navigation command
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		
		//refresh
		driver.navigate().refresh();
		driver.close();
		
		
		
	}

}
