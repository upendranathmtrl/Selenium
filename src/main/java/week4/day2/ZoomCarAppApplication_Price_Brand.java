package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCarAppApplication_Price_Brand {
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
		List<WebElement> priceclassElems = driver.findElementsByXPath("//div[@class='price']");
		int size = priceclassElems.size();
		for(int index=1; index<=size; index++) {
			WebElement priceclassElem = driver.findElementByXPath("//div[@class='price']["+index+"]");
			
		}
		 
	}		 
}
