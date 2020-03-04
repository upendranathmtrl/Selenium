package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ops);
		//
		driver.manage().window().maximize();
		//
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		//
		driver.get("https://www.facebook.com");
		//
		driver.findElementById("email").sendKeys("insightarea53@gmail.com");
		//
		driver.findElementById("pass").sendKeys("29insight53");
		//
		driver.findElementByXPath("//input[@value='Log In']").click();
		//
		driver.findElementByXPath("//input[@class='_1frb']").sendKeys("TestLeaf");
		//
		driver.findElementByXPath("//i[@class='_585_']").click();
		//
		try {
			WebElement testleafPageEle = driver.findElementByXPath("(//a[text()='TestLeaf'])[1]");
			System.out.println("Verification: Facebook page "+ testleafPageEle.getText() + " is visible");
			
		}
		catch (Exception e) {
		    System.out.println("Verification: The TestLeaf facebook page is not available");
		}
		
		try {
			WebElement likeEleById = driver.findElementByXPath("//button[text()='Like']");
			likeEleById.click();
			System.out.println("TestLeaf page has been liked");
		}
		catch (Exception e) {
			System.out.println("TestLeaf is already liked");
			//WebElement unLikeEleById = driver.findElementById("u_1r_4");
			
		}
		
		WebElement testleafPageEle = driver.findElementByXPath("(//a[text()='TestLeaf'])[1]");
		testleafPageEle.click();
		
		WebElement titleOfPageEle = driver.findElementByXPath("//a[@class='_64-f']//child::span");
		if(titleOfPageEle.getText().contains("TestLeaf"))
		System.out.println("The Title contains :" +titleOfPageEle.getText());
		else
		System.out.println("The Title does not contains TestLeaf");
		
		WebElement pageLikeCountEle = driver.findElementByXPath("//div[contains(text(),'people like this')]");
		System.out.println(pageLikeCountEle.getText());
		
		
	}
}
