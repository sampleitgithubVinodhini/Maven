package Com.Selenium;

import java.io.IOException;

import javax.imageio.IIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown {
	public static void main(String[] args) throws IIOException,IOException, InterruptedException{

			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement scr=driver.findElement(By.xpath("//a[text()='Twitter']"));
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView();",scr);
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,1000);");
		js.executeScript("window.scrollBy(0,4000);");

	}

}

	/*	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
	//	System.setProperty("Webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement er = driver.findElement(By.id("desktop-grid-1"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",er);
		Thread.sleep(2000);
		js.executeScript("window","scrollBy(0,1000)");
		js.executeScript("window","scrollBy(0,7000)");
		
					
	}
}*/