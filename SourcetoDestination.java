package Com.Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.support.ui.Select;

//import java.io.File;


public class SourcetoDestination {

	public static void main(String args[]) throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	String title=driver.getTitle();
	System.out.println(title);
	
	WebElement user=driver.findElement(By.xpath("//input[@type='text']"));
	user.sendKeys("suganyacrys@gmail.com");
	
	WebElement pass=driver.findElement(By.id("pass"));
	pass.sendKeys("123456");
	
	//TakesScreenshot t=(TakesScreenshot) driver;
	TakesScreenshot t= (TakesScreenshot) driver;
	File src=t.getScreenshotAs(OutputType.FILE);
	
	File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Screenshot\\pic1.png");
	FileHandler.copy(src, dest);
    driver.close();
		
	
	}
	}
