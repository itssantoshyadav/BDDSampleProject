package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePagestepDef {

	WebDriver driver;

	@Given("User is on Google Page")
	public void user_is_on_google_page() {
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

	}

	@When("I search Java tutorial")
	public void i_search_java_tutorial() {

		WebElement element = driver.findElement(By.id("APjFqb"));
		element.sendKeys("Java tutorial");
		element.sendKeys(Keys.ENTER);

	}

	@Then("Should display Java Tutorial releated Search Data")
	public void should_display_java_tutorial_releated_search_data() {

		Assert.assertEquals(driver.getTitle(), "Java tutorial - Google Search");
	}

}
