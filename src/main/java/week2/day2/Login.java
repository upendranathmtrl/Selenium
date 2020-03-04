package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//
public class Login {
	public static void main(String[] args) {
		//To set the driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//To launch Chrome
		ChromeDriver driver = new ChromeDriver();
		//To maximize the browser
		driver.manage().window().maximize();
		//To load URL
		driver.get("http://leaftaps.com/opentaps");
		//Find the username
		WebElement eleUsername = driver.findElementById("username");
		//Sending username to browser
		eleUsername.sendKeys("demosalesmanager");
		//Sending password to browser
		driver.findElementById("password").sendKeys("crmsfa");
		//Clicking button
		driver.findElementByClassName("decorativeSubmit").click();
		//Clicking linkText
		driver.findElementByLinkText("CRM/SFA").click();
		//Clicking link
		driver.findElementByLinkText("Leads").click();
		//Clicking on find leads
		driver.findElementByClassName("selected").click();
		//Clicking Phone tab
		driver.findElementByClassName("x-tab-strip-text ").click();
		//Sending keys to the text box
		driver.findElementByClassName(" x-form-text x-form-field ").sendKeys("123");
		//Clicking find leads
		driver.findElementByClassName("x-btn-text").click();
		//Clicking the first link 
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
	}
}
