package week2.day2;

import java.util.concurrent.TimeUnit;

import org.jsoup.select.Evaluator.IsEmpty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class LearnActions {
	public static void main(String[] args) {
		// To set the driver
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				// To launch Chrome
				ChromeDriver driver = new ChromeDriver();
				// To maximize the browser
				driver.manage().window().maximize();
				//
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				// To load URL
				driver.get("https://jqueryui.com/droppable/");
				//((Object) driver).getCountOfElements();
				/*System.out.println(driver.getTitle());
				System.out.println(driver.findElementByTagName("title").getText());*/
				driver.switchTo().frame(0);
				Actions builder = new Actions(driver);
				WebElement eleDraggable = driver.findElementById("draggable");
				WebElement eleDroppable = driver.findElementById("droppable");
				
				builder.dragAndDrop(eleDraggable, eleDroppable).perform();
	}
}
