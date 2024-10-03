package week4.day2.HomeAssignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableActivity {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//From place WebElement, Clearing present text and sending MAS
		WebElement fromPlace = driver.findElement(By.id("txtStationFrom"));
		fromPlace.clear();
		fromPlace.sendKeys("MAS");
		//To place WebElement, Clearing present text and sending MDU
		WebElement toPlace = driver.findElement(By.id("txtStationTo"));
		toPlace.clear();
		toPlace.sendKeys("MDU");
		
		// un-checking the Select Date only check box
		driver.findElement(By.id("chkSelectDateOnly")).click();
		// Listing all Train names it to List
		List<WebElement> listOfTrainNames = driver.findElements(By.xpath("//div[@id='divTrainsList']//tr//td[2]/a"));
		System.out.println(listOfTrainNames.size());
		
		// Creating object for SET and sending text of Trian names... 
		Set<String> uniqueTrainNames = new HashSet<>();
		for(WebElement listOfTrainName:listOfTrainNames) {
			String trainName = listOfTrainName.getText();
			System.out.println(trainName);
			uniqueTrainNames.add(trainName);
		}
		
		// Checking both set size and List size to check for Duplicate value
		if(uniqueTrainNames.size()== listOfTrainNames.size()) {
			System.out.println("There is no duplicate train names in the Train name List");
		}else {
			System.out.println("There is duplicate train name in the Train name List");
		}
		
		driver.close();

	}

}
