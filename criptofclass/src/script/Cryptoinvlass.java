package script;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Cryptoinvlass 
{
	public static WebDriver driver;

static void method1() throws IOException
{
	Date date = new Date();
	DateFormat d= new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
	String newDate = d.format(date);
	
	
	TakesScreenshot z = (TakesScreenshot)driver;
	File Source = z.getScreenshotAs(OutputType.FILE);
	File dest = new File("E:\\"+newDate+".jpg");
	FileHandler.copy(Source, dest);
}


public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium jar files\\chromedriver_win32\\chromedriver.exe");
   System.out.println("1.properties are set to chrome browser");

	 driver =  new ChromeDriver();
	System.out.println("browser is opened");
	
	driver.manage().window().maximize();

	driver.get("https://www.flipkart.com/");
	System.out.println("open the url ");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
 username.sendKeys("7767856945");
// Cryptoinvlass.method1();
 
 
 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
 password.sendKeys("Tejas@1234");
// Cryptoinvlass.method1();
 
 WebElement Login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
 Login.click(); 
// Cryptoinvlass.method1();
// Actions act = new Actions(driver); 
  WebElement dropdown =driver.findElement(By.xpath("((//img[@class='_396cs4  _3exPp9'])[1]")); 
  dropdown.click();
Thread.sleep(50000);

//Actions act = new Actions(driver);
//Alert alt = driver.switchTo().alert();
//alt.accept();
//WebElement pincode = driver.findElement(By.xpath("//input[@class='_166SQN']"));
//pincode.click();
////alt.sendKeys("442402");
////alt.accept();
// Thread.sleep(4000);
System.out.println("pass");

  
	
}
}
