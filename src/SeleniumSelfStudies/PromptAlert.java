package SeleniumSelfStudies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class PromptAlert extends CommonMethods {
public static void main(String[] args) throws InterruptedException {
	setUp("chrome","https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[text()='Prompt Pop up']")).click();
	
	Alert alert=driver.switchTo().alert();
	Thread.sleep(3000);
	String text=alert.getText();
	System.out.println(text);
	if(text.equals("Do you like toolsqa?")) {
		alert.sendKeys("Hello");
		Thread.sleep(3000);
	}
	Thread.sleep(3000);
	alert.accept();
	
	
	
}
	

}
