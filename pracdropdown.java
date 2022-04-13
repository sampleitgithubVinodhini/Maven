package Com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pracdropdown {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
				
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com");
		
		WebElement createacc = driver.findElement(By.xpath("//h5[text()='Drop down']"));
		createacc.click();
		
		WebElement multi = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select s=new Select(multi);
		List<WebElement> list = s.getAllSelectedOptions();
		
		for (WebElement we : list) {
			System.out.println(we.getText());
		}
		
		
		
		
	}
		
}
