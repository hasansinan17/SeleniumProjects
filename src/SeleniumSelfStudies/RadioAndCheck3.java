package SeleniumSelfStudies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class RadioAndCheck3 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","https://www.toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		List<WebElement>expButtons=driver.findElements(By.name("exp"));
		System.out.println(expButtons.size());
		
		Thread.sleep(3000);
		
		for(WebElement button:expButtons) {
			if(button.isEnabled()) {
				Thread.sleep(3000);
				String text=button.getAttribute("value");
				System.out.println(text);
				
			}
			else {
				System.out.println("no enabled button");
			}
			
			
			
			
		}
		List<WebElement>autoTools=driver.findElements(By.name("tool"));
		for(WebElement tool:autoTools) {
			if(tool.isEnabled()) {
				
				String value=tool.getAttribute("value");
				System.out.println(value);
				if(value.equals("Selenium Webdriver")) {
					tool.click();
				}
				
			}
			else {
				System.out.println("no enabled tool button");
			}
		}
		
		
		
	}

}
