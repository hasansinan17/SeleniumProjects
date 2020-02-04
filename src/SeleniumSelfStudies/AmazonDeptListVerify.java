package SeleniumSelfStudies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDeptListVerify  {
	final static String AMAZON_LINK="http://amazon.com";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(AMAZON_LINK);
		List<WebElement>departments=driver.findElements(By.tagName("a"));
		
		System.out.println(departments.size());
		
		
		
		
		
		
		
		
	}

}
