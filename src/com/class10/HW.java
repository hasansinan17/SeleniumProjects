package com.class10;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class HW extends CommonMethods {
	/*
	 * Open chrome browser Go to “https://www.aa.com/homePage.do” Enter From and To
	 * Select departure as May 14 of 2020 Select returns as November 8 of 2020
	 * Verify “Choose flights” text is displayed Take s screenshot of the results
	 * Close browser
	 */
	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", "https://www.aa.com/homePage.do");
		String departure = "atl";
		String arrival = "ist";

		driver.findElement(By.xpath("//input[@name='originAirport']")).clear();
		driver.findElement(By.xpath("//input[@name='originAirport']")).sendKeys(departure);
		driver.findElement(By.xpath("//input[@name='destinationAirport']")).sendKeys(arrival);
		driver.findElement(By.xpath("//input[@name='departDate']")).click();
		// String
		// monthTextL=driver.findElement(By.cssSelector("div[class$='corner-left']")).getText();
		// String
		// monthTextR=driver.findElement(By.cssSelector("div[class$='corner-right']")).getText();
		// System.out.println(monthTextL);
		// System.out.println(monthTextR);
		boolean foundDepM = false;
		while (!foundDepM) {
			String monthTextL = driver.findElement(By.cssSelector("div[class$='corner-left']")).getText();
			String monthTextR = driver.findElement(By.cssSelector("div[class$='corner-right']")).getText();

			if (monthTextL.contains("May 2020") || monthTextR.contains("May 2020")) {

				foundDepM = true;
				System.out.println("May is found");
				break;

			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}

		List<WebElement> days = driver
				.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr/td"));
		for (WebElement day : days) {
			String dayNum = day.getText();
			if (dayNum.equals("14")) {
				day.click();
				System.out.println("May 14 is clicked");
				break;
			}

		}

		driver.findElement(By.xpath("//input[@name='returnDate']")).click();
		boolean foundRtrnM = false;
		while (!foundRtrnM) {
			String monthTextL = driver.findElement(By.cssSelector("div[class$='corner-left']")).getText();
			String monthTextR = driver.findElement(By.cssSelector("div[class$='corner-right']")).getText();
			if (monthTextL.contains("November 2020") || monthTextR.contains("November 2020")) {
				foundRtrnM = true;
				System.out.println("November is found");
				break;
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		List<WebElement> daysOfReturn = driver
				.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr/td"));
		for (WebElement day : daysOfReturn) {
			String dayNum = day.getText();
			if (dayNum.contentEquals("8")) {
				day.click();
				System.out.println("November 8 is clicked");
				break;
			}
		}
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screen = ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		try {
			FileUtils.copyFile(screen, new File("screenshots/HRMS/searchflight.png"));
		} catch (IOException e) {
			e.printStackTrace();

		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
	}
}
