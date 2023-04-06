package handlingWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandligErromassage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.get("https://www.google.com/");
		
		//adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		// maximizing the window
		driver.manage().window().maximize();
		
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Adding user name
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		//clicking on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// capturing the element which has the error message
		WebElement error = driver.findElement(By.xpath("//span[text()='Required']"));
		
		//capturing actual error message
		String actualError = error.getText();
		
		//Expected error message
		String expectedError = "Required";
		
		// comparing actual vs expected
		if ( actualError.equalsIgnoreCase(expectedError)) {
			System.out.println("Test passed, happy!");
		}else {
			System.out.println("Sorry !! test failed");
		}
		
		//Closing the browser
		driver.close();
		
		
		

	}

}
