package Com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginclass {
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe"); 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement user=driver.findElement(By.id("email"));
	user.sendKeys("suganya");
    Thread.sleep(3000);
    WebElement pass=driver.findElement(By.id("passcontainer"));
    pass.sendKeys("jhukhu");
	WebElement login=driver.findElement(By.name("login"));
	login.click();
	}
}