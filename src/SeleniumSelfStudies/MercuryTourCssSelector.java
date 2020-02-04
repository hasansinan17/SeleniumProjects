package SeleniumSelfStudies;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class MercuryTourCssSelector extends CommonMethods{
	final static String LINK="http://newtours.demoaut.com/";
	public static void main(String[] args) throws InterruptedException {
		/*xpath locator
		 *-->//tag[@attribute='value]-->//input[@id['hasan']
		 * -->//tag[text()='text']-->//input[text()='REGISTER']
		 * 
		 */
		CommonMethods.setUp("chrome", LINK);
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("sumeyra");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("kaptan");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("123-456-789");
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("sum@gmail.com");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sum@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("cimcime");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("cimcime");
		driver.findElement(By.cssSelector("input[name='register']")).click();
	

}
}