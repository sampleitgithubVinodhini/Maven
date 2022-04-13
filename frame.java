package Com.Selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

//public class Frame {
		public static void main(String args[]) throws InterruptedException, IOException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("singleframe");
		
		
		//driver.findElement(By.xpath("//iframe[@id='singleframe']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Iframe')])[2]")).click();
		WebElement outer=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	    driver.switchTo().frame(outer);
	    WebElement inner=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	    driver.switchTo().frame(inner);
	   
	    
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("suganya");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Video']")).click();
		
		}
	}
	
	


			
/*			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Frames.html");
			
			driver.manage().window().maximize();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123");
			
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("hufd");
		}
		}
	*/	