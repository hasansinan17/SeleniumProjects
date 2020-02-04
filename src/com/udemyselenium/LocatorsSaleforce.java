package com.udemyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSaleforce {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("helloWorld");
		driver.findElement(By.name("pw")).sendKeys("12345");
		driver.findElement(By.id("Login")).click();
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
	}

}
