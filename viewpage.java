package Com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class viewpage {

		 
		public static void main(String args[])
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		driver.manage().window().maximize();
		
		
		
		
		
		
		String rose = driver.getTitle();
		System.out.println(rose);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		}
	}
	

