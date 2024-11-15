package bancocuscatlan.firstmavenproject;

import java.io.IOException;
import java.time.Duration;
import org.testng.asserts.SoftAssert;

import base.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMfile extends BasePage{

	
	public POMfile() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	SoftAssert softassert;
	
	@Test
	public void ejemploSoftAssertion() throws IOException, InterruptedException {
		driver = getDriver();
		driver.get(getUrl());
		
		softassert = new SoftAssert();
		WebElement tituloTestStore = driver
				.findElement(By.cssSelector("#content section:nth-child(2) .products-section-title"));

		softassert.assertEquals(tituloTestStore.getText(), "POPULAR PRODUCTS",
				"El titulo de la pagina es incorrecto");

		driver.findElement(By.cssSelector("div#_desktop_user_info")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input#field-email")));

		WebElement campoCorreo = driver.findElement(By.cssSelector("input#field-email"));
		Assert.assertTrue(campoCorreo.getText().isEmpty());
		
		Thread.sleep(3000);

		softassert.assertAll();
		
		driver.close();
		driver.quit();
	}

	public void testNgAssertion() {
		WebElement tituloTestStore = driver
				.findElement(By.cssSelector("#content section:nth-child(2) .products-section-title"));
		Assert.assertEquals(tituloTestStore.getText(), "POPULAR PRODUCTS", "El titulo de la pagina es incorrecto");
	}

	public void moreAssertionsExamples() {
		WebElement tituloTestStore = driver
				.findElement(By.cssSelector("#content section:nth-child(2) .products-section-title"));
		Assert.assertTrue(tituloTestStore.getText().contains("POPULAR"), "El titulo no contiene la palabra POPULAR");
		Assert.assertTrue(tituloTestStore.getText().startsWith("ROCK"), "El titulo no empieza con las letras ROCK");
	}

	public void verificarCampoVacio() {
		driver.findElement(By.cssSelector("div#_desktop_user_info")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input#field-email")));

		WebElement campoCorreo = driver.findElement(By.cssSelector("input#field-email"));
		Assert.assertTrue(campoCorreo.getText().isEmpty());
	}



	
	public void finalizarPrueba() {
		driver.close();
		driver.quit();
	}

}
