package Com.Selenium;

//import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Alert.html");
		
		driver.findElement(By.xpath("//button [text()='Alert Box']")).click();
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button [text()='Confirm Box']")).click();
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button [text()='Prompt Box']")).click();
		
		driver.switchTo().alert().sendKeys("Open");
		
		driver.switchTo().alert().accept();
	}

}


		 