package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        //driver Initialization
        driver = new FirefoxDriver();
        //Open Browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    @Parameters({"username", "password"})
    public void activity(String username, String password){
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@class='ui button']")).click();
    }

    @AfterClass
    public void tearDown(){
        //close the browser
        driver.close();
    }
}