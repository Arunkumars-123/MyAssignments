/*Assignment 1:Create Lead
		  1. Launch URL "http://leaftaps.com/opentaps/control/login"
		  2. Enter UserName and Password Using Id Locator
		  3. Click on Login Button using Class Locator
		  4. Click on CRM/SFA Link
		  5. Click on Leads Button
		  6. Click on Create Lead 
		  7. Enter CompanyName Field Using id Locator
		  8. Enter FirstName Field Using id Locator
		  9. Enter LastName Field Using id Locator
		  10. Enter FirstName(Local) Field Using id Locator
		  11. Enter Department Field Using any Locator of Your Choice
		  12. Enter Description Field Using any Locator of your choice 
		  13. Enter your email in the E-mail address Field using the locator of your choice
		  14. Select State/Province as NewYork Using Visible Text
		  15. Click on Create Button
                  16. Get the Title of Resulting Page. refer the video  using driver.getTitle()*/


package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadAssignment {

	public static void main(String[] args) {
	
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
        driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ARUN");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KUMAR");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ARUN");
		
		driver.findElement(By.className("inputBox")).sendKeys("yyy");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("hi Testleaf");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
	
		
		Select object = new Select(state);
		
		object.selectByVisibleText("New York");
		
	driver.findElement(By.className("smallSubmit")).click();
	
	 String title = driver.getTitle();
		
		System.out.println(title);
	
				
	
	}

}
