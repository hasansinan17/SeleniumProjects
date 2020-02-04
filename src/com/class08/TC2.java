package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class TC2 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * Open chrome browser
	Go to �http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx�
	Login to the application
	Verify customer �Susan McLaren� is present in the table
	Click on customer details
		 */
		setUp("chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        String expectedValue="Susan McLaren";
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		for(int i=1; i<rows.size(); i++) {
			String rowText=rows.get(i-1).getText();
			//System.out.println(rowText);
			if(rowText.contains(expectedValue)) {
				driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]/td[13]")).click();
			System.out.println("passed");
			break;
				
	}
			

}
		Thread.sleep(3000);
		driver.quit();
}
}
