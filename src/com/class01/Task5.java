package com.class01;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://stackoverflow.com/");
		final String expectedTitle="We <3 people who code";
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Titles did match");
		}
		else {
			System.out.println("Titles did NOT match");
		}
		
		
	}

}
