package Com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adactinhotelbooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Eclipse workspace new\\BuildPath\\Driver new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement newreg = driver.findElement(By.id("username"));
		newreg.sendKeys("vinouma1234");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("TBAIZA");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		
		WebElement location = driver.findElement(By.id("location"));
		location.click();
		
		Select s=new Select(location);
		s.selectByIndex(3);
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		hotel.click();
		
		Select s1=new Select(hotel);
		s1.selectByIndex(2);
		
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		roomtype.click();
		
		Select s2=new Select(roomtype);
		s2.selectByIndex(2);
		
		WebElement roomnos = driver.findElement(By.id("room_nos"));
		roomnos.click();
		
		Select s3=new Select(roomnos);
		s3.selectByIndex(2);
		
		WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		checkin.sendKeys("26/02/2022");
		
		WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkout.sendKeys("27/02/2022");
		
		WebElement adult = driver.findElement(By.name("adult_room"));
		Select s4=new Select(adult);
		s4.selectByIndex(3);
		
		WebElement child = driver.findElement(By.name("child_room"));
		Select s5=new Select(child);
		s5.selectByIndex(1);
		
		WebElement search = driver.findElement(By.name("Submit"));
		search.click();
	
		WebElement radio = driver.findElement(By.xpath("//input[@type='radio']"));
		radio.click();
		
		WebElement contnu = driver.findElement(By.name("continue"));
		contnu.click();
	
		WebElement frstnme = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		frstnme.sendKeys("suganya");
	
		WebElement lastnm = driver.findElement(By.name("last_name"));
		lastnm.sendKeys("Babu");
	
		WebElement addrs = driver.findElement(By.name("address"));
		addrs.sendKeys("Chennai");
		
		WebElement crdcard = driver.findElement(By.name("cc_num"));
		crdcard.sendKeys("1234567890987654");
		
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select s6=new Select(cardtype);
		s6.selectByIndex(2);
		
		WebElement expmnth = driver.findElement(By.name("cc_exp_month"));
		Select s7=new Select(expmnth);
		s7.selectByIndex(5);
		
		WebElement expyr = driver.findElement(By.name("cc_exp_year"));
		Select s8=new Select(expyr);
		s8.selectByIndex(4);
		
		WebElement cvvv = driver.findElement(By.name("cc_cvv"));
		cvvv.sendKeys("1234");
		
		WebElement booknw = driver.findElement(By.name("book_now"));
		booknw.click();
		
			
	}

}
