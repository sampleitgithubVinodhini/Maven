package Com.Selenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;

public class placeorderdress {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		/*
		
		WebElement evng = driver.findElement(By.xpath("//a[@class='sf-with-ul'][4]"));
		Actions a=new Actions(driver);
		a.moveToElement(evng).build().perform();

		WebElement img = driver.findElement(By.xpath("//img[@title='Blouse'][2]"));
		img.click();
	
	*/
	
//		driver.findElement(By.xpath("//*[@id="homefeatured"]/li[2]/div/div[1]/div/a[1]/img)");
	
		
		
		WebElement id1 = driver.findElement(By.id("dropdownMenuButton)"));
		
		WebElement act = driver.findElement(By.xpath("(//a[text()='Action'])[1]"));
	}
}
