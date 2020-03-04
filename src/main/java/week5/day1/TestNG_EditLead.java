package week5.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_EditLead extends ProjectSpecificMethods {
	@Test
	public void test_edit() {
		
	
	WebElement LeadTab = driver.findElementByXPath("//a[text()='Leads']");
	           LeadTab.click();
    WebElement FindLeads = driver.findElementByXPath("//a[text()='Find Leads']");
	           FindLeads.click();
	 
	WebElement FirstName = driver.findElementByXPath("//input[@id='ext-gen248']");
	           FirstName.sendKeys("Upendranath");
	 //Thread.sleep(3000);          
	           
	WebElement FindLeadsButton = driver.findElementByXPath("//button[text()='Find Leads']");
	           FindLeadsButton.click();  
	         
	WebElement FirstResultingLead = driver.findElementByXPath("//a[text()='Upendranath']");
	         FirstResultingLead.click();
	
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
	System.out.println("Changed the company name to HCL");
	
	WebElement UpdateButton = driver.findElementByXPath("//input[@value='Update']");
	           UpdateButton.click();
	}
}
