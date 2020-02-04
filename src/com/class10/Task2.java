package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Task2 extends CommonMethods{
	public static void main(String[] args) {
		/*
		 * 
Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login to the application by writing xpath based on “following and preceding siblings”
		 */
		setUp("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input"));
		driver.findElement(By.xpath(""))
	}

}
