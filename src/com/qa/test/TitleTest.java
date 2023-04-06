package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleTest {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); // EdgeDriver driver = new EdgeDriver();
		
		// Maximize the window
		driver.manage().window().maximize();
		
		// wait implicitly for 15 seconds.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Open target.com
		 driver.get("https://target.com/");
		 
		
		 String expectedTittle = "Target : Expect More. Pay Less.";
		 
        // capturing actual title
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		 
		 if (expectedTittle.equalsIgnoreCase(actualTitle)) {
			 System.out.println(" Title Validation passed   ");
			
		 }
		 else {
			 System.out.println(" Title Validation falied");
		 }
		 driver.close();
	}

}
