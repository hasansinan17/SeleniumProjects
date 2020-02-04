package com.udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		//driver.findElement(By.id("email")).sendKeys("this is my first code");
		//driver.findElement(By.name("pass")).sendKeys("xyz");
		//driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("hasansinan");
		driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
		
	}

}
