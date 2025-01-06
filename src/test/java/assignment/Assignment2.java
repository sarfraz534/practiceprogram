package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Test Case-2
		// 1. Open Browser
		WebDriver driver= new ChromeDriver();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// 2. Open URL  
		driver.get("https://admin-demo.nopcommerce.com/admin/");
		
		// 3. Enter username  (admin@yourstore.com )
		WebElement input_email=driver.findElement(By.xpath("//input[@id='Email']"));
		input_email.clear();
		input_email.sendKeys("admin@yourstore.com");
	//	4. Enter password    (admin)
	WebElement input_password=	driver.findElement(By.xpath("//input[@id='Password']"));
	input_password.clear();
	input_password.sendKeys("admin");
	
		// 5. Click on Log-In  
		 driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		//6. Capture the title of the page
		String actual_title= driver.getTitle();
		System.out.println("Actual title is---:  "+ actual_title);
		String expected_Title="Dashboard / nopCommerce administration";
		// 7. Validate Title of the page. 
		if(actual_title.equals(expected_Title))
		{
			System.out.println("test passed!");
		}else {
			System.out.println("test failed");
		}
		
		// get page source of current 
		
		//close
		Thread.sleep(10000);
		driver.quit();

	}

}
