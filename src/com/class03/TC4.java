package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("hasan");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		String str= driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		System.out.println(str);
		
		System.out.println(str.isEmpty());
		System.out.println(str.equals("Password cannot be empty"));
	}

}
