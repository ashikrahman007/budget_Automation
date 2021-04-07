package budget;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buget_Home {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
	     driver.get("https://budget-demo.bracits.net/login");
	     driver.manage().window().maximize();
	     Thread.sleep(4000);
		 WebElement user_name = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/input[1]"));
		 user_name.sendKeys("00197283");
		 Thread.sleep(2000);
		 WebElement password = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/input[1]"));
		 password.sendKeys("abc123$");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		 Thread.sleep(2000);
		 
		 JavascriptExecutor scroll = (JavascriptExecutor)driver;
		 scroll.executeScript("window.scrollBy(0,100)");
		 Thread.sleep(500);
		 
		 scroll.executeScript("window.scrollBy(100,200)");
		 Thread.sleep(500);
		
		 scroll.executeScript("window.scrollBy(200,300)");
		 Thread.sleep(500);
		 
		 scroll.executeScript("window.scrollBy(300,400)");
		 Thread.sleep(500);
		 
		 scroll.executeScript("window.scrollBy(400,500)");
		 Thread.sleep(500);
		 
		 
		 WebElement click_button=driver.findElement(By.xpath("//body/div[@id='kt_scrolltop']/i[1]"));
		 click_button.click();
		 
		 WebElement information=driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/i[1]"));
		 information.click();
		 
		 Thread.sleep(5000);
		 

		 
		 
		 WebElement Archive=driver.findElement(By.xpath("//span[contains(text(),'Archive')]"));
		 Archive.click();
		 
		 
		 JavascriptExecutor scroll_1 = (JavascriptExecutor)driver;
		 scroll_1.executeScript("window.scrollBy(0,100)");
		 
		 Thread.sleep(3000);
		 
         scroll_1.executeScript("window.scrollBy(0,100)");
         Thread.sleep(500);
         
         scroll_1.executeScript("window.scrollBy(0,100)");
		 
		 Thread.sleep(5000);
		 WebElement upload_file=driver.findElement(By.cssSelector("body.page-loading-enabled.header-fixed.header-mobile-fixed.subheader-enabled.subheader-fixed.subheader-mobile-fixed.footer-fixed:nth-child(2) div.d-flex.flex-column.flex-root:nth-child(3) div.d-flex.flex-row.flex-column-fluid.page div.d-flex.flex-column.flex-row-fluid.wrapper div.content.d-flex.flex-column.flex-column-fluid div.subheader.py-2.py-lg-4.subheader-solid div.container-fluid.d-flex.align-items-center.justify-content-between.flex-wrap.flex-sm-nowrap div.d-flex.align-items-center:nth-child(2) a.btn.btn-hover-light-primary.btn-icon:nth-child(1) > i.flaticon-upload.btn-icon.icon.fa-2x"));
		 upload_file.click();
		 
		 Thread.sleep(5000);
		 
		
		 driver.close();
	}

}
