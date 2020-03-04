package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//
public class FindDropDownAndSelectLastOption {
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
		 WebElement findElement2 = driver.findElementByName("dropdown2");
		//Find size of allSelectTagName
		Select sc = new Select(findElement2);
		//sc.selectByIndex(1);
		List<WebElement> options = sc.getOptions();
		//Getting the no. of options
		int size = options.size();
		//Printing the no. of options
		System.out.println(size);
		//Getting the last option from the options object
		WebElement webElement = options.get(size-1);
		//Printing the text of the last last option tag
		System.out.println(webElement.getText());
		
		
	}

}

/*for (int i = 0; i < size; i++) {
			WebElement webElementSelectTag1 = allSelectTagName.get(i);
			webElementSelectTag1.sendKeys("Selenium");
		}*/
