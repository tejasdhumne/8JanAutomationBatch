package script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class seleniumclass
{
   public static void main(String[] args) throws InterruptedException 
   {
	   
			System.setProperty("webdriver.chrome.driver",
					"D:\\selenium jar files\\chromedriver_win32\\chromedriver.exe");
		   System.out.println("1.properties are set to chrome browser");

			WebDriver driver =  new ChromeDriver();
			System.out.println("browser is opened");
			
			driver.manage().window().maximize();

			driver.get("https://www.flipkart.com/");
			System.out.println("open the url ");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		 username.sendKeys("7767856945");
		 
		 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		 password.sendKeys("Tejas@1234");
		 
		 WebElement Login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		 Login.click(); 
		 
		 WebElement dropdown =driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]"));
		 dropdown.click();
		 Thread.sleep(5000);
		  
		 
		 
		 String expectedurl ="https://www.flipkart.com/";
		 
		String actualurl = driver.getCurrentUrl();
		 
		 if(expectedurl.equals(actualurl))
		 {
			 System.out.println("test case is passed");
		 }
		 else
		 {
			 System.out.println("test case is fail");
		 }
		 
		 
		 
		 
			
}
}
