package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class HWDragAndDrop extends CommonMethods  {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: Drag and Drop verification1.Open chrome browser2.Go to “https://jqueryui.com/”
		 * 3.Click on “Droppable” link
		 * 4.Using mouse drag “Drag me to my target” to the “Drop Here”5.Close the browser
		 */
		setUp("chrome","https://jqueryui.com/");
		driver.findElement(By.linkText("Droppable")).click();
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(drag, drop).build().perform();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		try {
			FileUtils.copyFile(screen,new File("screenshots/HRMS/draganddrop.png"));
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		
		
		
		
		
		driver.quit();
		
		
		
		
	}

}
