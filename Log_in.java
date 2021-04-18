package budget;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Log_in {
   
	public static WebDriver driver;


	public void url()
	{
		System.setProperty("webdriver.firefox", "C://gecko.exe");
		driver=new FirefoxDriver();
		driver.get("https://budget-demo.bracits.net/login");
	}
	

	public void button_click() throws InterruptedException
	{
		WebElement button=driver.findElement(By.tagName("button"));
		button.click();
		
		Thread.sleep(5000);
		driver.close();
		
	}
	

}
