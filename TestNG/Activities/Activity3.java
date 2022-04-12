package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        //Initialize browser
        driver = new FirefoxDriver();
        //open the URL
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test
    public void login(){
        //Open URL
        driver.get("https://www.training-support.net/selenium/login-form");
        //enter username and password and click Login button
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[@class='ui button']")).click();
        //Verify Confirmation message
        String successmessage = driver.findElement(By.xpath("//div[contains(text(), 'Welcome Back, admin')]")).getText();
        Assert.assertEquals(successmessage, "Welcome Back, admin");
    }

    @AfterClass
    public void teardown()
    {
        //Close the browser
        driver.close();
    }

}