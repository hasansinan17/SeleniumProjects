package com.class09;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class HW2 extends CommonMethods {
	
	
	public static void main(String[] args) {
		/*TC 1: Table headers and rows verification

Open chrome browser
Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
Login to the application-->  input[id$='username'], input[id$='password']   Tester  test
Verify customer “Susan McLaren” is present in the table //table[@class='SampleTable']
Click on customer details  13
Update customers last name and credit card info //input[@value='Susan McLaren']    //input[@value='999888777888']
Verify updated customers name and credit card number is displayed in table
Close browser
		 * 
		 */
		setUp("chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.cssSelector("input[id$='username']")).sendKeys("Tester");
		driver.findElement(By.cssSelector("input[id$='password']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement>rows=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
		for(int i=1;i<=rows.size();i++) {
			String rowText=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]")).getText();
			
			if(rowText.contains("Susan McLaren")) {
				System.out.println(rowText);
				driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]/td[13]")).click();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@value='Susan McLaren']")).clear();
		driver.findElement(By.xpath("//input[@value='Susan McLaren']")).sendKeys("Susan Laren");
		driver.findElement(By.xpath("//input[@value='999888777888']")).clear();
		driver.findElement(By.xpath("//input[@value='999888777888']")).sendKeys("111222333444");
		driver.findElement(By.cssSelector("a.btn_light")).click();
		
		for(int i=1;i<=rows.size();i++) {
			String data=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]")).getText();
			if(data.contains("Laren")) {
				System.out.println(data);
				break;
			}
		}
		
		
		}
		
			
		}
		
		
		
	


