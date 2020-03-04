package week5.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	ChromeDriver driver;
	@Parameters({"url","username","password"})      //static dependency, note annotation has "s"
	@BeforeMethod
	public void startApp(String url, String un, String pass) {             //static dependency
		// To set the driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        // To launch chrome
		driver = new ChromeDriver();
		//To maximize the browser
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//To load URL
		driver.get(url);             //static dependency
		//Entering username
		driver.findElementById("username").sendKeys(un);      //static dependency
		//Entering password
		driver.findElementById("password").sendKeys(pass,Keys.ENTER);       //static dependency
		//
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
}
