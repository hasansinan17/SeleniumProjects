package com.class01;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	/*TC 2: Syntax Page URL Verification: 
    Open chrome browser
    Navigate to “https://www.syntaxtechs.com/”
    Navigate to “https://www.google.com/”
    Navigate back to Syntax Technologies Page
    Refresh current page
    Verify url contains “Syntax”
 * 
 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.grubhub.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		String url=driver.getTitle();
		if(url.contains("Grubhub")) {
			System.out.println("url contains Grubhub");
		}
		else {
			System.out.println("url does NOT contain Grubhub");
		}
		
		
		
	}

}
