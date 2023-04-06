package handlingWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdowns {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
		
		//adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		// maximizing the window
		driver.manage().window().maximize();
		
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	

	//identify the element
	WebElement dropdown = driver.findElement(By.xpath("//select[@name='dropdown']"));
	//displayed
	dropdown.isDisplayed();
	//enabled
	dropdown.isEnabled();
	// create a reference variable of select class
	Select dropdownSelect = new Select(dropdown);
	// select by visible text
//	dropdownSelect.selectByVisibleText("Drop Down Item 2");
	//select by value
//    dropdownSelect.deselectByValue("dd6");
	//select by index
	dropdownSelect.deselectByIndex(0);
	
	// capture how many option are avalaible under a dropdown
	List<WebElement> dropdownOptions = dropdownSelect.getOptions();
	int totalOptions = dropdownOptions.size();
	System.out.println("Available option are " + totalOptions);
	//printing all the options
	for(WebElement opt : dropdownOptions) {
		System.out.println(opt.getText());
	}
	driver.close();
	
    
	
	
	

	}

}
