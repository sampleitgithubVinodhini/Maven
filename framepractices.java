package Com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framepractices {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();

		WebElement oi=driver.findElement(By.xpath("//iframe[@src='default.html']"));
		driver.switchTo().frame(oi);
		driver.findElement(By.id("Click")).click();
		
		
		driver.switchTo().defaultContent();
		WebElement t=driver.findElement(By.xpath("//iframe[@src='page.html']"));
		driver.switchTo().frame(t);
		
		WebElement s=driver.findElement(By.xpath("//iframe[@src='nested.html']"));
		driver.switchTo().frame(s);
		driver.findElement(By.id("Click1")).click();
		
			
	}
}
