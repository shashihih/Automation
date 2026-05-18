package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class BBCSteps {

    WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("User opens BBC website")
    public void user_opens_bbc_website() {
        driver.get("https://www.bbc.com");
    }

    @When("User clicks on News link")
    public void user_clicks_on_news_link() {
        driver.findElement(By.linkText("News")).click();
    }

    @Then("Verify page title contains {string}")
    public void verify_page_title_contains(String expectedTitle) {
        String actualTitle = driver.getTitle();

        assertTrue(actualTitle.contains(expectedTitle));

        System.out.println("test pass successfully");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}