package marthon1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRBooking_TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		//Launching browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Maximizing the browser
		driver.manage().window().maximize();
		//Load URL
		driver.get("https://www.pvrcinemas.com/");
		Thread.sleep(30);
		
		//Selecting Cinema button
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		
		//selecting first cinema in the list
		WebElement firstCinemaName = driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//li[1]//span"));
		System.out.println("Cinema location : "+firstCinemaName.getText());
		firstCinemaName.click();
		Thread.sleep(2000);
		
		//selecting first cinema date in the list
		WebElement selectCinemaDate = driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//li[1]//span"));
		System.out.println("Cinema date :" +selectCinemaDate.getText());
		selectCinemaDate.click();
		Thread.sleep(2000);
		
		//selecting first cinema name in the list
		WebElement selectCinemaName = driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//li[1]//span"));
		System.out.println("Cinema name :" +selectCinemaName.getText());
		selectCinemaName.click();
		Thread.sleep(2000);
		
		//selecting 2nd cinema time in the list
		WebElement selectCinemaTime = driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//li[2]//span"));
		System.out.println("Cinema Time :" +selectCinemaTime.getText());
		selectCinemaTime.click();
		Thread.sleep(2000);
		
		//Clicking Book button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//accepting alert window 
		driver.findElement(By.xpath("//div[@class='accpet-btn-flow-seat']//button[2]")).click();
		driver.findElement(By.xpath("//span[@id='PR.PREMIERE|M:12']")).click();
		
		// printing Seat info
		String seatInfo = driver.findElement(By.xpath("//div[@class='seat-number']//p")).getText();
		System.out.println("Seat Information is :" +seatInfo);
		
		// clicking Proceed button
		driver.findElement(By.xpath("//div[@class='register-btn']//button")).click();
		
		// printing Grand Total amount of ticket
		Thread.sleep(2000);
		String grandTotalOfTicket = driver.findElement(By.xpath("//div[@class='all-grand']//div//h6[2]//span")).getText();
		System.out.println("The total Ticket price is :" + grandTotalOfTicket);
		
	}

}
