package SeleniumSelfStudies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utils.CommonMethods;

public class SyntaxPageNavigate extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zillow.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		String url=driver.getCurrentUrl();
		System.out.println(url.contains("Zillow"));
		
	}

}
