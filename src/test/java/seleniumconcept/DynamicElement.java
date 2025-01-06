package seleniumconcept;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getWindowHandle());
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[contains(@class,'M6CB1c')]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
		System.out.println(options.size());
		String lastoption=options.get(options.size()-2).getText();
		System.out.println(lastoption);
		}
	}


