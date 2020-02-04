package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class TC1 extends CommonMethods {
	/*
	 * TC 1: Verify element is present
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Loading” link
Click on “Example 1...” and click on “Start”
Verify element with text “Hello World!” is displayed
Close the browser 
	 */
	public static void main(String[] args) throws InterruptedException {
		setUp("Chrome","https://the-internet.herokuapp.com/");
		acceptAlert();
		driver.findElement(By.xpath("//a[text()='Dynamic Loading']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[text()='Hello World!']")));
		
		boolean displayed=driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed();
		System.out.println(displayed);
		String actualText=driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText();
		String expectedText="Hello World!";
		if(actualText.equals(expectedText)) {
			System.out.println("Mission is Done!");
			
		}
		else {
			System.out.println("Booo!!!");
		}
		Thread.sleep(3000);
		driver.quit();
	
		
		
	}

}
