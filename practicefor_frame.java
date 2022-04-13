package Com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.server.handler.FindElement;

public class practicefor_frame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();

		WebElement r=driver.findElement(By.xpath("//iframe[@src='default.html']"));
		driver.switchTo().frame(r);
		driver.findElement(By.id("Click")).click();

		driver.switchTo().defaultContent();
		WebElement g=driver.findElement(By.xpath("//iframe[@src='page.html']"));
		driver.switchTo().frame(g);
		
		WebElement g1=driver.findElement(By.xpath("//iframe[@src='nested.html']"));
		driver.switchTo().frame(g1);
		driver.findElement(By.id("Click1")).click();


	}}