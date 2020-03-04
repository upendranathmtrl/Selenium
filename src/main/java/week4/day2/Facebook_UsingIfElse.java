package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook_UsingIfElse {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		// to launch Chrome browser.
		ChromeDriver driver = new ChromeDriver(ops);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// open facebook.com
		driver.get("https://www.facebook.com/");

		// login with user name and password
		driver.findElement(By.xpath("//input[@id ='email']")).sendKeys("8778523256");
		driver.findElement(By.xpath("//input[@id ='pass']")).sendKeys("wqewewe");

		// clicking login button
		driver.findElement(By.xpath("//input[@value=\'Log In\']")).click();

		// Search box
		WebElement searchButton = driver.findElementByName("q");
		searchButton.sendKeys("TestLeaf");

		// Clicking search button
		driver.findElementByXPath("//button[@data-testid='facebar_search_button']").click();

		// checking the link name
		WebElement testleafPageEle = driver.findElementByXPath("(//a[text()='TestLeaf'])[1]");
		String pageLinkName = testleafPageEle.getText();
		if (pageLinkName.contains("TestLeaf")) {
			System.out.println("Verification: Facebook page " + testleafPageEle.getText() + " is visible");
		} else
			System.out.println("Verification: The TestLeaf facebook page is not available");

		
		// Checking like button
		WebElement likebutton = driver.findElementByXPath("(//button[@type ='submit'])[2]");
		String LB = likebutton.getText();
		if (LB.equals("Like")) {
			likebutton.click();
			System.out.println("TestLeaf page is liked");
		} else
			System.out.println("TestLeaf page is already liked");

		// clicking the link
		testleafPageEle.click();

		//Verifying the title of the page after entering inside
		WebElement titleOfPageEle = driver.findElementByXPath("//a[@class='_64-f']//child::span");
		if (titleOfPageEle.getText().contains("TestLeaf"))
			System.out.println("The Title contains :" + titleOfPageEle.getText());
		else
			System.out.println("The Title does not contains TestLeaf");

		// Getting the no. of likes
		WebElement Likes = driver.findElementByXPath("//div[contains(text(),'people like this')]");
		System.out.println(Likes.getText());
	}
}
