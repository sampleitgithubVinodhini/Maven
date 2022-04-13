package Com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowshandling {
//	private static final long TimeOut = 0;

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");


		//driver.manage().timeouts().implicitlyWait(TimeOut,TimeUnit.SECONDS);

		driver.manage().window().maximize();
		WebElement customer = driver.findElement(By.xpath("//a[text()='Customer Service']"));

		Actions a=new Actions(driver);
		a.contextClick(customer).build().perform();
		Robot r1=new Robot();

		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);

		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);

		WebElement bestseller = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		Actions a1=new Actions(driver);
		a1.contextClick(bestseller).build().perform();

		Robot r2=new Robot();
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);

		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);

		WebElement Mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions a2=new Actions(driver);
		a2.contextClick(Mobiles).build().perform();

		Robot r3=new Robot();
		r3.keyPress(KeyEvent.VK_DOWN);
		r3.keyRelease(KeyEvent.VK_DOWN);

		r3.keyPress(KeyEvent.VK_ENTER);
		r3.keyRelease(KeyEvent.VK_ENTER);

		Set<String> win = driver.getWindowHandles();
		for (String s : win) {

			String title = driver.switchTo().window(s).getTitle();
			System.out.println(title);
		}

		
	}
}
