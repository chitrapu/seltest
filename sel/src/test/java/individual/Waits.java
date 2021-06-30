package individual;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	
	public static WebDriver driver;

	
	public static WebDriver init() {
		
		System.setProperty("webdriver.chrome.driver","C:\\drivermanager\\chromedriver.exe");  
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		return driver;
	}
			
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\drivermanager\\chromedriver.exe");  
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
	   FluentWait wait = new FluentWait(driver.findElement(By.id("email")));
	   wait.withTimeout(0, TimeUnit.SECONDS);
	   wait.ignoring(NoSuchElementException.class);
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
		
		
		
	}
	
	
	

}
