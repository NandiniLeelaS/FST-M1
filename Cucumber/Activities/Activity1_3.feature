package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity1_3 {
    WebDriver driver;
    WebDriverWait wait;
    Alert alert;
    @Given("^User is on the page$")
    public void setup(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }

    @When("^User clicks the Simple Alert button$")
    public void simplealertopen(){
        driver.findElement(By.xpath("//button[@id='simple']")).click();
    }
    @When("^User clicks the Confirm Alert button$")
    public void confirmalertopen(){
        driver.findElement(By.xpath("//button[@id='confirm']")).click();
    }
    @When("^User clicks the Prompt Alert button$")
    public void promptalertopen(){
        driver.findElement(By.xpath("//button[@id='prompt']")).click();
    }

    @Then("^Alert opens$")
    public void alertopen(){
        alert = driver.switchTo().alert();
    }

    @And("^Read the text from it and print it$")
    public void gettext(){
        System.out.println(alert.getText());
    }

    @And("^Close the alert$")
    public void closealert1(){
        alert.accept();
    }

    @And("^Close the alert with Cancel$")
    public void cancelalert(){
        alert.dismiss();
    }

    @And("^Write a custom message in it$")
    public void writeACustomMessageInIt() {
        alert.sendKeys("text");
    }

    @And("Close Browser")
    public void closeBrowser() {
        driver.close();
    }
}