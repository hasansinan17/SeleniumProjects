package SeleniumSelfStudies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class SwitchWindow extends CommonMethods {
	final static String TOOLSQA_LINK="http://toolsqa.com/automation-practice-switch-windows/";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", TOOLSQA_LINK);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String windowId=driver.getWindowHandle();
		String mainWindow=driver.getTitle();
		System.out.println("Title of main window is "+mainWindow+" and ID is "+windowId);
		
		driver.findElement(By.cssSelector("button[id='button1']")).click();
		
	}

}
