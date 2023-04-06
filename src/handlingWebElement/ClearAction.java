package handlingWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearAction {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		
		//adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		// maximizing the window
		driver.manage().window().maximize();
		
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//capturing a web element and saving it under variable
		WebElement searchBox = driver.findElement(By.className("q"));
		
		//use sendKeys method and passing desired input
		searchBox.sendKeys("search for meat");
		
		//wait only demo purpose
		Thread.sleep(2000);
		
		// clear the search filed
		searchBox.clear();
		
	}

}
