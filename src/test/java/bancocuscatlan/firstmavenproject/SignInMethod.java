package bancocuscatlan.firstmavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import mvnPageObjects.signInPage;


public class SignInMethod {
	
	@Test
	public void login() {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\FA21617\\Desktop\\Clases Automation testing\\Dependencias\\chromedriver-win64\\chromedriver.exe");		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://teststore.automationtesting.co.uk/index.php");
		driver.findElement(By.id("_desktop_user_info")).click();
		
		signInPage logPage = new signInPage(driver);
		
		logPage.getEmailAddress().sendKeys("franartigaf15@gmail.com");
		logPage.getPassword().sendKeys("PassWord");
		logPage.getSignInButton().click();
		
		
	}

}
