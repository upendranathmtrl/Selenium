package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

public class Vallar_FacebookApplication {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		//to launch Chrome browser.
		ChromeDriver driver1=new ChromeDriver(ops);
		
      
        driver1.manage().window().maximize();
		
        driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
        
		//open facebook.com
		driver1.get("https://www.facebook.com/");
		
		//login with user name and password
		driver1.findElement(By.xpath("//input[@id ='email']")).sendKeys("8778543236");
	    driver1.findElement(By.xpath("//input[@id ='pass']")).sendKeys("testleaf");
		
	    //clicking login button
	    driver1.findElement(By.xpath("//input[@value=\'Log In\']")).click();
		
	    //Search box
		WebElement searchButton = driver1.findElementByName("q");
		searchButton.sendKeys("TestLeaf");	
	    
		//Clicking search button
        driver1.findElementByXPath("//button[@data-testid='facebar_search_button']").click();
            
        //Checking like button
        WebElement likebutton = driver1.findElementByXPath("(//button[@type ='submit'])[2]");
        String LB = likebutton.getText();
                
                if (LB.equals("Like")) {              	
                	likebutton.click();
                	System.out.println("TestLeaf page is liked" );
					}
                else
                	 System.out.println("TestLeaf page is already liked");
        
        //checking the link name
        WebElement TestLeafLink = driver1.findElementByXPath("(//a[text()='TestLeaf'])[1]");
        String TL = TestLeafLink.getText();
                if (TL.contains("TestLeaf")){
                	System.out.println("Yes TestLeaf text is contains");
                }
                else
                	System.out.println("NO TestLeaf text is not contains");
	            
        TestLeafLink.click(); 
        
        //Checking the Page title
        WebElement titleOfPageEle = driver1.findElementByXPath("//a[@class='_64-f']//child::span");
		if(titleOfPageEle.getText().contains("TestLeaf"))
		System.out.println("The Title contains :" +titleOfPageEle.getText());
		else
		System.out.println("The Title does not contains TestLeaf");
        
        //Getting the no. of likes
	    WebElement Likes = driver1.findElementByXPath("//div[contains(text(),'people like this')]");
	    System.out.println(Likes.getText());
	}
}