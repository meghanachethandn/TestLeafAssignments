package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InteractingWithAccountModule_HomeAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[@id='ext-gen601']")).click();
		driver.findElement(By.xpath("//a[@id='ext-gen853']")).click();
		driver.findElement(By.xpath("//input[@id=\"accountName\"]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("Selenium Automation Tester. ");
		
		WebElement industryDropDown = driver.findElement(By.xpath("//select[@name=\"industryEnumId\"]"));
		Select industryOption = new Select(industryDropDown);
		industryOption.selectByIndex(3);
		
		WebElement ownershipDropDown = driver.findElement(By.xpath("//select[@name=\"ownershipEnumId\"]"));
		Select ownershipOption = new Select(ownershipDropDown);
		ownershipOption.selectByVisibleText("S-Corporation");
		
		WebElement sourceDropDown = driver.findElement(By.xpath("//select[@name=\"dataSourceId\"]"));
		Select sourceOption = new Select(sourceDropDown);
		sourceOption.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marktingDropDown = driver.findElement(By.xpath("//select[@name=\"marketingCampaignId\"]"));
		Select marktingOption = new Select(marktingDropDown);
		marktingOption.selectByIndex(6);
		
		
		

	}

}
