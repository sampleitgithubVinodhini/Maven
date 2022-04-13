package Com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class pomlaunchurl {

	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MICROSECONDS);
   PageFactory.initElements(driver, pm.class);
   

}
}