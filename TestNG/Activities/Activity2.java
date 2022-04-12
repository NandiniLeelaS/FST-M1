package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        //Initialize browser
        driver = new FirefoxDriver();
        //open the URL
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test(priority = 0)
    public void getTitle(){
        String title = driver .getTitle();
        System.out.println("The title is: " +title);
        Assert.assertEquals(title, "Target Practice");
    }

    @Test(priority = 1)
    public void wrongassert(){
        String buttontext = driver.findElement(By.xpath("//button[@class='ui black button']")).getText();
        Assert.assertEquals(buttontext, "Red");
    }

    @Test(priority = 2, enabled = false)
    public void skip1(){
        String header1 = driver.findElement(By.xpath("//h1[@class='ui red header']")).getText();
        System.out.println("The first header is: " +header1);
    }

    @Test(priority = 3)
    public void skip2(){

        String condition ="Skip Test";

        if(condition.equals("Skip Test")){
            throw new SkipException("Skipping - This is not ready for testing ");
        } else {
            String header2 = driver.findElement(By.xpath("//h2[@class='ui orange header']")).getText();
            System.out.println("The second header is: " +header2);
        }
    }


    @AfterClass
    public void teardown()
    {
        //Close the browser
        driver.close();
    }
}