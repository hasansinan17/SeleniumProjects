package SeleniumSelfStudies;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class SelectAndDeselect extends CommonMethods {
	/*TC 2: Select and Deselect values
	 * 5.Open chrome browser
	 * 6.Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
	 * 7.Click on “Input Forms” links
	 * 8.Click on “Select Dropdown List” links
	 * 9.Select value from “Select List Demo” section
	 * 
	 * 10.Verify value has been selected
	 * 
	 * 11.	 * Select 4 options from “Multi Select List Demo”

	 * 12.Deselect 1 of the option from the dd
	 * 13.Quit browser
	 * 
	 */
	final static String LINK="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", LINK);
		//6) Go to website
		driver.get(LINK);
		//7)Click input Form Links
		driver.findElement(By.id("Input Forms")).click();
		//8) Select Dropdown List
		
		//9)Select value from "Select List Demo" section
		
		//10)Verify value has been selected
		
		//11)select 4 oprions from "Multi Select List DEmo"
		
		//12) Deselect 1 of the option from the dd
		
		//13)Quit Browser
		
	}

}
