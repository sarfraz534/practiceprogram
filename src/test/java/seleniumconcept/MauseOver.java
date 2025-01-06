package seleniumconcept;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MauseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

			WebElement electronics=mywait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Electronics')]")));
	
		WebElement all=mywait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Audio')][@class='_1BJVlg _11MZbx']")));
		WebElement sound_bar=mywait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Soundbars')]")));
	
		Actions act= new Actions(driver);
		act.moveToElement(electronics).moveToElement(all).moveToElement(sound_bar).click().build().perform();
		
		WebElement speakers_header=driver.findElement(By.xpath("//a[contains(text(),'Speakers')][@class='R0cyWM']"));
		System.out.println(speakers_header.getText());
		if(speakers_header.getText().equalsIgnoreCase("Speakers"))
		{
			System.out.println("list of Spearks displayed");
		}
	
		
		driver.quit();
		
		
	}

}
