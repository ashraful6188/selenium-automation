package relativeLocator;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		 System.setProperty("webdriver.edge.driver"," /Users/ashrafulhaq/Tools/msedgedriver.exe");
	     WebDriver driver = new EdgeDriver();
		 driver.get("https://theautomationzone.blogspot.com/");
		 // maximizing
		 driver.manage().window().maximize();
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		 driver.findElement(By.xpath("//button[contains(text(),'with small delay')]")).click();
//       WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
//       String massage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")))
		Wait<WebDriver> wait =new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		String massage = wait.until(ExpectedConditions.elementToBeClickable
		    	(By.xpath("//p[contains(text(),'with small delay')]"))).getText();
		    //printing the text
		    System.out.println(massage);
		
	
	}

}
