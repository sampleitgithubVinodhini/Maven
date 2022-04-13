package Com.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot1 {

//private static final String FileUtil = null;

public static void main(String[] args) throws IOException, InterruptedException
{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement first = driver.findElement(By.name("email"));
	first.sendKeys("suganya");
	
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("suganya");
	
	WebElement log = driver.findElement(By.name("login"));
	log.click();
	
	Thread.sleep(4000);
	
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	
    File destination=new File("C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Screenshot\\pic2.png");
    FileUtils.copyFile(source,destination);
//FileHandler.copy(source,destination);
} 

}
