package handlingWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		//adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		// maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		WebElement link = driver.findElement(By.xpath("//a[text()='online Ctalog']"));	
       
		// is displayed 
		boolean status = link.isDisplayed();
		System.out.println(status);
				
		// is enabled
		status = link.isEnabled();
		System.out.println(status);
				
		//capture the name of the link
		String linkText = link.getText();
		System.out.println("The label of the link" + linkText);
				
		//click able
		link.click();
		String landingUrl = driver.getCurrentUrl();
		String expectedUrl = "http://gcreddy.com/project/";
		if (landingUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println("Link worked !!");
		}else {
			System.out.println("Test Failed");
		}
		driver.quit();
				
	}

}
