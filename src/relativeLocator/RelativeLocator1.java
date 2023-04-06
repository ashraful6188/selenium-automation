package relativeLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;



public class RelativeLocator1 {

	public static void main(String[] args) {
		     System.setProperty("webdriver.edge.driver"," /Users/ashrafulhaq/Tools/msedgedriver.exe");
		     WebDriver driver = new EdgeDriver();
		     //WebDriver driver = new FirefoxDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			 //Maximizing
			 driver.manage().window().maximize();
			 //adding implicit wait
			 //implicit wait- implicitly wait for a web element to be available for a given amount of time 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			 // Identify a web element which help us to find out our desired element
			 WebElement label = driver.findElement(By.xpath("//label[text()='Password']"));
		    // using relative locator above to find out an input tag(user name field)
			 driver.findElement(RelativeLocator.with(By.tagName("input")).above(label)).sendKeys("Admin");
	        
		    //driver.findElement(RelativeLocator.with(By.tagName("input")).below(label)).sendKeys("admin123");
			 
			 driver.close();
	        
	
	}

}
