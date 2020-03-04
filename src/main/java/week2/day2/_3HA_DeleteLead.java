package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _3HA_DeleteLead {
	public static RemoteWebDriver driver;
	public static WebDriverWait wait;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		String leadID ="";
		// To set the driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_78.exe");
        // To launch chrome
		ChromeDriver driver = new ChromeDriver();
		//To maximize the browser
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//To load URL
		driver.get("http://leaftaps.com/opentaps");
		//Entering username
		driver.findElementById("username").sendKeys("demosalesmanager");
		//Entering password
		driver.findElementById("password").sendKeys("crmsfa",Keys.ENTER);
		//
		driver.findElementByLinkText("CRM/SFA").click();
		//
		driver.findElement(By.linkText("Leads")).click();
		//
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		//
		driver.findElementByXPath("//span[text()='Phone']").click();
		//
		driver.findElement(By.name("phoneNumber")).sendKeys("1");
		//
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//
		WebElement ele = driver.findElement(By.xpath("(//div[contains(@class, 'x-grid3-col-partyId')]//a)[1]"));
		//
		WebElement ele1 = driver.findElement(By.xpath("//button[text()='Find Leads']"));

		System.out.println(ele.getText());
		try {
			//wait = new WebDriverWait(driver, 200);
			//wait.until(ExpectedConditions.elementToBeClickable(ele));
			System.out.println("The Element "+ele+" clicked : pass");
			ele.click();
		} catch (StaleElementReferenceException e) {
			System.out.println("The Element "+ele+" could not be clicked fail");
			throw new RuntimeException();
		}catch(Exception e) {
			System.err.println(e);
		}
		//driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
		
		//
		//driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		//List<WebElement> rowEles = tableEle.findElements(By.tagName("tr"));
		//
		
				
		
		/*leadID = aLink.getText();
			System.out.println("The ID of the first lead is" + leadID);
			Actions actions = new Actions(driver);
			actions.moveToElement(aLink).click().build().perform();
			//aLink.click();
			System.out.println();
			//break;
		 */			
		//
		driver.findElementByXPath("(//a[@class='subMenuButtonDangerous'])").click();
		//
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//
		driver.findElement(By.xpath("(//input[@class=' x-form-text x-form-field ']")).sendKeys(leadID);
		//
		driver.findElementByXPath("//button[@class='x-btn-text']").click();
	}
}
