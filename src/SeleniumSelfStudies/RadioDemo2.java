package SeleniumSelfStudies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class RadioDemo2 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement>listOfProfession=driver.findElements(By.name("tool"));
		System.out.println(listOfProfession.size());
		Thread.sleep(2000);
		for(WebElement profession:listOfProfession) {
			
			String text=profession.getAttribute("value");
			System.out.println(text);
			if(text.equals("Selenium Webdriver")||text.equals("QTP")) {
				Thread.sleep(3000);
				profession.click();
			}
			
		}
		Thread.sleep(4000);
		driver.quit();
		
		
		
		
		
	}

}
