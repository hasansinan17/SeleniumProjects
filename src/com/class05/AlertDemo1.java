package com.class05;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class AlertDemo1 extends CommonMethods{
	public static final String SYNTAX_PRACTICE_URL="http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
		
		
		
		
		
		
		
	}

}
