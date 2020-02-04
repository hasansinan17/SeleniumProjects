package SeleniumSelfStudies;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class MercuryTourXPath extends CommonMethods {
	final static String LINK="http://newtours.demoaut.com/";
	public static void main(String[] args) throws InterruptedException {
		/*xpath locator
		 *-->//tag[@attribute='value]-->//input[@id['hasan']
		 * -->//tag[text()='text']-->//input[text()='REGISTER']
		 * 
		 */
		CommonMethods.setUp("chrome", LINK);
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("sumeyra");
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("kaptan");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123-456-789");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("sum@gmail.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sum@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("cimcime");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("cimcime");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		
	}

}
