package seleniumconcept;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class ScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ZERO.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/hq");
		
		TakesScreenshot sc=(TakesScreenshot)driver;  //create variable for TakesScreenshot and passing driver into it.
		File src=sc.getScreenshotAs(OutputType.FILE); //to capture screenshot and store in to src file 
		File target=new File(System.getProperty("user.dir")+"\\screenshot\\abc1.png");     //instance create file class passing address of  
		//FileUtils.copyFile(sc.getScreenshotAs(OutputType.FILE), sc.getScreenshotAs(OutputType.FILE));
		src.renameTo(target);
		driver.quit();
		
	
		
		
	}

}
