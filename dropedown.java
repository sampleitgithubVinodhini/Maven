package Com.Selenium;

//import java.awt.List;
import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class dropedown {
	

		public static void main(String args[]) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://leafground.com/pages/Dropdown.html");
			driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			    			
			WebElement drop = driver.findElement(By.xpath("//select[@class = 'dropdown']"));
			
	        Select s = new Select(drop);
	        s.selectByValue("2");
	        
	        WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
	        Select s1=new Select(multi);
	        s1.selectByVisibleText("Selenium");
	        s1.selectByIndex(3);
	        s1.selectByValue("4");
	        s1.deselectByVisibleText("Loadrunner");
       
	        
	        
	        List<WebElement> r1 = s1.getOptions();
	        for (WebElement mul:r1)
	        {
	        	System.out.println(mul.getText());
	        	
	       }
	        boolean h =s1.isMultiple();
	        System.out.println(h);
}
}



