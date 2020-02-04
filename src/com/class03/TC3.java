package com.class03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Number of link on Ebay webpage is "+links.size());
		for(WebElement hasan:links) {
			String allLinks=hasan.getText();
			System.out.println(allLinks);
		}
		
	}

}
