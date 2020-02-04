package com.class01;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	/*TC 1: Amazon Page Title Verification: 
Open chrome browser
Go to “https://www.amazon.com/”
Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed

TC 2: Syntax Page URL Verification: 
Open chrome browser
Navigate to “https://www.syntaxtechs.com/”
Navigate to “https://www.google.com/”
Navigate back to Syntax Technologies Page
Refresh current page
Verify url contains “Syntax”
	 * 
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com/");
		final String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("The actual and expected title did match");
		}
		else {
			System.out.println("The actual and expected title did NOT match");
		}
	}

}
