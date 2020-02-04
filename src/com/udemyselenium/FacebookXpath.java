package com.udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("my own xpath");
		
		//driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("12345");
		
		//driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		
		driver.findElement(By.cssSelector("input[type='email'")).sendKeys("hasansinan");
		driver.findElement(By.cssSelector("input[name='pass'")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[value='Log In'")).click();
		System.out.println(driver.findElement(By.cssSelector("div[role='alert'")).getText());
		
		
		
		
		
	}

}
