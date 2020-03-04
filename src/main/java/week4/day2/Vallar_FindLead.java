package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vallar_FindLead {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		    driver.get("http://leaftaps.com/opentaps");
    WebElement UserName = driver.findElementById("username");
		       UserName.sendKeys("demosalesmanager");
    WebElement Password = driver.findElementById("password");
               Password.sendKeys("crmsfa"+ Keys.ENTER);
   WebElement Login = driver.findElementByXPath("//*[@id='button']/a/img");
		      Login.click(); 
		
	WebElement LeadTab = driver.findElementByXPath("//a[text()='Leads']");
	          LeadTab.click();
    WebElement FindLeads = driver.findElementByXPath("//a[text()='Find Leads']");
	           FindLeads.click();
		     // driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
		    //  driver.findElementByXPath("//a[text()='Find Leads']").click();
	           
	 Thread.sleep(3000);
	 
	WebElement FirstName = driver.findElementByXPath("//input[@id='ext-gen248']");
	           FirstName.sendKeys("Vallarmathi");
	 Thread.sleep(3000);          
	           
	WebElement FindLeadsButton = driver.findElementByXPath("//button[text()='Find Leads']");
	           FindLeadsButton.click();  
	 Thread.sleep(3000);          
	//WebElement FirstResultingLead = driver.findElementByXPath("//a[text()='10050']");
	          // FirstResultingLead.click();
	 driver.findElementByXPath("//a[text()='10050']").click();
	 
	//WebElement Title = driver.findElementById("//span[text()='Manager']");
	 WebElement Title = driver.findElementById("viewLead_generalProfTitle_sp");
	           String verifyTitle = Title.getText();
	           
	           if (verifyTitle.contains("Manager")) {
	        	   System.out.println("verified the title");
	           }
	           else
	           {
	        	   System.out.println("Not Verified");
	           }
	        	   
	WebElement EditButton = driver.findElementByXPath("//a[text()='Edit']");
           	   EditButton.click();
	WebElement CompanyName = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']");
	           CompanyName.clear();
	           CompanyName.sendKeys("HCL");
	System.out.println("Changed the company name to:" + CompanyName.getText());
	System.out.println("Changed the company name to: HCL");
	
	WebElement UpdateButton = driver.findElementByXPath("//input[@value='Update']");
	           UpdateButton.click();
	}
}