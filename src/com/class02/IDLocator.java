package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {
	/*TC 2: Mercury Tours Registration: 
Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info
Click Submit
User successfully registered
(Create 2 scripts using different locators)
	 * 
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.partialLinkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("don");
		driver.findElement(By.name("lastName")).sendKeys("kisot");
		driver.findElement(By.name("phone")).sendKeys("4567891011");
		driver.findElement(By.name("userName")).sendKeys("donkisot");
		driver.findElement(By.name("register")).click();
		driver.close();//
		
		
		
	}

}
