package Com.Selenium;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class dynamicxpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\BuildPath\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/men-casual-shirts");
		List<WebElement> product = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
		
		List<Integer> sub=new ArrayList<>();
		for (WebElement web : product) {
			String re = web.getText().replace("Rs. ","");
			int parseInt = Integer.parseInt(re);
			sub.add(parseInt);
		}
		Collections.sort(sub,Collections.reverseOrder());
		System.out.println(sub);

		System.out.println("Maximum Amount :"+ Collections.max(sub));	
		System.out.println("Minimum Amount: "+ Collections.min(sub));
		System.out.println("Product Count:"+ sub.size());	
	}
}











