package handlingWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditBoxTest {

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
		
		// displayed validation 
		boolean status = searchBox.isDisplayed();
		System.out.println(status);// true
		
		//enable validation 
		boolean status2 = searchBox.isEnabled();
		System.out.println(status2);//true
		
		//use sendKeys method and passing desired input
		searchBox.sendKeys("10 most beatiful place on earth");
		
		//capturing the input 
		String input = searchBox.getAttribute("value");
		System.out.println(input);
		Thread.sleep(2000);
		
		//clear the edit field
		searchBox.clear();
		Thread.sleep(1000);
		driver.close();
		
		
				
	}

}
