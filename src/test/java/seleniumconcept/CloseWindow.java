package seleniumconcept;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CloseWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.partialLinkText("OrangeHRM")).click();
		String currentWindow=driver.getWindowHandle();
		Set<String> allwindows=driver.getWindowHandles();
		for(String window:allwindows) {
			if(!(currentWindow==window)) {
				driver.switchTo().window(window);
			}
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
