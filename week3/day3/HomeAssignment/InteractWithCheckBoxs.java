package week3.day3.HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithCheckBoxs {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Click on the "Basic Checkbox.”
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']//div[2]")).click();
		
		//Click on the "Notification Checkbox."
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']//div[2]")).click();
		
		//Verify that the expected message is displayed.
		WebElement notificationPopUp = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		if(notificationPopUp.isDisplayed()) {
			System.out.println("Notification pop ups is displayed");
		}else {
			System.out.println("Notification pop up is not displayed");
		}
		
		//Click on your favorite language (assuming it's related to checkboxes).
		driver.findElement(By.xpath("//table[@id='j_idt87:basic']//tr//td[1]/div")).click();
		
		//Click on the "Tri-State Checkbox."
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']//div[2]")).click();
		
		//Verify which tri-state option has been chosen.
		String statusOfTriStateOption = driver.findElement(By.xpath("//div[@role='alert']//div[2]//p")).getText();
		switch(statusOfTriStateOption) {
		//case 
		}
		//Click on the "Toggle Switch."
		// Verify that the expected message is displayed.
		// Verify if the Checkbox is disabled.
		// Select multiple options on the page (details may be needed).
		// Perform any additional actions or verifications required.
		// Close the web browser when done.

		

	}

}
