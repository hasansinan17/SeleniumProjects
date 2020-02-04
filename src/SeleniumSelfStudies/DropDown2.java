package SeleniumSelfStudies;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDown2 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ddMulti=driver.findElement(By.id("selenium_commands"));
		Select command=new Select(ddMulti);
		
		command.selectByIndex(1);
		
		command.selectByVisibleText("Wait Commands");
		
		List<WebElement>allOptions=command.getOptions();
		System.out.println(allOptions.size());
		
		Iterator<WebElement>option=allOptions.iterator();
		while(option.hasNext()) {
			String value=option.next().getText();
			System.out.println(value);
		}
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}

}
