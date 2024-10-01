package week4.day1.ClassRoomActivity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		//Switching to frame by ID
		driver.switchTo().frame("iframeResult");
		
		// Clicking try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//Handling alert, getting text in the alert
		String alertPopUpMessage =driver.switchTo().alert().getText();
		System.out.println("Text message of alert window :" +alertPopUpMessage);
		
		//Accepting alert
		driver.switchTo().alert().accept();
		
		// After clicking ok button validating the text
		String alertMessage = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if(alertMessage.equals("You pressed OK!")) {
			System.out.println("The action performed on the alert is proper, and alert is :" +alertMessage);
		}else {
			System.out.println("The action performed on the alert is not proper, and alert is :" +alertMessage);
		}
		driver.close();
	}

}
