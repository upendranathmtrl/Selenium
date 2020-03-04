package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DQ_LearnWindowHandleOpenParentOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//
		ChromeDriver driver = new ChromeDriver();
		// to maximize the window
		driver.manage().window().maximize();
		// to wait for some time if the element is not avaible
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// loading url
		driver.get("https://irctc.co.in/eticketing/loginHome.jsf");
		// clicking login button
		driver.findElementByXPath("//span[text()='AGENT LOGIN']").click();
		// clicking contact us button
		driver.findElementByXPath("//a[text()='Contact Us']").click();
		//getting the title of parent page
		String parentPageID = driver.getWindowHandle();
		System.out.println(parentPageID);
		String parentPageTitle = driver.switchTo().window(parentPageID).getTitle();
		// Selenium Collects all the windows in the current session and allocates unique
		// alphanumeric ID to them
		Set<String> windowHandles = driver.getWindowHandles();
		// Items are copied to list to make use of get function
		List<String> ls = new ArrayList<String>(windowHandles);
		// Get the set of windows using getWindowHandles method

		for (String string : ls) {
			// using the title of the page as reference, parent window is kept open
			if (driver.switchTo().window(string).getTitle().equals( parentPageTitle )) {
				// Switching to the desired parent window
				driver.switchTo().window(string);

			} else {
				// Switching to the desired window to be closed
				driver.switchTo().window(string);
				// closing the window
				driver.close();
			}

		}

	}
}
