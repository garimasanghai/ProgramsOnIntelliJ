package VtigerPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CreateProduct extends LoginPage{
	
	public static void createproduct() throws Exception {
		
		driver.findElement(By.xpath("//a[contains(text(), 'Products')]")).click();
		driver.findElement(By.xpath("//img[@alt = 'Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys(GenericMethods.productname());
		driver.findElement(By.xpath("//img[@src ='themes/softed/images/user.PNG']")).click();
		Thread.sleep(4000);
		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.id("ondemand_sub"));
		a.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//a[contains(text() ,'Sign Out')]")).click();
}
}
