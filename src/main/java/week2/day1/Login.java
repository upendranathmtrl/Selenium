package week2.day1;

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
		driver.findElementByLinkText("Create Lead").click();
		//Sending CompanyName to browser
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		//Sending First Name to browser
		driver.findElementById("createLeadForm_firstName").sendKeys("Upendranath");
		//Sending Surname to browser
		driver.findElementById("createLeadForm_lastName").sendKeys("M");
		//Clicking createlead button
		driver.findElementById("ext-gen609").click();
	}

}
