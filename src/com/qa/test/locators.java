package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.github.dockerjava.api.model.Link;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

	public static void main(String[] args) {
       // http:// ultmateqa.com/simple-html-elements-for-automator
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); // EdgeDriver driver = new EdgeDriver();
		
		// Maximize the window
		driver.manage().window().maximize();
		
		// wait implicitly for 15 seconds.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Open target.com
		 driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
		 
		// Identifying click me element with the attribute ID
//		WebElement clickMeButton = driver.findElement(By.id("button1"));	
//		clickMeButton.click();
		
//		WebElement button = driver.findElement(By.className("buttonClass"));
//		button.click();
		 
//		 WebElement nameButton = driver.findElement(By.name("button1"));	 
//		 nameButton.click();
		 
	 
//		WebElement link =  driver.findElement(By.linkText("Click this link"));
//		link.click();
		 
//		WebElement partialLink = driver.findElement(By.partialLinkText("Click this "));
//		partialLink.click();
		 
		 
		  int totallLinks = driver.findElements(By.tagName("a")).size();
		  System.out.println("This page contains " + totallLinks + "l inks");
		  // clicking on button link
		  //driver.findElement(By.cssSelector("#idExample")).click();
		  
		  // clicking on button link
//	      driver.findElement(By.cssSelector("button[Class=buttonClass]")).click();
		  
		  driver.findElement(By.cssSelector("button.buttonClass[type=submit")).click();
		  
		 
		 
		 
		 
		 
		 

	}

}
