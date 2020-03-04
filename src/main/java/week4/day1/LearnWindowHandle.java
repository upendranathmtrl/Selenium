package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//
		ChromeDriver driver = new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to wait for some time if the element is not avaible
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//loading url
		driver.get("https://irctc.co.in/eticketing/loginHome.jsf");
		//clicking login button
		driver.findElementByXPath("//span[text()='AGENT LOGIN']").click();
		//clicking contact us button
		driver.findElementByXPath("//a[text()='Contact Us']").click();
		//Selenium Collects all the windows in the current session and allocates unique ID to them
		Set<String> windowHandles = driver.getWindowHandles();
		//Items are copied to list to make use of get function
		List<String> ls = new ArrayList<String>(windowHandles);
		//If have only two window we get it directly
		//System.out.println(driver.switchTo().window(ls.get(1)).getTitle());
		//To find the required tab using the title of the tab
		for (String string : ls) {
		System.out.println(string);
			if(driver.switchTo().window(string).getTitle().equals("Contact Us")) {
				System.out.println("The window 2 unique ID for this session is :" + string);
				driver.switchTo().window(string);	
			}
		}
		//print window 2 title
		System.out.println("Window 2 :"+ driver.getTitle());
		//switch to window 1
		driver.switchTo().window(ls.get(0));
		//closing only window 1
		driver.close();
		
	}

}
