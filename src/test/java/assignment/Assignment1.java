package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment1 {

	public static void main(String[] args) {
		// Test Case-1
		
		// 1. Open Browser
		 WebDriver driver= new ChromeDriver();	 
		 
		 //implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		// 2. Open URL  http://demo.nopcommerce.com/
		 driver.get("http://demo.nopcommerce.com/");
		// 3. Capture the title of the page
		String actual_title= driver.getTitle();
		System.out.println(actual_title);
	//	 4. Validate Title of the page.
		String Expected_Title= "nopCommerce demo store";
		if(actual_title.equals(Expected_Title))
		{
			System.out.println("test passed!");
		}
		else {
			System.out.println("test failed!");
		}
	// getCurrentPageSource of current opened page
		String currentPageSource=driver.getPageSource();
		System.out.println(currentPageSource);
		
		if(currentPageSource.contains("Featured products")) {
			System.out.println("Featured products list is displayed");
		}
		else {
			System.out.println("we are not in right page");
		}
		boolean flag=false;
		 flag=driver.findElement(By.xpath("//h2[contains(text(),'Welcome to')]")).isDisplayed();
		if(flag==true) {
			System.out.println("test is passed");
		}
		else {
			System.out.println("test failed");
		}
		//close 
		driver.quit();
		
		
		
		

	}

}
