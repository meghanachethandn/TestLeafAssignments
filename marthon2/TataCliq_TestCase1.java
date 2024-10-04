package marthon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TataCliq_TestCase1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		// Clicking yes from confirm box
		driver.findElement(By.xpath("//button[@id='wzrk-confirm']")).click();

		// Mouse hover on brands
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions action = new Actions(driver);
		action.moveToElement(brands).perform();
		// Movse hover on watch and Accessories
		WebElement watchesAccessories = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		action.moveToElement(watchesAccessories).perform();
		// Clicking first element under "feature brands"
		driver.findElement(By.xpath("//div[@class='DesktopHeader__featureBrands']//div[2]")).click();
		
		// Select sortby: New Arrivals
		driver.findElement(By.xpath("//select[@label='Popularity']")).click();
		driver.findElement(By.xpath("//select[@label='Popularity']//option[text()='New Arrivals']")).click();
		
		// choose men from catagories filter
		driver.findElement(By.xpath("(//div[@class='FilterDesktop__newFilCheckbox'])[1]")).click();
		Thread.sleep(5000);
		// printing all price of watches
		List<WebElement> listOfWatchPrices = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class, 'ProductDescription__priceHolder')]//h3")));
		System.out.println("Count of watch searched in present page is :" +listOfWatchPrices.size());
		Thread.sleep(5000);
		List<String> watchPricesText = new ArrayList<>();
		for (WebElement listOfWatchPrice : listOfWatchPrices) {
			String watchPrice = listOfWatchPrice.getText();
			watchPricesText.add(watchPrice);
			System.out.println(watchPrice);
		}
		Thread.sleep(10000);
		//Clicking for 1st product in the list
		WebElement firstProduct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(@id, 'ProductModule')]//div//a)[1]")));
		((ChromeDriver) driver).executeScript("arguments[0].click();", firstProduct);
		
		// Handling windows
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindowsInSet = driver.getWindowHandles();
		
		// Converting to List to get index of 1 to navigate to child
		List<String> allWindowsInList = new ArrayList<String>(allWindowsInSet);
		driver.switchTo().window(allWindowsInList.get(1));
		//driver.switchTo().alert().accept();
		String firstElementPrice = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']//h3")).getText();
		System.out.println("First product price : " + firstElementPrice);
		String[] parts = firstElementPrice.split(" ");
		String price = parts[1].trim();
		//System.out.println(price);
		//Checking first product price is same as any other in the List
		for (String WatchPrice : watchPricesText) {
			if (price.equals(WatchPrice)) {
				System.out.println("First product price is equal :" +WatchPrice);
				 break;
			}
		}
		// Clicking/Adding product to bag
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		
		//Getting number of products in the bag
		WebElement bagIcon = driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']//span"));
		String bagIconCount= bagIcon.getText();
		System.out.println("Number of priduct in the bag is :" +bagIconCount);
		bagIcon.click();
		Thread.sleep(10000);
		// Taking screen shot of bag page
		File source =driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/tatacliq.png");
		FileUtils.copyFile(source, dest);
		// Closing windows
		driver.close();
		driver.switchTo().window(allWindowsInList.get(1));
		driver.switchTo().window(allWindowsInList.get(0));
	}

}
