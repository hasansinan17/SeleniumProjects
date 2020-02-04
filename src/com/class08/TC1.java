package com.class08;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class TC1 extends CommonMethods {
	public static void main(String[] args) {
		
		/*
		 * TC 1: Table headers and rows verification

Open chrome browser
Go to “http://166.62.36.207/syntaxpractice/”
Click on “Table” link
Click on “ITable Data Search” link
Verify second table consist of 4 rows and 5 columns
Print name of all column headers 
Print data of all rows
Quit Browser
		 */
		setUp("chrome","http://166.62.36.207/syntaxpractice/");
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
		
		
	}

}
