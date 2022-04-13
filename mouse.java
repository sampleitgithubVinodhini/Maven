package Com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("https://www.amazon.in/");
		WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));

		Actions a=new Actions(driver);
		a.contextClick(mob).build().perform();

		Robot call=new Robot();
		call.keyPress(KeyEvent.VK_DOWN);
		call.keyRelease(KeyEvent.VK_DOWN);

		call.keyPress(KeyEvent.VK_ENTER);
		call.keyRelease(KeyEvent.VK_ENTER);

		WebElement bestsellers = driver.findElement(By.xpath("//a[text()='Best Sellers'][1]"));
		Actions b=new Actions(driver);
		b.contextClick(bestsellers).build().perform();
		//Robot r=new Robot();
		call.keyPress(KeyEvent.VK_DOWN);
		call.keyRelease(KeyEvent.VK_DOWN);

		call.keyPress(KeyEvent.VK_ENTER);
		call.keyRelease(KeyEvent.VK_ENTER);

		WebElement service = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		Actions c=new Actions(driver);
		c.contextClick(service).build().perform();
		call.keyPress(KeyEvent.VK_DOWN);
		call.keyRelease(KeyEvent.VK_DOWN);

		call.keyPress(KeyEvent.VK_ENTER);
		call.keyPress(KeyEvent.VK_ENTER);

				Set<String> handles = driver.getWindowHandles();

		for(String y:handles)
		{
			String s=driver.switchTo().window(y).getTitle();
			System.out.println(s);

			//String customerservice="Help - Amazon Customer Service";
			//String BestSellers="Amazon.in Bestsellers: The most popular items on Amazon";
			String Mobile="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
	
		if(Mobile.equals(s))
		{

			driver.close();
		}
		}
		
	
	}
	}
	

	






