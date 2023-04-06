package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\QA Tools");
		     WebDriver driver = new ChromeDriver();
			 driver.get("https:// www.https://www.timeanddate.com/worldclock/");
			 
			 String cityName = driver.findElement(By.xpath("//table[@class='zebra fw tb-theme']/child::tbody/child::tr[1]/td[1]")).getText();
   System.out.println(" Name of the first city" + cityName);
   driver.close();
	}

}
