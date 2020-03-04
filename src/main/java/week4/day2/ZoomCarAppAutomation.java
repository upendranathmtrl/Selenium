package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.struc.LinkedList;
public class ZoomCarAppAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = new ArrayList<Integer>();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//
		ChromeDriver driver = new ChromeDriver();
		//
		driver.manage().window().maximize();
		//
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//
		driver.get("https://www.zoomcar.com/chennai/");
		//
		driver.findElementByXPath("//a[@class='search']").click();
		//
		//driver.findElementByXPath("//input[@class='search']").sendKeys("Kodambakkam, Chennai, Tamil Nadu, India");
		driver.findElementByXPath("//div[contains(text(),'Kodambakkam')]").click();
		//
		driver.findElementByXPath("//button[@class='proceed']").click();
		//
		driver.findElementByXPath("//div[@class='day low-price'][1]").click();
		//
		driver.findElementByXPath("//button[@class='proceed']").click();
		//
		driver.findElementByXPath("//button[@class='proceed']").click();
		//
		 List<WebElement> priceclassElem = driver.findElementsByXPath("//div[@class='price']");
		 
		for (WebElement webElement : priceclassElem) {
			//getting get from the WebElement
			String rawPrice = webElement.getText();
			System.out.println(rawPrice);
			//Making all characters to empty except numbers 
			String croppedPrice = rawPrice.replaceAll("\\D", "");
			System.out.println(croppedPrice);
			int parsedInt = Integer.parseInt(croppedPrice);
			ls.add(parsedInt);
		}
		Collections.sort(ls);
		System.out.println("The lowest price of the car is :" + ls.get(0));
		
		
		
		
		
		
		
	}

}
