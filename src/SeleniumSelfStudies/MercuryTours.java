package SeleniumSelfStudies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {
	/*TC 2: Mercury Tours Registration: 1.Open chrome browser2.Go to “http://newtours.demoaut.com/”
	 * 3.Click on Register Link
	 * 4.Fill out all required info
	 * 5.Click Submit
	 * 6.User successfully registered
	 * (Create 2 scripts using different locators)
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("sumeyra");
		driver.findElement(By.name("lastName")).sendKeys("kaptan");
		driver.findElement(By.name("phone")).sendKeys("123-456-789");
		driver.findElement(By.id("userName")).sendKeys("sum@gmail.com");
		driver.findElement(By.id("email")).sendKeys("sum@gmail.com");
		driver.findElement(By.name("password")).sendKeys("cimcime");
		driver.findElement(By.name("confirmPassword")).sendKeys("cimcime");
		driver.findElement(By.name("register")).click();
		
		
		
	}
	

}
