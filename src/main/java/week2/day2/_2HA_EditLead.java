package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2HA_EditLead {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_78.exe");
		//
		ChromeDriver driver = new ChromeDriver();
		//
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//
		driver.get("http://leaftaps.com/opentaps");
		//Entering username
		driver.findElementById("username").sendKeys("demosalesmanager");
		//Entering password
		driver.findElementById("password").sendKeys("crmsfa",Keys.ENTER);
		//
		driver.findElementByLinkText("CRM/SFA").click();
		//
		driver.findElementByXPath("//a[text()='Leads']").click();
		//
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		//
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Upendranath");
		//
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		 //
		driver.findElementByXPath("//a[text()='Upendranath']").click();
		//
		WebElement Title = driver.findElementById("viewLead_generalProfTitle_sp");
        String verifyTitle = Title.getText();
        
        if (verifyTitle.contains("My Profile")) {
     	   System.out.println("verified the title");
        }
        else
        {
     	   System.out.println("Not Verified");
        }
        //
        driver.findElementByXPath("//a[text()='Edit']").click();
        //
        WebElement CompanyName = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']");
        CompanyName.clear();
        CompanyName.sendKeys("HCL");
        System.out.println("Changed the company name to HCL");
        //
        driver.findElementByXPath("//input[@value='Update']").click();


        
        
        
        
        
        
        

	}
}
