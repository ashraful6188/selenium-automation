package relativeLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingWebDriverManager {

	public static void main(String[] args) {
	
		//launching Edge browser using webdrivermanager
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
//		//launching FireFox browser using webdrivermanager
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
     		
//		//launching chrome browser using webdrivermanager
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
        driver.get("https://theautomationzone.blogspot.com/");
		
		// maximizing the window
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'with smal delay)]")).click();
	
		//creating a reference variable of WebDriverWait class
         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//adding implicit wait
	
        //setting wait condition for the element and capturing the text
        //saving the text under a variable 
        String message = wait.until(ExpectedConditions.elementToBeClickable
        		(By.xpath("//p[contains(text(),'with smal delay')]"))).getText();
         
         //printing the text
         System.out.println(message);
		
		
		
		
		
	}

	

}
