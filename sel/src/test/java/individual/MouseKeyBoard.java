package individual;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyBoard extends Waits{
	
	public static WebDriver driver;
	public MouseKeyBoard(WebDriver driver) {
		
		this.driver=driver;
	}


	
	

	

	  public void mouse() {
		  
		  Actions act=new Actions(driver);
		  WebElement email= driver.findElement(By.id("email"));
		  
		  
		  act.keyDown(Keys.SHIFT).build().perform();
			act.sendKeys(email, "jaffa").build().perform();
			 act.keyUp(Keys.SHIFT).build().perform();
	  }
	
	  
	  public static void main(String[] args) {
		
		  
		  MouseKeyBoard mk = new MouseKeyBoard(Waits.init());
		  mk.mouse();
		  
	}
	  

}
