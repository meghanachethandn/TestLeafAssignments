package marthon1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusBooking_TC3 {

	public static void main(String[] args) throws InterruptedException {
		//Launch browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Load URL
		driver.get("https://www.abhibus.com/");
		
		Thread.sleep(3000);
		//Selecting from location as Banglore
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).click();
		driver.findElement(By.xpath("//li[@data-id='Bangalore']")).click();
		
		//Selecting To location as Chennai
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).click();
		driver.findElement(By.xpath("//li[@data-id='Chennai']")).click();
		
		//selecting tomorrow button
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		Thread.sleep(3000);
		
		//selecting InterCity Smart bus
		driver.findElement(By.xpath("//div[@id='scroll-element']//div[2]")).click();
		
		// printing Title of Bus
		String titleOfBus = driver.findElement(By.xpath("//div[@id='service-operator-agent-name-2229687718']//h5")).getText();
		
		//Printing SubTitle of bus
		String subTitleOfBus = driver.findElement(By.xpath("//div[@id='service-operator-agent-name-2229687718']//p")).getText();
		
		//Printing Price of Bus
		String priceOfFirstBus = driver.findElement(By.xpath("//strong[@class='h5 fare']//span[1]")).getText();
		System.out.println("Title of bus "+ titleOfBus +" Sub Title of bus" + subTitleOfBus +"Price of bus" + priceOfFirstBus);
		
		driver.findElement(By.xpath("//div[@id='service-operator-select-seat-2229687724']//button")).click();
		
		//printing Title of the page
		String titleOfPage = driver.getTitle();
		System.out.println("The title of the page is :" +titleOfPage);
		
		//browser is closed
		//driver.close();

	}

}
