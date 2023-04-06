package relativeLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver"," /Users/ashrafulhaq/Tools/msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	//WebDriver driver = new FirefoxDriver();
    driver.get("https://theautomationzone.blogspot.com/");
    //maximizing
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//button[contains(text(),'with small delay')]")).click();
//    //p[contains(text(), 'with small delay')]   
    //creating reference variable of WebDriverWait class
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//    driver.findElement(By.xpath("p[contains(text(),'with small delay")).getText();
    
    //setting wait condition for the element and capturing the text
    //saving the text under a variable
    String massage = wait.until(ExpectedConditions.elementToBeClickable
    	(By.xpath("//p[contains(text(),'with small delay')]"))).getText();
    //printing the text
    System.out.println(massage);
	}

}
