package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSearchSteps {
    WebDriver driver;
    WebDriverWait wait;
    @Given("^User is on Google Home Page$")
    public void setup(){
        //Initialize browser
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //open Google
        driver.get("https://google.com");
    }

    @When("^User types in Cheese and hits ENTER$")
    public void searchcheese(){
        //Enter Cheese in search box
        WebElement searchbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchbox.sendKeys("Cheese");
        //Hit enter
        searchbox.sendKeys(Keys.ENTER);
    }

    @Then("^Show how many search results were shown$")
    public void searchresults(){
        //Implicit wait
        wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        By stats = By.xpath("//div[@id='result-stats']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(stats));
        String statsvalue = driver.findElement(stats).getText();
        System.out.println(statsvalue);

    }

    @And("^Close the browser$")
    public void teardown(){
        driver.close();
    }
}