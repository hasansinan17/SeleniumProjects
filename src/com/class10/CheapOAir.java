package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class CheapOAir extends CommonMethods{
	/*
	 * departure date- june 2020 5    
	 * return  date october 20
	 */
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","https://www.expedia.com/");
		driver.findElement(By.xpath("//*[@id='package-origin-hp-package']")).sendKeys("atl");
		driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"package-destination-hp-package\"]")).sendKeys("ist");
		driver.findElement(By.xpath("//*[@id=\"aria-option-1\"]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"package-departing-hp-package\"]")).click();
//		String monthHeadR=driver.findElement(By.cssSelector("#package-returning-hp-package")).getText();
//		System.out.println(monthHeadR);
		//driver.findElement(By.xpath("//*[@id=\"package-departing-wrapper-hp-package\"]/div/div/div[2]/table/caption"));
		//driver.findElement(By.cssSelector("#package-returning-hp-package"));
		boolean found=false;
		while(!found) {
			String monthHeadR=driver.findElement(By.xpath("//*[@id=\"package-departing-wrapper-hp-package\"]/div/div/div[2]/table/caption")).getText();
			String monthHeadL=driver.findElement(By.cssSelector("#package-returning-hp-package")).getText();
			
			if(monthHeadR.contains("Jun")||monthHeadL.contains("Jun")) {
				found=true;
				System.out.println("Jun is found");
				break;
				
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"package-departing-wrapper-hp-package\"]/div/div/button[2]")).click();
		}
		Thread.sleep(2000);
		List<WebElement>days=driver.findElements(By.xpath("//*[@id=\"package-departing-wrapper-hp-package\"]/div/div/div[2]/table/tbody/tr/td"));
		System.out.println(days.size());
		
		for(WebElement day:days) {
			String value=day.getText();
			System.out.print(value+" ");
			if(value.contains("5")) {
				System.out.println("Jun "+value+" clicked");
				day.click();
				break;
				
				
				
			}
		}
		driver.findElement(By.xpath("//*[@id=\"package-returning-hp-package\"]")).click();
		boolean found2=false;
		while(!found2) {
			String monthHeadR=driver.findElement(By.xpath("//*[@id=\"package-returning-wrapper-hp-package\"]/div/div/div[2]/table/caption")).getText();
			String monthHeadL=driver.findElement(By.xpath("//*[@id=\"package-returning-wrapper-hp-package\"]/div/div/div[3]/table/caption")).getText();
			
			if(monthHeadR.contains("Oct")||monthHeadL.contains("Oct")) {
				found2=true;
				System.out.println("Oct is found");
				break;
				
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"package-returning-wrapper-hp-package\"]/div/div/div[3]/table/caption")).click();
		}
		List<WebElement>daysReturn=driver.findElements(By.xpath("//*[@id=\"package-returning-wrapper-hp-package\"]/div/div/div[3]/table/tbody/tr/td"));
		System.out.println(days.size());
		
		for(WebElement day:daysReturn) {
			String value=day.getText();
			System.out.print(value+" ");
			if(value.contains("5")) {
				day.click();
				System.out.println("Jun "+value+" clicked");
				Thread.sleep(3000);
				break;
		
	}

}
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#search-button-hp-package")).click();
}
}
