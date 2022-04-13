package Com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {
		
	/*	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("http://leafground.com/pages/table.html"));
		
		List<WebElement> value = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement td:value)
		{
			
	System.out.println(td.getText());		
						
		}
	System.out.println("-------------------------");	
	WebElement dat = driver.findElement(By.xpath("//table/tbody/tr[3]/td[5]"));
	System.out.println(dat.getText());
	
	}
	}
*/
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		
		List<WebElement> table = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement each : table) {
			
			System.out.println(each.getText());
		
		WebElement r1 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
		System.out.println(r1.getText());
		
		
		}
}}