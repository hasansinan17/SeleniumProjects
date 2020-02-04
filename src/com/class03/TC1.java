package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
	// username=sohilaryan, password=Syntax@12
	//TC 1: HRMS Application Login: 
	//	Open chrome browser
		//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
		//Enter valid username and password
		//Click on login button
		//Then verify Syntax Logo is displayed.

		//TC 2: HRMS Application Negative Login: 
		//Open chrome browser
		//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
		//Enter valid username
		//Leave password field empty
		//Verify error message with text “Password cannot be empty” is displayed.
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[@class='form-hint']")).sendKeys("sohilaryan");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Syntax@12");
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		List
		List<WebElement> links=driver.findElemennts(By.tagName("a"));
		
		
	}


}
