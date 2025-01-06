package assignment;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// URL: http://automationpractice.com
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		// 1) Capture the title of the page.
		System.out.println(driver.getTitle());
		
		//▪ 2) validate alerts
		driver.findElement(By.id("alertBtn")).click();
		Alert alert=driver.switchTo().alert();
		if(alert.getText().equalsIgnoreCase("I am an alert box!"))
		{
		alert.accept();
		}
		Thread.sleep(3000);
		driver.quit();
		
	}

}
