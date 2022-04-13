package Com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdrope {
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		//Thread.sleep(2000);

		WebElement create = driver.findElement(By.xpath(" //a[@class='login']"));
		create.click();	

		WebElement mail = driver.findElement(By.id("email_create"));
		mail.sendKeys("seleautotest@gmail.com");

		WebElement submit = driver.findElement(By.id("SubmitCreate"));
		submit.click();

		Thread.sleep(10000);
		WebElement gender = driver.findElement(By.xpath("//div[@class='radio-inline'][2]"));
		gender.click();

		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys("suganya");

		WebElement lastname = driver.findElement(By.id("customer_lastname"));
		lastname.sendKeys("rajan1");

		//WebElement email = driver.findElement(By.id("email"));
		//email.sendKeys("seleautotest@gmail.com");


		WebElement passwoord = driver.findElement(By.id("passwd"));
		passwoord.sendKeys("selenium");

		WebElement bday = driver.findElement(By.id("days"));
		Select s=new Select(bday);
		s.selectByValue("2");

		WebElement month = driver.findElement(By.id("months"));
		Select s1=new Select(month);
		s1.selectByIndex(2);

		Thread.sleep(2000);
		WebElement year = driver.findElement(By.name("years"));
		Select s2=new Select(year);
		s2.selectByValue("2000");

		/*WebElement newsletter = driver.findElement(By.id("newsletter"));
		newsletter.click();

		WebElement option = driver.findElement(By.id("optin"));
		option.click();
		 */
		WebElement firstname1 = driver.findElement(By.name("firstname"));
		firstname1.sendKeys("Sukanya");

		WebElement lastname1 = driver.findElement(By.name("lastname"));
		lastname1.sendKeys("Rajan");

		Thread.sleep(2000);
		WebElement companyname = driver.findElement(By.id("company"));
		companyname.sendKeys("Greens");

		Thread.sleep(2000);
		WebElement adress = driver.findElement(By.id("address1"));
		adress.sendKeys("3,mountroad,chennai");

		Thread.sleep(2000);
		WebElement adress1 = driver.findElement(By.id("address2"));
		adress1.sendKeys("salem");

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Chennai");

		WebElement state = driver.findElement(By.id("id_state"));
		Select s4=new Select(state);
		s4.selectByValue("3");


		WebElement postcode = driver.findElement(By.id("postcode"));
		postcode.sendKeys("85030");


		WebElement additionalinformation = driver.findElement(By.id("other"));
		additionalinformation.sendKeys("automation testing");

		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("1234567890");

		WebElement mobile = driver.findElement(By.id("phone_mobile"));
		mobile.sendKeys("0987654321");

		WebElement alias = driver.findElement(By.id("alias"));
		alias.sendKeys("coimbatore");

		WebElement reg = driver.findElement(By.name("submitAccount"));
		reg.click();


	}
}
