package VtigerPractice;

import org.openqa.selenium.By;

public class CreateContacts extends LoginPage{

	//static WebDriver driver =  new ChromeDriver();
	
		public static void createcontact() throws Exception {
			
			driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")).click();
			driver.findElement(By.xpath("//img[@alt = 'Create Contact...']")).click();
			driver.findElement(By.name("firstname")).sendKeys(GenericMethods.contactname());
			driver.findElement(By.name("lastname")).sendKeys(GenericMethods.contactname());
			driver.findElement(By.xpath("//input[@title ='Save [Alt+S]']")).click();
			Thread.sleep(2000);
			/*
			 * driver.findElement(By.xpath("//img[@src ='themes/softed/images/user.PNG']")).
			 * click(); Actions a = new Actions(driver); WebElement ele =
			 * driver.findElement(By.id("ondemand_sub"));
			 * a.moveToElement(ele).build().perform();
			 * driver.findElement(By.xpath("//a[contains(text() ,'Sign Out')]")).click();
			 */
		}			
}
