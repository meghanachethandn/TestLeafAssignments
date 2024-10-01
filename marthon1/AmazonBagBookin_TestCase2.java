package marthon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonBagBookin_TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		//Launching browser
		ChromeDriver driver = new ChromeDriver();
		// Maximizing the browser
		driver.manage().window().maximize();
		//Load url
		driver.get("https://www.amazon.in/");
		//implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Searching for bags for boys
		WebElement searchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchField.sendKeys("bags for boys");
		Thread.sleep(3000);
		// Selecting first element in list 
		Actions action = new Actions(driver);
		action.sendKeys(searchField,Keys.DOWN).sendKeys(Keys.ENTER).perform();
		
		// Printing number of search element
		String resultText =driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
		String totalResults = resultText.split("of")[1].split("results")[0].trim();
		System.out.println("Total Results is :"+ totalResults);
		
		//Selecting first Brand
		driver.findElement(By.xpath("//*[@id=\"p_123/648962\"]/span/a/div/label/i")).click();
		
		//Selecting Second Brand
		driver.findElement(By.xpath("//*[@id=\"p_123/418063\"]/span/a/div/label/i")).click();
		
		//selecting newest arrival of brand selected
		WebElement sortDropDown = driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
		Select sortOption = new Select(sortDropDown);
		sortOption.selectByIndex(4);		
		
		//Printing bag info and bag price
		String bagInfo = driver.findElement(By.xpath("//a[contains(@class,'a-link-normal s-underline-text')]//span[1]")).getText();
		String bagPrice =driver.findElement(By.xpath("//a[contains(@class,'a-link-normal s-no-hover s-underline-text')] //span[2]")).getText();
		System.out.println("Bag details is :" + bagInfo +"bag price is : " + bagPrice);
		
		//printing title of the page
		String pageTitle = driver.getTitle();
		System.out.println("The page Tile is :"+pageTitle);
		
		// closing driver 
		driver.close();

		

	}

}
