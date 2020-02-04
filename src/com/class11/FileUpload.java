package com.class11;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class FileUpload extends CommonMethods {
	public static void main(String[] args) {
		
		setUp("chrome","https://the-internet.herokuapp.com/upload");
		//send file to choose files
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\sinan\\Desktop\\dragAndDrop.png");
		driver.findElement(By.id("file-submit")).click();
		String text=driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).getText();
		if(text.contains("Uploaded!")) {
			System.out.println("File successfully uploaded");
		}
		else {
			System.out.println("File is not uploaded");
		}
		
		
		
		
	}

}
