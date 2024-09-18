package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithWebElement {

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
		driver.findElement(By.xpath("//input[@name ='submitButton']")).click();
		String leadPageTitle = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		if(leadPageTitle.equals("View Lead")) {
			System.out.println("Title dispalyed correctly : "+leadPageTitle);
		}
		else {
			System.out.println("Title dispalyed is not correctly :"+leadPageTitle);
		}
		driver.close();
	}
	

}
