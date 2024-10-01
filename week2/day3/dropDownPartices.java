package week2.day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropDownPartices {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Leaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Testing");
		//selecting by index
		WebElement sourceDropDown = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select sourceOption = new Select(sourceDropDown);
		sourceOption.selectByIndex(4);
		//selecting by value
		WebElement marketingDropDown = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		Select marketingOption = new Select(marketingDropDown);
		marketingOption.selectByValue("CATRQ_AUTOMOBILE");
		//selecting by visible text
		WebElement industryDropDown = driver.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']"));
		Select industryOption = new Select(industryDropDown);
		industryOption.selectByVisibleText("Aerospace");
		driver.findElement(By.xpath("//input[@name ='submitButton']")).click();
		driver.close();

	}

}
