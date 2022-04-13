package Com.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class sampleplaceorder {


	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();

		WebElement email = driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[2]"));
		email.sendKeys("seleautotest@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("selenium");

		WebElement login = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		login.click();

		//Thread.sleep(3000);
		Actions a=new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[4]"))).build().perform();

		WebElement evng = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
		evng.click();

		Thread.sleep(3000);
		WebElement printed = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[2]"));
		printed.click();
		Thread.sleep(3000);

		WebElement cart = (driver.findElement(By.xpath("//span[text()='Add to cart']")));
		cart.click();
		Thread.sleep(2000);
		WebElement proceed = driver.findElement(By.xpath(("//a[@title='Proceed to checkout']")));
		proceed.click();

		WebElement addrsproceed = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		addrsproceed.click();

		WebElement nextproceed = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]"));
		nextproceed.click();

		WebElement thirdproceed = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		thirdproceed.click();

		Thread.sleep(2000);
		WebElement close = driver.findElement(By.xpath("//a[@title='Close']"));
		close.click();
		WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
		check.click();

		Thread.sleep(2000);
		WebElement finalproceed = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		finalproceed.click();

		WebElement pay = driver.findElement(By.xpath("//a[@class='bankwire']"));
		pay.click();

		//JavascriptExecutor js=(JavascriptExecutor) driver;

		WebElement ff = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		ff.click();
		//js.executeScript("arguments[0],scrollIntoView();",ff);
		//js.executeScript("window.scrollBy(0,2000);");
		//js.executeAsyncScript("window.scrollBy(0,1000);");


		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Screenshot\\pic3.png");
		FileUtils.copyFile(src, des);


	}
}