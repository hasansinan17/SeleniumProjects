package SeleniumSelfStudies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class AlertHandle extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome","http://www.rediff.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// click sign in button
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		// click go button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		//handling alert
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println("Text on alert is "+alertText);
		alert.accept();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
	}

}
