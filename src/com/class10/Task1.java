package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Task1 extends CommonMethods{
	public static void main(String[] args) {
		/*
		 * TC 1: HRMS Login

Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login to the application by writing xpath based on “parent and child relation”
		 */
		setUp("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		
		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Syntax");
		driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("Syntax123");
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
	}
	

}
