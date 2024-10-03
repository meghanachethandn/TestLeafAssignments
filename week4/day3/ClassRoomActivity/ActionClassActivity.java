package week4.day3.ClassRoomActivity;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassActivity {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// WebElement of Condition of Use sale
		WebElement conditionOfUseSale = driver.findElement(By.xpath("//a[text()=\"Conditions of Use & Sale\"]"));
		// Creating object for Action class
		Actions action = new Actions(driver);
		//Performing Scroll function to WebElement
		action.scrollToElement(conditionOfUseSale).perform();
		//Getting text 
		String textOfConditionOfUseSale = conditionOfUseSale.getText();
		System.out.println(textOfConditionOfUseSale);
		
		//Taking screen shot
		File source =driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/amazonHomePage.png");
		FileUtils.copyFile(source, dest);

	}

}
