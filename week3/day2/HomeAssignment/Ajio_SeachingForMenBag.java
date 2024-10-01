package week3.day2.HomeAssignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajio_SeachingForMenBag {

	public static void main(String[] args) throws InterruptedException {
		//Launching browser
		ChromeDriver driver = new ChromeDriver();
		//Maximizing the browser
		driver.manage().window().maximize();
		//Load url
		driver.get("https://www.ajio.com/");
		// Searching for bags for men
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags");
		// Using keyboard action pressing Enter
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		
		//Filtering by gender as Men
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(5000);
		//Filtering by category as Fashion bags
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		//Printing count of bag selected
		String noOfItemSelected = driver.findElement(By.xpath("//div[@class='length']//strong")).getText();
		System.out.println("Total number of bag selected is : "+ noOfItemSelected);
		
		//Printing Brand name of bag in the present page
		List<WebElement> listofbrands = driver.findElements(By.xpath("//div[@class='brand']//strong"));
		System.out.println("The bags brands are :");
		List<String> listofbrandsinArrayFrom = new ArrayList<String>();
		for(WebElement listofbrand:listofbrands) {
			String bagBrand= listofbrand.getText();
			// Printing the brand name in the Array list
			listofbrandsinArrayFrom.add(bagBrand);
			//System.out.println(bagBrand);
		}
		System.out.println(listofbrandsinArrayFrom);
		
		//Printing Bag name in the present page
		List<WebElement> listofbagnames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("The bags names are :");
		List<String> listofBagNamesinArrayFrom = new ArrayList<String>();
		for(WebElement listofbagname:listofbagnames ) {
			String bagName = listofbagname.getText();
			// Printing the bag name in the Array list
			listofBagNamesinArrayFrom.add(bagName);
		}
		System.out.println(listofBagNamesinArrayFrom);
		
		driver.close();

	}

}
