package com.udemyselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");//Hit url on the browser
		System.out.println(driver.getTitle());//Validate if your page title is correct
		
		System.out.println(driver.getCurrentUrl());//Validate if landed on correct url
		//driver.getPageSource();
		//System.out.println(driver.getPageSource());
		driver.navigate().to("https://www.yahoo.com/");
		driver.navigate().back();
		
		//driver.close();//it closes current browser
		//driver.quit();//it closes all browsers opened by selenium scripts
		
		
		
	}

}
