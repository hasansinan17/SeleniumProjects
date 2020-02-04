package SeleniumSelfStudies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class RadioDemo extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		setUp("Chrome","https://www.facebook.com/");
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement femaleRadButton=driver.findElement(By.cssSelector("input#u_0_9"));
		femaleRadButton.isDisplayed();
		femaleRadButton.isEnabled();
		femaleRadButton.isSelected();
		System.out.println(femaleRadButton.isDisplayed());
		System.out.println(femaleRadButton.isEnabled());
		System.out.println(femaleRadButton.isSelected());
		femaleRadButton.click();
		Thread.sleep(2000);
		System.out.println(femaleRadButton.isSelected());
		
		//2 way preferredway
		
		
		
		
	}

}
