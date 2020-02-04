package com.class09;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class HW1 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException  {
		//TC 1: Delete Employee
		//Open chrome browser
		//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
		//Login into the application
		//Add Employee
		//Verify Employee has been added-->//input[@value=''], //input[@value='']
		//Go to Employee List-->linkText("Employee List"),-->//table[@id='resultTable']
		//Delete added Employee-->input#btnDelete
		//Quit the browser
		
		setUp("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add Employee")));
		driver.findElement(By.linkText("Add Employee")).click();
		
		WebDriverWait wait1=new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#firstName")));
		String name="John";
		String lname="Connery";
		WebElement firstName=driver.findElement(By.cssSelector("input#firstName"));
		firstName.sendKeys(name);
		WebElement lastName=driver.findElement(By.cssSelector("input#lastName"));
		lastName.sendKeys(lname);
		
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		String fName=driver.findElement(By.xpath("//input[@title='First Name']")).getAttribute("value");
		String lName=driver.findElement(By.xpath("//input[@title='Last Name']")).getAttribute("value");
		if(fName.equals(name)&&lName.equals(lname)) {
			System.out.println("Employee is added correct!!");
		}
		else {
			System.out.println("Employee name is incorrect and check your code again ");
		}
		driver.findElement(By.linkText("Employee List")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='resultTable']/tbody/tr")));
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		System.out.println(rows.size());
		String expectedText=lname;
		
		for(int i=1; i<=rows.size(); i++) {
			String rowText=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]")).getText();
			
			//System.out.println(rowText);
			if(rowText.contains(expectedText)) {
				System.out.println(rowText);
				driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]")).click();
				System.out.println(expectedText+" clicked");
				
				break;
	}
			
			
				
			

}
		WebElement dltBttn=driver.findElement(By.cssSelector("input#btnDelete"));
		dltBttn.click();
		driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Welcome Syntax")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screen,new File("screenshots/HRMS/NoRecords.png"));
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		
		driver.quit();
}
}
