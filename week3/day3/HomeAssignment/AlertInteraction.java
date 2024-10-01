package week3.day3.HomeAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInteraction {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']//span[@class='ui-button-text ui-c']")).click();
		//driver.switchTo().alert().accept();
		Thread.sleep(10000);
		driver.switchTo().alert().sendKeys("Hi Hello");
		
		

	}

}
