package assignment;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Check {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		//WebElement yesbutton=driver.findElement(By.xpath("//input[@id='yesRadio']"));
		WebElement yesbutton=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='yesRadio']")));
		boolean flag=yesbutton.isSelected();
		if(flag==false)
		{
			yesbutton.click();
		}
		
		Thread.sleep(3000);
	}

}
