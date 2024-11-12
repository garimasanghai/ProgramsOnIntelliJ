package VtigerPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	static WebDriver driver = new ChromeDriver();

	public static void login() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();

	}
		public static void main(String[] args) throws Exception {
		login();
		CreateOrganizations.createOrg();
		CreateLeads.createlead();
		CreateContacts.createcontact();
		CreateProduct.createproduct();
	}

}
