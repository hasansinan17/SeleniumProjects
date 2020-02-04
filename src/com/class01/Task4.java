package com.class01;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[] args) {
		/*//https://www.toyota.com/
		 * Open chrome browser
		Go to “https://www.ebay.com/”
		Verify Title “ebay.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.toyota.com/");
		final String expectedTitle="ebay.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Titles did match");
		}
		else {
			System.out.println("Titles does NOT match!");
		}
		
		
	}

}
