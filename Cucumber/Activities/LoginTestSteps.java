package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTestSteps {
    WebDriver driver;
    WebDriverWait wait;
    @Given("^User is on Login page$")
    public void setup(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @When("^User enters username and password$")
    public void login(){
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[@class='ui button']")).click();
    }

    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void parameterlogin(String username, String password){
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@class='ui button']")).click();
    }

    @Then("^Read the page title and confirmation message$")
    public void getinfo(){
        System.out.println("Page Title is:" +driver.getTitle());
        WebElement succesmessage = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
        System.out.println("The Login message is:" +succesmessage.getText());
    }

    @And("^Close the Browser$")
    public void teardown(){
        driver.close();
    }

}