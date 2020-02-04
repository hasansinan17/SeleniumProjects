package SeleniumSelfStudies;

import com.utils.CommonMethods;

public class AmazonTitleVerification extends CommonMethods {
	final static String LINK="https://www.amazon.com";
	public static void main(String[] args) throws InterruptedException  {
		
		CommonMethods.setUp("chrome", LINK);
		driver.get(LINK);
		String actualTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		String expectedTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title is verified");
		}
		else {
			System.out.println("Title is NOT verified");
		}
		
		
	}

}
