package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class openinEdge {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.edge.driver",""/Users/ashrafulhaq/Tools/msedgedriver.exe" );
         System.setProperty("webdriver.edge.driver"," /Users/ashrafulhaq/Tools/msedgedriver.exe");
	     WebDriver driver = new EdgeDriver();
		 driver.get("https:// www.amazon.com");
	}

}
