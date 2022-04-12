package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;
    //Create set up method
    @BeforeClass
    public void setup(){
        //driver Initialization
        driver = new FirefoxDriver();
        //Open Browser
        driver.get("https://www.training-support.net");
    }

    @Test (priority = 0)
    public void HomePage() throws InterruptedException {
        Thread.sleep(2000);
        String PageTitle = driver.getTitle();
        System.out.println("Page Title is: " +PageTitle);
        Assert.assertEquals( PageTitle ,"Training Support");
    }

    @Test (priority = 1)
    public void AboutUsPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("about-link")).click();
        String AboutUsPageTitle = driver.getTitle();
        System.out.println(AboutUsPageTitle);
        Assert.assertEquals(AboutUsPageTitle, "About Training Support");
    }
    @AfterClass
    public void tearDown(){
        //close the browser
        driver.close();
    }

    }
