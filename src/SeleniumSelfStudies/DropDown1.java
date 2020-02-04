package SeleniumSelfStudies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDown1 extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement dd=driver.findElement(By.id("continents"));
		Select conti=new Select(dd);
		conti.selectByIndex(2);
		Thread.sleep(2000);
		conti.selectByValue("AUS");
		Thread.sleep(2000);
		conti.selectByVisibleText("Antarctica");
		
		List<WebElement>allOptions=conti.getOptions();
		System.out.println(allOptions.size());
		for(WebElement option:allOptions) {
			System.out.println(option.getText());
			
		}
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		 
	}

}
