package actionitem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import  org.openqa.selenium.support.locators.RelativeLocator;
//import static org.openqa.selenium.support.locators.RelativeLocator.*;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CalculatorTest {

	public static void main(String[] args) {
		/*Q1. Gotohttps://theautomationzone.blogspot.com/2022/01/calculator.html 
		 * Using relative locators do a calculation -> 3X8 and capture the result. 
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://theautomationzone.blogspot.com/2022/01/calculator.html");
		
		//adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		// maximizing the window
		driver.manage().window().maximize();
		
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//clicking on 3
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("//input[@value='2'"))).clear();
		// clicking on * sign
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("//input[@value='='"))).clear();
		
		//clicking on 8 button
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("//input[@value='5'"))).clear();
		
		// clicking on = sign
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("//input[@value='9'"))).clear();
		// identify result field
		WebElement result = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("//input[@value='1'")));
		String finalresult =result.getAttribute("value");
		System.out.println("The result is "+ finalresult);
		driver.close();
		
		
		

	}

}
