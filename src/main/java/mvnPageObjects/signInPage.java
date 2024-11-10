package mvnPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signInPage {
	
WebDriver driver;
	
	public signInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By email = By.cssSelector("input#field-email");
	By password = By.cssSelector("input#field-password");
	By signInButton = By.id("submit-login");
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getSignInButton() {
		return driver.findElement(signInButton);
	}

}
