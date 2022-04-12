package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 {
    WebDriver driver;
    @BeforeTest
    public void setup(){
        //driver Initialization
        driver = new FirefoxDriver();
        //Open Browser
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        Reporter.log("Open the url");
    }

    @Test(priority = 0)
    public void simpleAlertTestCase(){
        driver.findElement(By.xpath("//button[@class='ui inverted red button']")).click();
        Alert simplealert = driver.switchTo().alert();
        Reporter.log("Simplealert is opened");
        String text = simplealert.getText();
        System.out.println("text of SimpleAlert alert is: " +text);
        Assert.assertEquals(text, "This is a JavaScript Alert!");
        simplealert.accept();
        Reporter.log("Simplealert is closed");
    }

    @Test(priority = 1)
    public void confirmAlertTestCase(){
        driver.findElement(By.xpath("//button[@class='ui inverted blue button']")).click();
        Alert confirmalert = driver.switchTo().alert();
        Reporter.log("Confirmalert is opened");
        System.out.println("text of SimpleAlert alert is: " +confirmalert.getText());
        confirmalert.dismiss();
        Reporter.log("confirmalert is closed");
    }

    @Test(priority = 2)
    public void promptAlertTestCase(){
        driver.findElement(By.xpath("//button[@class='ui inverted green button']")).click();
        Reporter.log("promptalert is opened");
        Alert promptalert = driver.switchTo().alert();
        System.out.println("text of SimpleAlert alert is: " +promptalert.getText());
        promptalert.sendKeys("test");
        promptalert.accept();
        Reporter.log("promptalert is closed");
    }

    @BeforeMethod
    public void switchbackalert(){
        driver.switchTo().defaultContent();
        Reporter.log("Switch back to default content");
    }

    @AfterTest
    public void teardown(){
        //close the browser
        driver.close();
        Reporter.log("browser is closing");
    }
}