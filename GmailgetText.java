package Com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailgetText {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("");
	}
}
