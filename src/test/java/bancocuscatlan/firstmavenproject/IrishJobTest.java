package bancocuscatlan.firstmavenproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class IrishJobTest {

	WebDriver driver;
	SoftAssert softassert;

	@BeforeMethod
	public void getToWebsite() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\FA21617\\Desktop\\Clases Automation testing\\Dependencias\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irishjobs.ie/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Log In
		// Cookies
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#ccmgt_explicit_accept")).click();
		Thread.sleep(3000);
		// Login
		driver.findElement(By.cssSelector("button:nth-of-type(3) .hf-provider-sty999")).click();
		Thread.sleep(3000);
		// Sign in
		driver.findElement(By.cssSelector("a:nth-of-type(1)  .hf-provider-1jrodeh")).click();
		Thread.sleep(3000);
		// Credentials
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys("franartigaf15@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("IrishJobsPass01");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".login-registration-provider-1k4ab3x")).click();

	}

	@Test
	public void findJob() throws InterruptedException {

		
		
	}

}
