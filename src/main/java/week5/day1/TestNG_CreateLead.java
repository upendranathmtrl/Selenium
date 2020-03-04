package week5.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestNG_CreateLead extends ProjectSpecificMethods{
	@Test
	public void testng_create() {
				
				//
				driver.findElementByXPath("//a[text()='Create Lead']").click();
				//
				driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
				//
				driver.findElementById("createLeadForm_firstName").sendKeys("Upendranath");
				//
				driver.findElementById("createLeadForm_lastName").sendKeys("M");
				//
				driver.findElementById("createLeadForm_firstNameLocal").sendKeys("upendra");
				//
				driver.findElementById("createLeadForm_lastNameLocal").sendKeys("m");
				//
				driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
				//
				driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
				//
				WebElement dataSourceId = driver.findElementById("createLeadForm_dataSourceId");
				Select aSelect = new Select(dataSourceId);
				aSelect.selectByValue("LEAD_EMPLOYEE");
				//
				driver.findElementById("createLeadForm_generalProfTitle").sendKeys("My Profile");
				//
				driver.findElementById("createLeadForm_annualRevenue").sendKeys("200000");
				//
				driver.findElementById("createLeadForm_annualRevenue").sendKeys("200000");
				//
				WebElement industryEnumId = driver.findElementById("createLeadForm_industryEnumId");
				Select aSelect1 = new Select(industryEnumId);
				aSelect1.selectByValue("IND_SOFTWARE");
				//
				WebElement ownershipEnumId = driver.findElementById("createLeadForm_ownershipEnumId");
				Select aSelect2 = new Select(ownershipEnumId);
				aSelect2.selectByValue("OWN_CCORP");
				//
				driver.findElementById("createLeadForm_sicCode").sendKeys("345667");
				//
				driver.findElementById("createLeadForm_description").sendKeys("Working in IT");
				//
				driver.findElementById("createLeadForm_importantNote").sendKeys("Selenium Test Automation");
				//
				driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
				//
				driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
				//
				driver.findElementById("createLeadForm_departmentName").sendKeys("Testing");
				//
				WebElement currencyUomId = driver.findElementById("createLeadForm_currencyUomId");
				Select aSelect3 = new Select(currencyUomId);
				aSelect3.selectByValue("INR");
				//
				driver.findElementById("createLeadForm_numberEmployees").sendKeys("62");
				//
				driver.findElementById("createLeadForm_tickerSymbol").sendKeys("KLSC:MGRC");
				//
				driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Suresh");
				//
				driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.leaftaps.com");
				//
				driver.findElementById("createLeadForm_generalToName").sendKeys("leaftaps");
				//
				driver.findElementById("createLeadForm_generalAddress1").sendKeys("56, KK street");
				//
				driver.findElementById("createLeadForm_generalAddress2").sendKeys("RG Nagar");
				//
				driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
				//
				WebElement generalCountryGeoId = driver.findElementById("createLeadForm_generalCountryGeoId");
				Select aSelect5 = new Select(generalCountryGeoId);
				aSelect5.selectByValue("IND");
				//
				WebElement generalStateProvinceGeoId = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
				Select aSelect4 = new Select(generalStateProvinceGeoId);
				aSelect4.selectByValue("IN-TN");
				//
				driver.findElementById("createLeadForm_generalPostalCode").sendKeys("709876");
				//
				driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("001");
				//
				WebElement marketingCampaignId = driver.findElementById("createLeadForm_marketingCampaignId");
				Select aSelect6 = new Select(marketingCampaignId);
				aSelect6.selectByValue("CATRQ_AUTOMOBILE");
				//
				driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("7685748292");
				//
				driver.findElementById("createLeadForm_primaryEmail").sendKeys("upendra.innov@gmail.com");
				//
				driver.findElementByXPath("//input[@value='Create Lead']").click();
				//
				WebElement viewLead_firstName_spElemID = driver.findElementById("viewLead_firstName_sp");
				if(viewLead_firstName_spElemID.getText().equals("Upendranath"))
					System.out.println("The First name is verified to be true as given");
				else
					System.out.println("The First name is false and does not match as given");				
	}

}
