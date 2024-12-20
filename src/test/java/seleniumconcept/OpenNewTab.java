package seleniumconcept;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		driver.quit();
	}

}
