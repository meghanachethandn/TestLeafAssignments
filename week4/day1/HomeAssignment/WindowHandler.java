package week4.day1.HomeAssignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Enter the username and password.
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on the Login button.
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//Click on the CRM/SFA link.
		driver.findElement(By.xpath("//div[@id='label']//a")).click();
		//Click on the Contacts button.
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//Click on Merge Contacts.
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//Click on the widget of the "From Contact".
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		// navigating to child window
		Set<String> allWindowsInSet = driver.getWindowHandles();
		//Converting to List to get index of 1 to navigate to child
		List<String> allWindowsInList = new ArrayList<String>(allWindowsInSet);
		driver.switchTo().window(allWindowsInList.get(1));
		//Click on the first resulting contact
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		driver.switchTo().window(allWindowsInList.get(0));
		//Click on the widget of the "To Contact".
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Set<String> allToWindowsInSet = driver.getWindowHandles();
		//Converting to List to get index of 1 to navigate to child
		List<String> allToWindowsInList = new ArrayList<String>(allToWindowsInSet);
		driver.switchTo().window(allToWindowsInList.get(1));
		//Click on the second resulting contact.
		driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
		driver.switchTo().window(allToWindowsInList.get(0));
		//Click on the Merge button.
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		//Accept the alert.
		driver.switchTo().alert().accept();
		//Verify the title of the page.
		String titleOfPage = driver.getTitle();
		if(titleOfPage.equals("Merge Contacts | opentaps CRM")) {
			System.out.println("Page title is proper :" +titleOfPage);
		}else {
			System.out.println("Page title is not proper :" +titleOfPage);
		}

	}

}
