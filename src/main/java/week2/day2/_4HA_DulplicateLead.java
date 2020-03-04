package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _4HA_DulplicateLead {

	public static void main(String[] args) {
		String leadID = "";
		// To set the driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_78.exe");
		// To launch chrome
		ChromeDriver driver = new ChromeDriver();
		// To maximize the browser
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// To load URL
		driver.get("http://leaftaps.com/opentaps");
		// Entering username
		driver.findElementById("username").sendKeys("demosalesmanager");
		// Entering password
		driver.findElementById("password").sendKeys("crmsfa", Keys.ENTER);
		//
		driver.findElementByLinkText("CRM/SFA").click();
		//
		driver.findElement(By.linkText("Leads")).click();
		//
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		//
		driver.findElementByXPath("//span[text()='Email']").click();
		//
		driver.findElement(By.name("emailAddress")).sendKeys("lakshmiviji10192@gmail.com");
		//
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//
		//WebElement tableFirstNameEle = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a");
		WebElement tableFirstNameEle = driver.findElementByLinkText("Viji");
		//
		String firstName = tableFirstNameEle.getText();
		System.out.println(tableFirstNameEle.getTagName());
		System.out.println(firstName);
		//
		Actions actions = new Actions(driver);
		actions.moveToElement(tableFirstNameEle).click().perform();
		
		//
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		//
		WebElement webTitleId = driver.findElementById("sectionHeaderTitle_leads");
		
		if(webTitleId.getText().equals("Duplicate Lead"))
			System.out.println("The Title is verified as Duplicate Lead");
		else
			System.out.println("The Title is verified not to be as Duplicate Lead");
		
		driver.findElementByName("submitButton").click();
		//
		WebElement createdFirstNameEle = driver.findElementById("viewLead_firstName_sp");
		//
		if(createdFirstNameEle.getText().equals(firstName))
			System.out.println("The Dulplicate lead name is same as captured name");
		else
			System.out.println("The Dulplicate lead name is not the same as captured name");
		
		
		
		
		
		
		
		
		
		
	}
}