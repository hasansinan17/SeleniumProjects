package com.class01;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
		/*TC 2: Syntax Page URL Verification: 
        Open chrome browser
        Navigate to “https://www.syntaxtechs.com/”
        Navigate to “https://www.google.com/”
        Navigate back to Syntax Technologies Page
        Refresh current page
        Verify url contains “Syntax”
	 * 
	 */
		/*driver.getTitlr();
		 * driver.navigate().to("htttp/...";
		 * driver.navigate().to("http/...";
		 * driver.navigate().back();
		 * driver.navigate().refresh();
		 * String actualTitle=driver.getTitle();
		 * 
;
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.syntaxtechs.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		
		String title=driver.getTitle();
		if(title.contains("Syntax")) {
			System.out.println("Title contains Syntax");
		}
		else {
			System.out.println("Title does NOT contain Syntax");
		}
	}

}
