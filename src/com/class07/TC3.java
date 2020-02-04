package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class TC3 extends CommonMethods {
	/*
	 * 
TC 3: Verify element is enabled
1)Open chrome browser
2)Go to “https://the-internet.herokuapp.com/”
3)Click on “Click on the “Dynamic Controls” link
4)Click on enable button
5)Enter “Hello” and verify text is entered successfully
Close the browser
WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[text()='Hello World!']"))); 
	 */
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		Thread.sleep(2000);
		System.out.println(text);
		
		
		
	}
	

}