package budget;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class User_name extends Log_in {
	
	
	
	
	public void user() throws InterruptedException{
		
		
		
		WebElement user_id=driver.findElement(By.name("_username"));
		user_id.sendKeys("00197283");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		
		
	}

	
	
	
	
	
}
