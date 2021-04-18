package budget;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class password extends Log_in{
	public void pass() throws InterruptedException {
	
	
		WebElement pass=driver.findElement(By.name("_password"));
		pass.sendKeys("abc123$");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		

	

}
	
}