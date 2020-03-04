package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationOfTags {
	public static void main(String[] args) {
		//To set the driver
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				//To launch Chrome
				ChromeDriver driver = new ChromeDriver();
				//To maximize the browser
				driver.manage().window().maximize();
				//To load URL
				driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
				String title = driver.getTitle();
				System.out.println("The title is :"+title);
				
				System.out.println("The url is :" + driver.getCurrentUrl());
				
				System.out.println("The pagesource :"+ driver.getPageSource());
	}
}
