package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//
public class FindDropDown {
	public static void main(String[] args) {
		//To set the driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//To launch Chrome
		ChromeDriver driver = new ChromeDriver();
		//To maximize the browser
		driver.manage().window().maximize();
		//To load URL
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		//Finding the no. of dropdowns in the page
		List<WebElement> allSelectTagName = driver.findElementsByTagName("select");
		//Find size of allSelectTagName
		int size = allSelectTagName.size();
		//Printing size
		System.out.println("The Number of select Tag in the webpage is :" + size);
		//Selecting first select tag
		WebElement webElementSelectTag1 = allSelectTagName.get(0);
		//Selecting Selenium option in 1st select tag
		webElementSelectTag1.sendKeys("Selenium");
		
	}

}

/*for (int i = 0; i < size; i++) {
			WebElement webElementSelectTag1 = allSelectTagName.get(i);
			webElementSelectTag1.sendKeys("Selenium");
		}*/
