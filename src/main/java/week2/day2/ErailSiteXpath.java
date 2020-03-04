package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailSiteXpath {
	public static void main(String[] args) throws InterruptedException {
		// To set the driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// To launch Chrome
		ChromeDriver driver = new ChromeDriver();
		// To maximize the browser
		driver.manage().window().maximize();
		//
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// To load URL
		driver.get("https://erail.in/");
		WebElement from = driver.findElementById("txtStationFrom");
		from.clear();
		from.sendKeys("MAS", Keys.TAB);

		WebElement to = driver.findElementById("txtStationTo");
		to.clear();
		to.sendKeys("SBC", Keys.TAB);
		
		//Unchecking the sort on date checkbox
		WebElement eleCheckBox = driver.findElementById("chkSelectDateOnly");
		
		if(eleCheckBox.isSelected())
			eleCheckBox.click();
		
		//Creating object for whole table from DOM
		//WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		WebElement table = driver.findElementByClassName("DataTable TrainList TrainListHeader");
		
		//Creating list object for allrows from table object
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		//Getting the size of table
		int size = allRows.size();
		
	
		
		//Printing the size of table
		System.out.println("The size of the table is :" +size );
		
		
		
		for (WebElement eachRow : allRows) {
			
			//Creating list object for a row's table data 
			List<WebElement> aRowAllCol = eachRow.findElements(By.tagName("td"));
			
			//printing a table data
			System.out.println("The train name is " + aRowAllCol.get(1).getText());
		}
		

	}
}


/*
 * for (int i = 0; i < size-1; i++) {
 * 		 WebElement aRow= allRows.get(i);
 * 		 List<WebElement> aRowAllCol = aRow.findElements(By.tagName("td"));
 * 	    System.out.println("The train name is " + aRowAllCol.get(1).getText());
 * 
 * }
 */


/*
 * WebElement train = driver.findElement(By.xpath("//a[text()='MYSURU EXP']"));
 * System.out.println("The train name is :" + train.getText());
 * 
 * WebElement traindepart = driver.findElement(By.xpath("(//td[@class='Sorted'])[5]"));
 * System.out.println("The train depart time is" +traindepart.getText());
 */