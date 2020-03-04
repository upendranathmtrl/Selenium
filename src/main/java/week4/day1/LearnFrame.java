package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//
		ChromeDriver driver = new ChromeDriver();
		//
		driver.manage().window().maximize();
		//
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//
		WebElement framEleId = driver.findElementById("iframeResult");
		//
		driver.switchTo().frame(framEleId);
		//
		driver.findElementByXPath("//button[text()='Try it']").click();
		//
		//	driver.switchTo().defaultContent(); //no need to switch to default because here we are not using any thing in main html
		//
		driver.switchTo().alert().sendKeys("Upendranath");
		//
		driver.switchTo().alert().accept();
		//
		WebElement textParaId = driver.findElementById("demo");
		//
		String text = textParaId.getText();
		//
		if(text.contains("Upendranath"))
			System.out.println("The name upendranath is displayed");
		else
			System.out.println("The name upendranath is not displayed");
			
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
