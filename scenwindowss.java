package Com.Selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenwindowss {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String parentWindowId = driver.getWindowHandle();
		
		Set<String> allWindows = driver.getWindowHandles(); 
		int windowCount = 0;
		
		for (String x : allWindows) { windowCount++;
		if (!parentWindowId.equals(x)) 
		{
			if (windowCount == 2) {
		driver.switchTo().window(x); driver.close();
		continue;
		}
		driver.switchTo().window(x);
		System.out.println("I am in " + windowCount +
		"window");
		}
		
		
	}
	}}
