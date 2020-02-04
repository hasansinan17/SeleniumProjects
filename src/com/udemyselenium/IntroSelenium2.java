package com.udemyselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IntroSelenium2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.udemy.com/");
		System.out.println(driver.getTitle());
		
		

}
	
}
