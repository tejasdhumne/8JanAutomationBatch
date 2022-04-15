package script;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot
{
public static void main(String[] args) throws IOException {

//	System.setProperty("webdriver.chrome.driver",
//			"D:\\selenium jar files\\chromedriver_win32\\chromedriver.exe");
//   
//
//	WebDriver driver =  new ChromeDriver();
//
//	driver.get("https://www.google.com");
//	driver.manage().window().maximize();
	
//	TakesScreenshot t = (TakesScreenshot)driver;
//	File SourceFile = t.getScreenshotAs(OutputType.FILE);
//	File destFile = new File("E:\\.jpg");
//	FileHandler.copy(SourceFile, destFile);
//	
//	System.out.println("screenshot pass");
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium jar files\\chromedriver_win32\\chromedriver.exe");
   System.out.println("1.properties are set to chrome browser");

	WebDriver driver =  new ChromeDriver();
	System.out.println("browser is opened");
	
	driver.manage().window().maximize();

	driver.get("https://www.flipkart.com/");
	System.out.println("open the url ");
	
}
}
