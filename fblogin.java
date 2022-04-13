package Com.Selenium;

import java.io.IOException;

import javax.imageio.IIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {
	public static void main(String[] args) throws IIOException,IOException, InterruptedException{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement first = driver.findElement(By.name("firstname"));
		first.sendKeys("suganya");
	}
}