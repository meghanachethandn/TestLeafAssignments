package marthon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class MobileOrdering {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev186929.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(15);
		//Clicking ALL option
		shadow.findElementByXPath("//div[text()='All']").click();
		//Selecting Service catalog
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		// Switching to frame
		WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		//clicking on Mobiles option
		driver.findElement(By.xpath("(//*[@id=\"homepage_grid\"]/tbody//table)[16]//td[2]/a")).click();
		//Clicking iPhone 13 pro
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		
		// Click Yes Radio button under broken iPhone
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		//Send 99 to Original phone number text box
		driver.findElement(By.xpath("//input[@name='IO:4afecf4e9747011021983d1e6253af34']")).sendKeys("99");
		//Select Unlimited from the dropdown in Monthly data allowance
		driver.findElement(By.xpath("//select[@name='IO:ff1f478e9747011021983d1e6253af68']")).click();
		driver.findElement(By.xpath("//select[@name='IO:ff1f478e9747011021983d1e6253af68']//option[3]")).click();
		//Update color field to SierraBlue 
		driver.findElement(By.xpath("//label[text()='Sierra Blue']")).click();
		//Update storage field to 512GB
		driver.findElement(By.xpath("//label[text()='512 GB [add $300.00]']")).click();
		//Click on Order now option
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		//
		String confirmationMessage =driver.findElement(By.xpath("//span[text()='Thank you, your request has been submitted']")).getText();
		System.out.println("Message displayed once the order is confirmed :" +confirmationMessage);
		String requestNumber = driver.findElement(By.xpath("//a[@id='requesturl']//b")).getText();
		System.out.println("Order request Number is :"+requestNumber);
		
		// taking screen shot of order placed
		File source =  driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/mobileOrder.png");
		FileUtils.copyFile(source, dest);

	}

}
