package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) 
	{
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
