package week2.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailSiteXpath {
	public static void main(String[] args) throws InterruptedException {
		// To set the driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_94.exe");

		// To launch Chrome
		ChromeDriver driver = new ChromeDriver();

		// To maximize the browser
		driver.manage().window().maximize();

		//
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// To load URL
		driver.get("https://erail.in/");
		driver.navigate().to("https://erail.in/");

		// Check "sort on date" checkbox
		WebElement eleCheckBox = driver.findElementById("chkSelectDateOnly");
		if (!eleCheckBox.isSelected())
			eleCheckBox.click();

		// From Station
		WebElement from = driver.findElementById("txtStationFrom");
		from.clear();
		from.sendKeys("MAS", Keys.ENTER);

		// To Station
		WebElement to = driver.findElementById("txtStationTo");
		to.clear();
		to.sendKeys("SBC", Keys.ENTER);

		// Creating object for whole table from DOM
		WebElement table = driver.findElementByXPath("//div[@id='divTrainsList']//table[1]");

		// Creating list object for allrows from table object
		List<WebElement> allRows = table.findElements(By.tagName("tr"));

		// Getting the size of table
		int size = allRows.size();

		// Printing the size of table
		System.out.println("The size of the table is :" + size);

		// Store Train Name in List
		List<String> trainList = new ArrayList<String>();
		for (WebElement eachRow : allRows) {
			// Creating list object for a row's table data webelement eachrow = allrows[0];
			try {
				List<WebElement> aRowAllCol = eachRow.findElements(By.tagName("td"));
				trainList.add(aRowAllCol.get(1).getText());
				// printing a table data
				// System.out.println("The train name is " + aRowAllCol.get(1).getText());
			} catch (Exception e) {
				System.out.println("th tag is handled");
				WebElement aRowAllColOfTh = eachRow.findElement(By.tagName("th"));
				System.out.println("th tag contains text: " + aRowAllColOfTh.getText());
			}
		}
		//  Print the train name
		for (String trainName : trainList) {
			System.out.println(trainName);
		}
	}
}
//Print list size
//System.out.println(trainList.size());

//Convert list to set
//Set<String> trainSet = new TreeSet<String>(trainList);

//Print Set size
//System.out.println(trainSet.size());		

/*
 * for (int i = 0; i < size-1; i++) { WebElement aRow= allRows.get(i);
 * List<WebElement> aRowAllCol = aRow.findElements(By.tagName("td"));
 * System.out.println("The train name is " + aRowAllCol.get(1).getText());
 * 
 * }
 */

/*
 * WebElement train = driver.findElement(By.xpath("//a[text()='MYSURU EXP']"));
 * System.out.println("The train name is :" + train.getText());
 * 
 * WebElement traindepart =
 * driver.findElement(By.xpath("(//td[@class='Sorted'])[5]"));
 * System.out.println("The train depart time is" +traindepart.getText());
 */