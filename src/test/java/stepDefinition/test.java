package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test {

	ChromeDriver driver;

	@Given("User is on facebook login page {string}")
	public void user_is_on_facebook_login_page(String string) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromeDriver.exe");
		driver = new ChromeDriver();
		driver.get(string);
	}

	@When("User enter Username  {string}")
	public void user_enter_username(String string) {
		driver.findElement(By.id("email")).sendKeys(string);
	}

	@And("User enter password {string}")
	public void user_enter_password(String string) throws InterruptedException {
		driver.findElement(By.id("pass")).sendKeys(string);
		Thread.sleep(3000);
	}

	@And("User click on login button")
	public void user_click_on_login_button() {
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
		// JavascriptExecutor executor = (JavascriptExecutor) driver;
		// executor.executeScript("arguments[0].click();", loginbutton);
	}

}
