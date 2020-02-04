package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class TC2 extends CommonMethods {
	/*
	 * TC 2: Verify element is clickable
1)Open chrome browser
2)Go to “https://the-internet.herokuapp.com/”
3)Click on “Click on the “Dynamic Controls” link
4)Select checkbox and click Remove
5)Click on Add button and verify “It’s back!” text is displayed	p#message
6)Close the browser
WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[text()='Hello World!']")));
	 */
public static void main(String[] args) throws InterruptedException {
	setUp("chrome","https://the-internet.herokuapp.com/");
	
	driver.findElement(By.linkText("Dynamic Controls")).click();
	driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	driver.findElement(By.cssSelector("button[type='button']")).click();
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
	driver.findElement(By.xpath("//button[text()='Add']")).click();
	WebDriverWait wait2=new WebDriverWait(driver,30);
	wait2.until(ExpectedConditions.elementToBeClickable(By.cssSelector("p#message")));
	boolean displayed=driver.findElement(By.cssSelector("p#message")).isDisplayed();
	String text=driver.findElement(By.cssSelector("p#message")).getText();
	System.out.println(displayed);
	System.out.println(text);
	
	Thread.sleep(3000);
	driver.quit();
}
	
}
