package SeleniumSelfStudies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class HandlingFrames extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","https://www.toolsqa.com/iframe-practice-page/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		driver.switchTo().frame("IF1");
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Azra");
		
		Thread.sleep(5000);
	}

}
