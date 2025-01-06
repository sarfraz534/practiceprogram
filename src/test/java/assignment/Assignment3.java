package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Assignment-3
		 WebDriver driver= new ChromeDriver();
		 
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		 
		// ▪ URL: https://goo.gl/RVdKM9
		 driver.get("https://goo.gl/RVdKM9");
		// driver.manage().window().maximize();
	//	 ▪ 1) Capture the title of the page.
		String pageTitle= driver.getTitle();
		System.out.println(pageTitle);
		// ▪ 2) Capture the current URL.
		System.out.println(driver.getCurrentUrl());
		// ▪ 3) Check First Name & Last Name text boxes presence and enabled or not.
		WebElement first_name=driver.findElement(By.id("RESULT_TextField-1"));
		WebElement last_name=driver.findElement(By.id("RESULT_TextField-2"));
		if(driver.getPageSource().contains("First Name") && driver.getPageSource().contains("Last Name")){
			if(first_name.isEnabled() && last_name.isEnabled()) {
				first_name.sendKeys("sarfraz");
				last_name.sendKeys("ahmad");
			} else {
				System.out.println("first name and last name is disabled");
			}
			}
			else {
				System.out.println("first name and last name box is not present");
			}
		//phone
		WebElement phone=driver.findElement(By.id("RESULT_TextField-3"));
		if(phone.isEnabled()) {
			phone.sendKeys("1234567899");
		}else {
			System.out.println("phone text field is disabled");
		}
		//country
		WebElement country=driver.findElement(By.id("RESULT_TextField-4"));
		if(country.isEnabled()) {
			country.sendKeys("india");
		}else {
			System.out.println("country text field is disabled");
		}
		//city  RESULT_TextField-5
		WebElement city=driver.findElement(By.id("RESULT_TextField-5"));
		if(city.isEnabled()) {
			city.sendKeys("delhi");
		}else {
			System.out.println("city text field is disabled");
		}
		//email RESULT_TextField-6
		WebElement email=driver.findElement(By.id("RESULT_TextField-6"));
		if(email.isEnabled()) {
			email.sendKeys("abc@gmail.com");
		}else {
			System.out.println("email text field is disabled");
		}
		
		// ▪ 4) Select gender male/female then check the status selected or not.
		driver.findElement(By.xpath("//html")).click();
	WebElement male_gender=	mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='RESULT_RadioButton-7_0']")));
	boolean flag=male_gender.isSelected();	
		if(flag==false) {
			male_gender.click();
			}
		// days of the week
		List<WebElement> days=driver.findElements(By.xpath("//label[contains(text(),'day')]"));
		System.out.println(days.size());
		for(WebElement day:days)
		{
			
			if(day.getText().equalsIgnoreCase("Monday") ||day.getText().equalsIgnoreCase("friday"))
			{
				if(day.isSelected()==false) {
					day.click();
					System.out.println(day.getText());
				}
			}
		}
		// best time to contact from dropdown 
	WebElement contact_dropdown=driver.findElement(By.id("RESULT_RadioButton-9"));
	Select options= new Select(contact_dropdown);
	List<WebElement> listOptions=options.getOptions();
	System.out.println(listOptions.size());
	
	for(WebElement listoption:listOptions)
	{
		System.out.println(listoption.getText());
		
	}
	options.selectByVisibleText("Afternoon");
	
	//file upload
	driver.findElement(By.id("RESULT_FileUpload-10")).sendKeys("E:\\desktop");

	//submit button
	WebElement submit=driver.findElement(By.xpath("//input[@id='FSsubmit']"));
	if(submit.isEnabled()==false) {
		submit.click();
	}
		Thread.sleep(3000);
		// ▪ 5) Close browser
      driver.quit();
	}
}



