package SeleniumSelfStudies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class FacebookDropdownVerfy extends CommonMethods {
	final static String LINK="http://www.facebook.com";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", LINK);
		
		WebElement dropDownMonth=driver.findElement(By.cssSelector("select#month"));
		Select month=new Select(dropDownMonth);
		month.selectByVisibleText("Mar");
		List<WebElement>months=month.getOptions();
		
		int sizeMonths=months.size();
		System.out.println(sizeMonths);
		
		
		WebElement dropDownDay=driver.findElement(By.cssSelector("select#day"));
		Select day=new Select(dropDownDay);
		day.selectByIndex(11);
		List<WebElement>days=day.getOptions();
		int sizeDays=days.size();
		System.out.println(sizeDays);
		
		WebElement dropDownYear=driver.findElement(By.cssSelector("select#year"));
		Select year=new Select(dropDownYear);
		year.selectByVisibleText("1982");
		List<WebElement>years=year.getOptions();
		System.out.println(years.size());
		
		driver.quit();
		
		
		
	
		
	}

}
