package com.class09;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class HW3 extends CommonMethods {
	/*
	 * HW-3
TC 1: Leave List Search Validation
Open chrome browser
Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login into the application
Select Leave List
Select from December 1, 2019 until January 31, 2020-->//img[@class='ui-datepicker-trigger']/tbody/tr/td
Check only Pending approval
Click on Search  input#btnSearch
Validate “No Records Found” is displayed  //table[@id='resultTable']     //td[text()='No Records Found']
Quit the browser
	 */
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Leave List")).click();
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		
		//List<WebElement> years=driver.findElements(By.cssSelector("select.ui-datepicker-year"));
		WebElement year=driver.findElement(By.cssSelector("select.ui-datepicker-year"));
		Select obj=new Select(year);
		obj.selectByVisibleText("2019");
		WebElement month=driver.findElement(By.cssSelector("select.ui-datepicker-month"));
		Select obj2=new Select(month);
		obj2.selectByIndex(11);
		
		List<WebElement>days=driver.findElements(By.xpath(("//table[@class='ui-datepicker-calendar']/tbody/tr/td")));
		
		for(WebElement day:days) {
			if(day.getText().equals("1")) {
				day.click();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@id='calToDate']")).click();
		WebElement year2=driver.findElement(By.cssSelector("select.ui-datepicker-year"));
		Select obj3=new Select(year2);
		obj3.selectByVisibleText("2020");
		WebElement month2=driver.findElement(By.cssSelector("select.ui-datepicker-month"));
		Select obj4=new Select(month2);
		obj4.selectByVisibleText("Jan");
		List<WebElement>days2=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement day:days2) {
			if(day.getText().equals("31")) {
				day.click();
				break;
			}
		}
		boolean isChecked=driver.findElement(By.xpath("//input[@value='1']")).isSelected();
		if(isChecked) {
			System.out.println("Pending Aproval button is selected");
		}
		else {
			System.out.println("Select Pending Aproval button");
		}
		driver.findElement(By.cssSelector("input#btnSearch")).click();
		String text=driver.findElement(By.xpath("//td[text()='No Records Found']")).getText();
		System.out.println(text);
		screenShot("flightshot");
		
		System.out.println("Done");
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	

}
