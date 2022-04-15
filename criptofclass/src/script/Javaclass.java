package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javaclass
{


public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium jar files\\chromedriver_win32\\chromedriver.exe");
   System.out.println("1.properties are set to chrome browser");

	WebDriver driver =  new ChromeDriver();
	System.out.println("browser is opened");

	driver.get("https://www.google.com");
	System.out.println("open the url ");
	
	
	String expected = "Google";
	
	String actual = driver.getTitle();
	System.out.println(actual);
	
	  if(expected.equals(actual))
	{
		System.out.println("passed");
	}
	  else
	{
		System.out.println("system is fail");
	}
	driver.close();
	System.out.println("close the tab");
	
}
}
