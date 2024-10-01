package week3.day2.List;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonListPratices_ClassRoomActivity {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Searching for phones
		WebElement searchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchField.sendKeys("phones");
		
		//clicking search button
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(5000);
		
		//Fetching list of phones elements
		List<WebElement> listOfPriceOfPhone = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int lengthofelements = listOfPriceOfPhone.size();
		
		// creating empty List
		List<String> priceofPhones = new ArrayList<String>();
		
		//iterating the list of price
		for(int i=0 ; i<lengthofelements;i++ ) {
			String prices = listOfPriceOfPhone.get(i).getText();
			priceofPhones.add(prices);
		}
		System.out.println(priceofPhones);
	}

}
