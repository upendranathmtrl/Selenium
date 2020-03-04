package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonSiteXpath {
	public static void main(String[] args) {
		//To set the driver
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				//To launch Chrome
				ChromeDriver driver = new ChromeDriver();
				//To maximize the browser
				driver.manage().window().maximize();
				//To load URL
				driver.get("https://www.amazon.in");
				//Clicking the drop down
				WebElement dropElement = driver.findElementById("searchDropdownBox");
				Select sc = new Select(dropElement);
				sc.selectByVisibleText("Electronics");
				driver.findElementById("twotabsearchtextbox").sendKeys("Redmi",Keys.ENTER);
				
				WebElement findElement = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]"));
				System.out.println("The price is"+ findElement.getText());
				
				
				
				

	}
}
