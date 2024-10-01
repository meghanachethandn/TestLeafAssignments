package week4.day2.ClassRoomActivity;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractingWithWebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/table.xhtml");
		
		// locate the table
		WebElement table =driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));
		
		//Count the number of rows
		List<WebElement> rows = table.findElements(By.xpath("tr"));
		// count of rows
		int rowCount =rows.size();
		System.out.println("The count of rows are :" +rowCount );
		
		//Count the number of columns
		List<WebElement> cols = table.findElements(By.xpath("th"));
		// count of rows
		int colsCount =rows.size();
		System.out.println("The count of columns are :" +colsCount );
		
		//reteriving particular row column data
		List<WebElement> secondRowData =table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[2]/td"));
		int size = secondRowData.size();
		
		for(int i=0; i<size; i++) {
			String secondRow =secondRowData.get(i).getText();
			System.out.println("The second Row data is : " +secondRow);
		}
		// Entire data in webTable
		for(int i=0;i<=rowCount;i++) {
			WebElement row =table.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td"));
			for(int j=0;j<=colsCount;j++) {
				WebElement allValues =table.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println("all values are :" + allValues.getText());
			}
		}

	}

}
