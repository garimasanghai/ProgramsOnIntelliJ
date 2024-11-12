package VtigerPractice;

import org.openqa.selenium.By;

public class CreateOpportunities extends LoginPage {
	
	public static void createOpportunity() {
		
		driver.findElement(By.xpath("//a[contains(text(), 'Opportunities')]))")).click();
		driver.findElement(By.xpath("//img[@alt = 'Create Contact...']")).click();
		driver.findElement(By.name("potentialname")).sendKeys(GenericMethods.opportunityname());
	}

}
