package Com.Selenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
///import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;

public class drag_drop {


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();

		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		driver.switchTo().frame(0);
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Good");
		
		
		
		
		
		
		
		
		
		
		/*
		WebElement drop = driver.findElement(By.xpath("//a[text()='Droppable']"));
		drop.click();

		Actions act=new Actions(driver);
		driver.switchTo().frame(0);

	*/	 


		
	
	
		
		
		//driver.findElement(By.tagName("iframe"));
		
		
	/*	WebElement skip = driver.findElement(By.xpath(("(//button[@type='button'])[2]")));
		skip.click();

		WebElement radiobutton = driver.findElement(By.name("radiooptions"));
		radiobutton.click();

		WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
		checkbox1.click();

		WebElement switch1 = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		switch1.click();

		WebElement frame = driver.findElement(By.xpath("//a[text()='Frames']"));
		frame.click();
*/
	
	}
}
