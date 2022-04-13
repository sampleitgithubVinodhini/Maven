package Com.Selenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class placeorder {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		//Thread.sleep(2000);
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();

		WebElement email = driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[2]"));
		email.sendKeys("seleautotest@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("selenium");

		WebElement login = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		login.click();

		Thread.sleep(3000);
		Actions a=new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//a[@title='Dresses'][2]"));

		a.moveToElement(move).build().perform();
		WebElement evng = driver.findElement(By.xpath("//a[text()='Evening Dresses'][4]"));
		evng.click();

	
		
	}
}