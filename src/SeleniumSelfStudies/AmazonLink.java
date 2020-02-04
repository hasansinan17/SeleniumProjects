package SeleniumSelfStudies;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class AmazonLink extends CommonMethods {
	final static String  AMAZON_LINK="https://www.amazon.com/";
	public static void main(String[] args) {
		CommonMethods.setUp("chrome", AMAZON_LINK);
		driver.manage().window().fullscreen();
		//find elements by tagname
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		int count=0;
		
		Iterator<WebElement>nameOfLinks=links.iterator();
		while(nameOfLinks.hasNext()) {
			String link=nameOfLinks.next().getText();
			if(!link.isEmpty()) {
				System.out.println(link);
				count++;
			}
			
			
			
			
			
		}
		System.out.println("Total number of links with text: "+count);
		driver.quit();
		
		
	}
	

}
