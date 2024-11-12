package VtigerPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CreateLeads extends LoginPage{
	
	//static WebDriver driver =  new ChromeDriver();
	
	public static void createlead() throws Exception {
		
		driver.findElement(By.xpath("//a[contains(text(), 'Leads')]")).click();
		driver.findElement(By.xpath("//img[@alt = 'Create Lead...']")).click();
		driver.findElement(By.name("firstname")).sendKeys(GenericMethods.leadname());
		driver.findElement(By.name("lastname")).sendKeys(GenericMethods.leadname());
		driver.findElement(By.name("company")).sendKeys(GenericMethods.leadname());
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
