package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class AddEmployee extends CommonMethods {
	
	/*TC 1: Add Employee
	1)Open chrome browser
	2)Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
	3)Login into the application
	4)Add Employee
	5)Log out 
	5)Quit the browser
	 * WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[text()='Hello World!']")));
	 */
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Syntax");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Syntax123!");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a#menu_pim_addEmployee")));
		driver.findElement(By.cssSelector("a#menu_pim_addEmployee")).click();
		
		WebDriverWait wait1=new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#firstName")));
		
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("Ken");
		driver.findElement(By.cssSelector("input#lastName")).sendKeys("Ryu");
		
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a#welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(4000);
		driver.quit();
		
		
	}

}
